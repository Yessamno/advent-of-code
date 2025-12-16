package aoc.y2025.day01;

import aoc.Day;

import java.util.List;

public class Day01 extends Day {

    public static final int START_POSITION = 50;

    static {
        currentDay = buildCurrentDay(new Object() {});
    }

    @Override
    public String part1(List<String> input) {


        //L = subtract
        //R = add
        int amountOfZeros = 0;
        int currentPosition = START_POSITION;
        for (String instruction : input) {
            String direction = instruction.substring(0, 1);

            int digits = Integer.parseInt(instruction.substring(1));
            if (direction.equals("L")) {
                currentPosition -= digits;
            } else {
                currentPosition += digits;
            }
            currentPosition%=100;
            if (currentPosition == 0) {
                amountOfZeros++;
            }
        }

        return String.valueOf(amountOfZeros);
    }

    @Override
    public String part2(List<String> input) {
        //L = subtract
        //R = add
        int amountOfZeros = 0;
        int currentPosition = START_POSITION;
        for (String instruction : input) {
            String direction = instruction.substring(0, 1);
            int previousPosition = currentPosition;
            int digits = Integer.parseInt(instruction.substring(1));
            if (direction.equals("L")) {
                currentPosition -= digits;

                while (currentPosition < 0) {
                    currentPosition += 100;
                    if(previousPosition!=0 && currentPosition != 0){
                        amountOfZeros++;
                    }
                }


            } else {
                currentPosition += digits;

                while (currentPosition > 99) {
                    currentPosition -= 100;
                    if(previousPosition != 0 && currentPosition != 0){
                        amountOfZeros++;
                    }
                }

            }
            if (currentPosition == 0) {
                amountOfZeros++;
            }
        }

        return String.valueOf(amountOfZeros);
    }


}
