package aoc.y2022.day04;

import aoc.Day;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class day04 extends Day {

    static {
        currentDay = buildCurrentDay(new Object() {
        });
    }

    @Override
    public String part1(List<String> input) {

        int fullyContainedPairs = 0;

        for (String section : input) {
            Ranges ranges = generateRanges(section);
            if (ranges.first().containsAll(ranges.second()) || ranges.second().containsAll(ranges.first())) {
                fullyContainedPairs++;
            }
        }

        return String.valueOf(fullyContainedPairs);

    }

    private Ranges generateRanges(String section) {
        String[] ranges = section.split(",");
        List<Integer> firstRange = expandNumbers(ranges[0]);
        List<Integer> secondRange = expandNumbers(ranges[1]);

        HashSet<Integer> first = new HashSet<>(firstRange);
        HashSet<Integer> second = new HashSet<>(secondRange);
        Ranges result = new Ranges(first, second);
        return result;
    }

    private record Ranges(HashSet<Integer> first, HashSet<Integer> second) {
    }

    public List<Integer> expandNumbers(String range) {
        String[] bounds = range.split("-");
        int start = Integer.parseInt(bounds[0]);
        int end = Integer.parseInt(bounds[1]);

        List<Integer> expanded = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            expanded.add(i);
        }

        return expanded;
    }


    @Override
    public String part2(List<String> input) {

        int overlappingPairs = 0;

        for (String section : input) {
            String[] ranges = section.split(",");
            List<Integer> firstRange = expandNumbers(ranges[0]);
            List<Integer> secondRange = expandNumbers(ranges[1]);

            HashSet<Integer> first = new HashSet<>(firstRange);
            HashSet<Integer> second = new HashSet<>(secondRange);

            first.retainAll(second);

            if (!first.isEmpty()) {
                overlappingPairs++;
            }
        }

        return String.valueOf(overlappingPairs);
    }
}
