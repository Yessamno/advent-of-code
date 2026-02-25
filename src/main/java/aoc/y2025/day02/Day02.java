package aoc.y2025.day02;

import aoc.Day;

import java.util.List;
import java.util.function.Predicate;

public class Day02 extends Day {

    static {
        currentDay = buildCurrentDay(new Object() {
        });
    }

    @Override
    public String part1(List<String> input) {
        PartOnePredicate predicate = new PartOnePredicate();
        return sumBadIdentifiers(input, predicate);
    }

    @Override
    public String part2(List<String> input) {
        PartTwoPredicate predicate = new PartTwoPredicate();
        return sumBadIdentifiers(input, predicate);
    }

    private static String sumBadIdentifiers(List<String> input, Predicate<Long> predicate) {
        long sum = 0;

        for (String line : input) {
            if (line.isBlank()) continue;
            String[] ranges = line.split(",");

            for (String range : ranges) {
                String[] parts = range.split("-");
                long rangeStart = Long.parseLong(parts[0]);
                long rangeEnd = Long.parseLong(parts[1]);

                for (long current = rangeStart; current <= rangeEnd; current++) {
                    if (predicate.test(current)) {
                        sum += current;
                    }
                }
            }
        }
        return String.valueOf(sum);
    }

    /**
     * Part 1: Invalid if made of some sequence repeated exactly TWICE.
     * This implies the length must be even.
     */
    static class PartOnePredicate implements Predicate<Long> {
        @Override
        public boolean test(Long start) {
            String s = String.valueOf(start);
            int len = s.length();
            if (len % 2 != 0) return false;

            String firstHalf = s.substring(0, len / 2);
            String secondHalf = s.substring(len / 2);
            return firstHalf.equals(secondHalf);
        }
    }

    /**
     * Part 2: Invalid if made of some sequence repeated AT LEAST twice.
     * (e.g., twice, three times, five times, etc.)
     */
    static class PartTwoPredicate implements Predicate<Long> {
        @Override
        public boolean test(Long start) {
            String s = String.valueOf(start);
            int totalLen = s.length();

            // Try every possible repeating unit length
            for (int unitLen = 1; unitLen <= totalLen / 2; unitLen++) {
                // If the unit length doesn't divide the total length, it can't be a perfect repeat
                if (totalLen % unitLen == 0) {
                    String unit = s.substring(0, unitLen);
                    boolean allMatch = true;

                    // Check if all subsequent blocks match the first unit
                    for (int j = unitLen; j < totalLen; j += unitLen) {
                        if (!s.substring(j, j + unitLen).equals(unit)) {
                            allMatch = false;
                            break;
                        }
                    }

                    if (allMatch) return true;
                }
            }
            return false;
        }
    }
}
