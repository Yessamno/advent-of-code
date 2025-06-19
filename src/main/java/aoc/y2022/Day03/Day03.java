package aoc.y2022.Day03;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import aoc.Day;

import java.util.Set;

public class Day03 extends Day {

    static {
        currentDay = buildCurrentDay(new Object() {
        });
    }

    private int priorityTotal;

    //There is always a duplicated letter
    // The input is always even and usually the duplicates are in two different halves
    //duplicates have priorities, lowercase a~z 1-26 and uppercase A~Z 27-52
    // find the item that is a duplicate
    // find the sum of all priorities for the given input
    @Override
    public String part1(List<String> input) {
        priorityTotal = 0;
        for (String ruckSack : input) {
            String item = findDuplicates(ruckSack);
            int priority = findPriority(item);
            priorityTotal += priority;
        }

        return String.valueOf(priorityTotal);
    }




    private int findPriority(String item) {
        int itemCodepoint = Character.codePointAt(item, 0);
        if( Character.isLowerCase(itemCodepoint) ) {
            return itemCodepoint - Character.codePointAt("a", 0) + 1;
        } else{
            return itemCodepoint - Character.codePointAt("A", 0) + 27;
        }

    }

    private String findDuplicates(String ruckSack) {
        Set<String> secondHalfItems =
            setOfCharacters(ruckSack.substring(ruckSack.length() / 2));
        Set<String> firstHalfItems =
            setOfCharacters(ruckSack.substring(0, ruckSack.length() / 2));

        secondHalfItems.retainAll(firstHalfItems);
        return List.copyOf(secondHalfItems).getFirst();
    }

    private static HashSet<String> setOfCharacters(String compartment) {
        return new HashSet<>(Arrays.asList((compartment.split(""))));
    }
    @Override
    public String part2(List<String> input) {
        int secondPriorityTotal = 0;
        for( int i = 0; i< input.size(); i+=3){
            Set<String> firstGroup = setOfCharacters(input.get(i));
            Set<String> secondGroup = setOfCharacters(input.get(i+1));
            Set<String> thirdGroup = setOfCharacters(input.get(i+2));

            firstGroup.retainAll(secondGroup);
            firstGroup.retainAll(thirdGroup);

            String commonChar = List.copyOf(firstGroup).getFirst();
            secondPriorityTotal += findPriority(commonChar);
        }
        return String.valueOf(secondPriorityTotal);
    }
}



