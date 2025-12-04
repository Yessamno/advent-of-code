package aoc.y2025.day01;

import aoc.Day;

import java.util.List;

public class Day01 extends Day {

    @Override
    public String part1(List<String> input) {
        //L = subtract
        //R = add
        int startPosition = 50;
        int amountOfZeros = 0;
        int currentPosition = startPosition;
        for (String instruction : input) {
            String direction = instruction.substring(0, 1);

            int digits = Integer.parseInt(instruction.substring(1));

            currentPosition -= digits;
            if (currentPosition == 0) {
                amountOfZeros ++;
            }
            while(currentPosition < 0){
                currentPosition += 100;
                amountOfZeros ++;

            }

//            else if(currentPosition > 99){
//                currentPosition -= 100;
//                  amountOfZeros ++;
//            }

        }

        return String.valueOf(amountOfZeros);
    }

    @Override
    public String part2(List<String> input) {
        return "";
    }

}
