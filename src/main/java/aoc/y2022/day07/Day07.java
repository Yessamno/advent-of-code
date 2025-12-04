package aoc.y2022.day07;

import aoc.Day;

import java.util.List;

public class Day07 extends Day {
    static {
        currentDay = buildCurrentDay(new Object() {
        });
    }

    @Override
    public String part1(List<String> input) {
        int dirSize = 0;

        for(String itemInList: input){

            if( !itemInList.startsWith("$")){
                int fileSize = Integer.parseInt(itemInList.split(" ")[0]);
                dirSize += fileSize;
            }
        }

        if(dirSize >= 100_000){
            return "0";
        }
        return String.valueOf(dirSize);
    }

    @Override
    public String part2(List<String> input) {
        return "";
    }
}
