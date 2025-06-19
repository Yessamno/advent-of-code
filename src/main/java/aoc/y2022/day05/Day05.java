package aoc.y2022.day05;

import aoc.Day;

import java.util.ArrayList;
import java.util.List;

import java.util.Stack;

public class Day05 extends Day {
    static {
        currentDay = buildCurrentDay(new Object() {
        });
    }

    @Override
    public String part1(List<String> input) {
        List<Stack<String>> stacks = new ArrayList<>();
        int numberLineIndex = input.indexOf("") - 1;
        int stackBottomLineIndex = input.indexOf("") - 2;
        String numberLine = input.get(numberLineIndex);
        int noOfStacks = Integer.parseInt(numberLine.substring(numberLine.length()-1 ));

        for(int stackIndex = 0; stackIndex < noOfStacks; stackIndex++) {
            int subStartIndex = stackIndex * 4 + 1;
            int subEndIndex = stackIndex * 4 + 2;
            Stack<String> currentStack = new Stack<>();
            stacks.add(currentStack);


            for (int currentLineIndex = stackBottomLineIndex; currentLineIndex >= 0; currentLineIndex--) {
                String wholeLine = input.get(currentLineIndex);
                currentStack.push(wholeLine.substring(subStartIndex, subEndIndex));

            }

        }
        StringBuilder result = new StringBuilder();
        for(Stack<String> currentStack : stacks){
            result.append(currentStack.peek());

        }
        return result.toString();

    }

    @Override
    public String part2(List<String> input) {
        return "";
    }
}
