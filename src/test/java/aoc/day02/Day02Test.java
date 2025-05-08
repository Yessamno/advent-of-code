package aoc.day02;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static aoc.day02.Day02.*;
import static org.assertj.core.api.Assertions.assertThat;

public class Day02Test {

    private final Day02 target = new Day02();

    @Test
    public void partOne(){
        // Given
        List<String> input = List.of("A Y",
            "B X",
            "C Z");

        // When
        String result = target.part1(input);

        // Then
        assertThat(result).isEqualTo("15");
    }

    @Test
    public void theyPlayPaperWePlayRockAndLose(){
        // Given
        List<String> input = List.of("B X");

        // When
        String result = target.part1(input);

        // Then
        assertThat(result).isEqualTo("1");
    }

    @Test
    public void theyPlayScissorsWePlayPaper(){
        List<String> input = List.of("C Y");

        // When
        String result = target.part1(input);

        // Then
        assertThat(result).isEqualTo("2");
    }

    @Test
    void theyPlayRockWePlayScissorsAndLose() {
        List<String> input = List.of(OPP_ROCK + " " + OUR_SCISSORS);
        String result = target.part1(input);
        assertThat(result).isEqualTo("3");
    }

    @Test
    void thePlayRockWePlayRockAndDraw() {
        List<String> input = List.of(OPP_ROCK + " " + OUR_ROCK);
        String result = target.part1(input);
        assertThat(result).isEqualTo("4");
    }

    @Test
    void thePlayPaperWePlayPaperAndDraw() {
        List<String> input = List.of(Day02.OPP_PAPER + " " + Day02.OUR_PAPER);
        String result = target.part1(input);
        assertThat(result).isEqualTo("5");
    }

    @Test
    void thePlayScissorsWePlayScissorsAndDraw() {
        List<String> input = List.of(Day02.OPP_SCISSORS + " " + Day02.OUR_SCISSORS);
        String result = target.part1(input);
        assertThat(result).isEqualTo("6");
    }

    @Test
    void winWithRock() {
        List<String> input = List.of(OPP_SCISSORS + " " + OUR_ROCK);
        String result = target.part1(input);
        assertThat(result).isEqualTo("7");
    }
    @Test
    void winWithPaper() {
        List<String> input = List.of(OPP_ROCK + " " + OUR_PAPER);
        String result = target.part1(input);
        assertThat(result).isEqualTo("8");
    }
    @Test
    void winWithScissors() {
        List<String> input = List.of(OPP_PAPER + " " + OUR_SCISSORS);
        String result = target.part1(input);
        assertThat(result).isEqualTo("9");
    }


    @Test

    public void partTwo(){
        // Given
        List<String> input = List.of(OPP_PAPER + " " + "X");

        // When
        String result = target.part2(input);

        // Then
        assertThat(result).isEqualTo("3");
    }

}
