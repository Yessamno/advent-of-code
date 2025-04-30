package aoc.day02;

import aoc.Day;

import java.util.List;

public class Day02 extends Day {
    public static final String OPP_ROCK = "A";
    public static final String OUR_SCISSORS = "Z";
    public static final String OUR_ROCK = "X";
    public static final String OUR_PAPER = "Y";
    public static final String OPP_PAPER = "B";
    public static final String OPP_SCISSORS = "C";

    static {
        currentDay = buildCurrentDay(new Object() {
        });
    }

    /**
     * A = Rock, B = paper, C = scissors
     * X = Rock, Y = paper, Z = scissors
     * Rock = 1, Paper = 2, Scissors = 3
     * Win = 6, Draw = 3, Lose = 0
     *
     * @param input has lines where first column is their move, and second column is our move
     */
    @Override
    public String part1(List<String> input) {
        String game = input.get(0);
        String ourMove = findMove(game.split(" ")[1]);
        String theirMove = findMove(game.split(" ")[0]);
        int score = resultScore(ourMove, theirMove) + moveScore(ourMove);
        return String.valueOf(score);
    }

    private static int moveScore(String ourMove) {
        return switch (ourMove) {
            case "Scissors" -> 3;
            case "Rock" -> 1;
            case "Paper" -> 2;
            default -> 0;
        };
    }

    private String findMove(String moveLetter) {
        return switch (moveLetter) {
            case "X", "A" -> "Rock";
            case "Y", "B" -> "Paper";
            case "Z", "C" -> "Scissors";
            default -> throw new IllegalArgumentException("Unexpected Value " + moveLetter);
        };
    }

    private int resultScore(String ourMove, String theirMove) {
        if(ourMove.equals(theirMove)){
            return 3;
        }
        return 0;
    }


    @Override
    public String part2(List<String> input) {

        return null;
    }
}
