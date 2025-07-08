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
        int noOfStacks = getNoOfStacks(input, numberLineIndex);

        //The current line going from the bottom of the stacks to the top
        List<String> lines = input.subList(0,stackBottomLineIndex+1).reversed();
        populateStacks(noOfStacks, stacks, lines);

        List<String> instructions = input.subList(numberLineIndex + 2, input.size());
        takeInstructions(stacks, instructions);

        StringBuilder result = new StringBuilder();
        for(Stack<String> currentStack : stacks){
            result.append(currentStack.peek());
        }
        return result.toString();
    }

    private static int getNoOfStacks(List<String> input, int numberLineIndex) {
        String numberLine = input.get(numberLineIndex);
        return Integer.parseInt(numberLine.substring(numberLine.length()-1 ));
    }

    private static void populateStacks(int noOfStacks, List<Stack<String>> stacks, List<String> lines) {
        for(int stackIndex = 0; stackIndex < noOfStacks; stackIndex++) {
            int subStartIndex = stackIndex * 4 + 1;
            int subEndIndex = stackIndex * 4 + 2;
            Stack<String> currentStack = new Stack<>();
            stacks.add(currentStack);

            for (String wholeRow: lines) {
                String itemFromCurrentStack = wholeRow.substring(subStartIndex, subEndIndex);

                if(!itemFromCurrentStack.equals(" ")) {
                    currentStack.push(itemFromCurrentStack);
                }
            }

        }
    }

    private static void takeInstructions(List<Stack<String>> stacks, List<String> instructions) {

        for(String instruction : instructions){

            String[] tokens = instruction.split(" ");
            int itemsToMove = Integer.parseInt(tokens[1]);

            Stack<String>sourceStack = stacks.get(Integer.parseInt(tokens[3]) - 1);
            Stack<String>targetStack = stacks.get(Integer.parseInt(tokens[5]) - 1);

            while(itemsToMove-- > 0) {
                targetStack.push(sourceStack.pop());
            }
        }
    }


    @Override
    public String part2(List<String> input) {
        return "";
    }
}
