package aoc.day05;

import aoc.Day;

import java.util.List;

import java.util.Stack;

public class Day05 extends Day {
    static {
        currentDay = buildCurrentDay(new Object() {
        });
    }

    @Override
    public String part1(List<String> input) {
        Stack<String> firstStack = new Stack<>();
        int start = input.indexOf("");
        String numberLine = input.get(start - 1);
        int noOfStacks = Integer.parseInt(numberLine.substring(numberLine.length()-1 ));
        for(int stackIndex = 0; stackIndex < noOfStacks; stackIndex++) {
            int subStartIndex = stackIndex * 4 + 1;
            int subEndIndex = stackIndex * 4 + 2;

            for (int i = start - 2; i >= 0; i--) {
                firstStack.push(input.get(i).substring(subStartIndex, subEndIndex));

            }

        }

        return firstStack.peek();

    }

    @Override
    public String part2(List<String> input) {
        return "";
    }
}
