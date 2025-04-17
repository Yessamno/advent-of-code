package aoc.day01;

import aoc.Day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Day01 extends Day {

    static {
        currentDay = buildCurrentDay(new Object() {});
    }

    @Override
    public String part1(List<String> input) {
        List<Integer> elves = countCalories(input);

        return Integer.toString(elves.getFirst());
    }

    private static List<Integer> countCalories(List<String> input) {
        List<Integer> elves = new ArrayList<>();

        int sumOfCal = 0;
        for(String element : input) {
            if(element.isEmpty()){
                elves.add(sumOfCal);
                sumOfCal = 0;
            }else{
                sumOfCal += Integer.parseInt(element);
            }

        }
        elves.add(sumOfCal);
        // Descending
        elves.sort(Comparator.reverseOrder());
        return elves;
    }

    @Override
    public String part2(List<String> input) {
        List<Integer> elves = countCalories(input);
        return Integer.toString(
            elves.get(0)
                + elves.get(1)
                + elves.get(2)
        );
    }
}
