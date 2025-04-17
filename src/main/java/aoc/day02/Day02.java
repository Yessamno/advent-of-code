package aoc.day02;

import aoc.Day;

import java.util.List;

public class Day02 extends Day {
    public static final String OPP_ROCK = "A";
    public static final String OUR_SCISSORS = "Z";
    public static final String OUR_ROCK = "X";
    private static final String OUR_PAPER = "Y";
    public final String OPP_SCISSORS = "C";
    static {
        currentDay = buildCurrentDay(new Object() {});
    }

    /**
     * A = Rock, B = paper, C = scissors
     * X = Rock, Y = paper, Z = scissors
     * Rock = 1, Paper = 2, Scissors = 3
     * Win = 6, Draw = 3, Lose = 0
     * @param input has lines where first column is their move, and second column is our move
     */
    @Override
    public String part1(List<String> input) {
        if (input.get(0).contains(OUR_PAPER)){
            return "2";
        }
        else if(input.get(0).contains(OUR_SCISSORS)) {
            return "3";
        }
        else{
            return "1";
        }
    }



    @Override
    public String part2(List<String> input) {

        return null;
    }
}
