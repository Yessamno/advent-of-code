package aoc.y2022.day06;
import aoc.Day;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Day06 extends Day{

    static {
        currentDay = buildCurrentDay(new Object() {
        });
    }

    @Override
    public String part1(List<String> input) {
        String buffer = input.getFirst();
        int windowSize = 4;
        return getStart(windowSize, buffer);
    }

    private static String getStart(int windowSize, String buffer) {
        for (int i = windowSize; i<= buffer.length() - 3 ; i++){
            String chunk = buffer.substring(i - windowSize, i);

            Set<Character> seen = new HashSet<>();
            for(char c: chunk.toCharArray()){
                seen.add(c);
            }
            if(seen.size() == windowSize){
                return Integer.toString(i);
            }

        }
        throw new IllegalStateException("No start found");
    }

    @Override
    public String part2(List<String> input) {
        String buffer = input.getFirst();
        int windowSize = 14;
        return getStart(windowSize, buffer);
    }
}
