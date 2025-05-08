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
    public static final int WIN_SCORE = 6;
    public static final int DRAW_SCORE = 3;
    public static final int LOSE_SCORE = 0;
    public static final String ROCK = "Rock";
    public static final String PAPER = "Paper";
    public static final String SCISSORS = "Scissors";
    public static final String LOSS_LETTER = "X";
    public static final String DRAW_LETTER = "Y";
    public static final String WIN_LETTER = "Z";

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
        int totalScore = 0;

        for (String game : input) {
            String[] moves = game.split(" ");
            String theirMove = findMove(moves[0]);
            String ourMove = findMove(moves[1]);

            int score = resultScore(ourMove, theirMove) + moveScore(ourMove);
            totalScore += score;
        }

        return String.valueOf(totalScore);
    }


    private static int moveScore(String ourMove) {
        return switch (ourMove) {
            case SCISSORS -> 3;
            case ROCK -> 1;
            case PAPER -> 2;
            default -> 0;
        };
    }

    private String findMove(String moveLetter) {
        return switch (moveLetter) {
            case OUR_ROCK, OPP_ROCK -> ROCK;
            case OUR_PAPER, OPP_PAPER -> PAPER;
            case OUR_SCISSORS, OPP_SCISSORS -> SCISSORS;
            default -> throw new IllegalArgumentException("Unexpected Value " + moveLetter);
        };
    }

    private int resultScore(String ourMove, String theirMove) {
        if(ourMove.equals(theirMove)){
            return DRAW_SCORE;
        }
        else if(
            theirMove.equals(SCISSORS) && ourMove.equals(ROCK) ||
            theirMove.equals(ROCK) && ourMove.equals(PAPER) ||
            theirMove.equals(PAPER) && ourMove.equals(SCISSORS)) {
            return WIN_SCORE;
        }
        return LOSE_SCORE;
    }

    /*
     * X = lose
     * Y = draw
     * Z = win
     * */
    @Override
    public String part2(List<String> input) {
        int totalScore = 0;
        for(String game: input){
            String theirMove = findMove(game.split(" ")[0]);
            String strategy = game.split(" ")[1];
            String ourMove;

            if(strategy.equals(LOSS_LETTER)){
                ourMove = getLosingMove(theirMove);
            } else if (strategy.equals(WIN_LETTER)) {

                ourMove = getWinMove(theirMove);
                totalScore += WIN_SCORE;

            } else{
                ourMove = theirMove;
                totalScore += DRAW_SCORE;
            }
            totalScore += moveScore(ourMove);
        }
        return String.valueOf(totalScore);
    }

    private String getWinMove(String theirMove) {
        return switch (theirMove) {
            case ROCK -> PAPER;
            case PAPER -> SCISSORS;
            case SCISSORS -> ROCK;
            default -> throw new UnsupportedOperationException();
        };
    }

    private static String getLosingMove(String theirMove) {
        return switch (theirMove) {
            case ROCK -> SCISSORS;
            case PAPER -> ROCK;
            case SCISSORS -> PAPER;
            default -> throw new UnsupportedOperationException();
        };
    }
}
