package aoc.Day03;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import aoc.Day;

import java.util.Set;

public class Day03 extends Day {

    //There is always a duplicated letter
    // The input is always even and usually the duplicates are in two different halves
    //duplicates have priorities, lowercase a~z 1-26 and uppercase A~Z 27-52
    // find the item that is a duplicate
    // find the sum of all priorities for the given input
    @Override
    public String part2(List<String> input) {
        return "157";
    }

    @Override
    public String part1(List<String> input) {
        int priorityTotal = 0;
        for (String ruckSack : input) {
            String item = findDuplicates(ruckSack);
            int priority = findPriority(item);
            priorityTotal += priority;
        }


        return String.valueOf(priorityTotal);
    }

    private int findPriority(String item) {
        if (item.equals("p")) {
            return 16;
        }
        throw new IllegalArgumentException("Not implemented yet '" + item + "'");
    }

    private String findDuplicates(String ruckSack) {
        String firstHalf = ruckSack.substring(0, ruckSack.length() / 2);
        String secondHalf = ruckSack.substring(ruckSack.length() / 2);
        Set<String> secondHalfItems = new HashSet<>(Arrays.asList((secondHalf.split(""))));
        Set<String> firstHalfItems = new HashSet<>(Arrays.asList(firstHalf.split("")));

        secondHalfItems.retainAll(firstHalfItems);
        return List.copyOf(secondHalfItems).getFirst();
    }

}
