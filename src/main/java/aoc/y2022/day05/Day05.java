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

            //The current going from the bottom of the stacks to the top
            List<String> lines = input.subList(0,stackBottomLineIndex+1).reversed();

            for (String wholeRow: lines) {
                String itemFromCurrentStack = wholeRow.substring(subStartIndex, subEndIndex);

                if(!itemFromCurrentStack.equals(" ")) {
                    currentStack.push(itemFromCurrentStack);
                }
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
