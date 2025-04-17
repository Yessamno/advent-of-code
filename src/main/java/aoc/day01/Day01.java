package aoc.day01;

import aoc.Day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day01 extends Day {

    static {
        currentDay = buildCurrentDay(new Object() {});
    }

    @Override
    public String part1(List<String> input) {
        int sumOfCal = 0;
        List<Integer> elves = new ArrayList<>();

        for(String element : input) {
            if(element.isEmpty()){
                elves.add(sumOfCal);
                sumOfCal = 0;
            }else{
                sumOfCal += Integer.parseInt(element);
            }

        }
        elves.add(sumOfCal);
        Collections.sort(elves);

        return Integer.toString(elves.getLast());
    }




    @Override
    public String part2(List<String> input) {
        return input.isEmpty() ? "" : input.get(0);
    }

}
