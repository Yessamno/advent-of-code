package aoc.y2025.day02;

import aoc.Day;

import java.util.List;

public class Day02 extends Day {

    static {
        currentDay = buildCurrentDay(new Object() {
        });
    }

    @Override
    public String part1(List<String> input) {
        long sum = 0;

        for (String line : input) {
            String[] ranges = line.split(",");

            for (String range : ranges) {

                long rangeStart = Long.parseLong(range.split("-")[0]);
                long rangeEnd = Long.parseLong(range.split("-")[1]);

                for (long start = rangeStart; start <= rangeEnd; start++) {
                    String currentNumber = String.valueOf(start);
                    String firstHalf = currentNumber.substring(0, currentNumber.length() / 2);
                    String secondHalf = currentNumber.substring(currentNumber.length() / 2);
                    if (firstHalf.equals(secondHalf)) {
                        sum += start;
                    }
                }
            }

        }
        return String.valueOf(sum);
    }

    @Override
    public String part2(List<String> input) {
        return "";
    }
}

