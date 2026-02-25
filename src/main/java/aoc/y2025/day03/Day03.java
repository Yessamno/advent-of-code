package aoc.y2025.day03;

import aoc.Day;

import java.math.BigInteger;
import java.util.List;

public class Day03 extends Day {

    static {
        currentDay = buildCurrentDay(new Object() {
        });
    }

    @Override
    public String part1(List<String> input) {
        long total = 0;
        for (String bank : input) {
            if (bank.isBlank()) continue;
            total += findMaxJoltage(bank, 2);
        }
        return String.valueOf(total);
    }

    @Override
    public String part2(List<String> input) {
        BigInteger total = BigInteger.ZERO;
        for (String bank : input) {
            if (bank.isBlank()) continue;
            String maxJoltage = findMaxJoltageString(bank, 12);
            total = total.add(new BigInteger(maxJoltage));
        }
        return total.toString();
    }

    private String findMaxJoltageString(String bank, int k) {
        StringBuilder result = new StringBuilder();
        int startScan = 0;

        for (int i = 0; i < k; i++) {
            int bestDigit = -1;
            int bestIndex = -1;


            int endScan = bank.length() - (k - i);

            for (int j = startScan; j <= endScan; j++) {
                int currentDigit = bank.charAt(j) - '0';
                if (currentDigit > bestDigit) {
                    bestDigit = currentDigit;
                    bestIndex = j;
                    if (bestDigit == 9) break;
                }
            }
            result.append(bestDigit);
            startScan = bestIndex + 1;
        }
        return result.toString();
    }

    private long findMaxJoltage(String bank, int k) {
        return Long.parseLong(findMaxJoltageString(bank, k));
    }
}
