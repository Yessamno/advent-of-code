package aoc.y2022.day05;

import aoc.Day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.Stack;

public class Day05 extends Day {
    static {
        currentDay = buildCurrentDay(new Object() {
        });
    }

    @Override
    public String part1(List<String> input) {

        Yard yard = initialiseFromInput(input);
        crane9001(yard.stacks(), yard.instructions(), false);

        return readTops(yard);
    }

    private static String readTops(Yard yard) {
        StringBuilder result = new StringBuilder();
        for (Stack<String> currentStack : yard.stacks()) {
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
                if(subEndIndex <= wholeRow.length() - 1) {
                    String itemFromCurrentStack = wholeRow.substring(subStartIndex, subEndIndex);


                    if(!itemFromCurrentStack.equals(" ")) {
                        currentStack.push(itemFromCurrentStack);
                    }
                }


            }

        }
    }



    private static void crane9001(List<Stack<String>> stacks, List<String> instructions, boolean retainOrder) {

        for(String instruction : instructions){

            String[] tokens = instruction.split(" ");
            List<String> items = pickupCrates(stacks.get(Integer.parseInt(tokens[3]) - 1), Integer.parseInt(tokens[1]));
            if (retainOrder) {
                Collections.reverse(items);
            }
            dropCrates(stacks, tokens, items);

        }
    }
    private static List<String> pickupCrates(Stack<String> sourceStack, int itemsToMove) {
        List<String> items = new ArrayList<>();

        while(itemsToMove-- > 0) {
            items.add(sourceStack.pop());

        }
        return items;
    }

    private static void dropCrates(List<Stack<String>> stacks, String[] tokens, List<String> items) {
        Stack<String>targetStack = stacks.get(Integer.parseInt(tokens[5]) - 1);
        for(String crates : items){
            targetStack.push(crates);
        }
    }


    @Override
    public String part2(List<String> input) {
        Yard yard = initialiseFromInput(input);
        crane9001(yard.stacks(), yard.instructions(), true);

        return readTops(yard);
    }

    private static Yard initialiseFromInput(List<String> input) {
        List<Stack<String>> stacks = new ArrayList<>();
        int numberLineIndex = input.indexOf("") - 1;
        int stackBottomLineIndex = input.indexOf("") - 2;
        int noOfStacks = getNoOfStacks(input, numberLineIndex);

        //The current line going from the bottom of the stacks to the top
        List<String> lines = input.subList(0,stackBottomLineIndex+1).reversed();
        populateStacks(noOfStacks, stacks, lines);

        List<String> instructions = input.subList(numberLineIndex + 2, input.size());
        Yard yard = new Yard(stacks, instructions);
        return yard;
    }

    private record Yard(List<Stack<String>> stacks, List<String> instructions) {
    }


}
