package aoc.y2025.day03;

import aoc.Day;

import java.util.List;

public class Day03 extends Day {

    static {
        currentDay = buildCurrentDay(new Object() {
        });
    }

    @Override
    public String part1(List<String> input) {
        long totalJoltage = 0;

        for (String bank : input) {
            if (bank.isBlank()) continue;
            totalJoltage += findMaxJoltage(bank);
        }

        return String.valueOf(totalJoltage);
    }

    private int findMaxJoltage(String bank) {
        int maxFound = 0;
        char[] digits = bank.toCharArray();

        // We need at least two batteries to form a joltage
        for (int i = 0; i < digits.length - 1; i++) {
            int d1 = Character.getNumericValue(digits[i]);

            // Optimization: If we already found a max that starts with a digit
            // higher than this one, don't bother checking inner loop.
            if (d1 * 10 + 9 <= maxFound) continue;

            for (int j = i + 1; j < digits.length; j++) {
                int d2 = Character.getNumericValue(digits[j]);
                int currentJoltage = d1 * 10 + d2;

                if (currentJoltage > maxFound) {
                    maxFound = currentJoltage;
                }
            }
        }
        return maxFound;
    }

    @Override
    public String part2(List<String> input) {
        // Part 2 logic will go here once unlocked!
        return "";
    }
}
