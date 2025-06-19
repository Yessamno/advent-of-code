package aoc.y2022.day03;
import aoc.y2022.Day03.Day03;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class Day03Test {

    private final Day03 target = new Day03();

    @Test
    public void partOne() {
        // Given
        List<String> input = List.of(
            "vJrwpWtwJgWrhcsFMMfFFhFp" ,
            "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL" ,
            "PmmdzqPrVvPwwTWBwg" ,
            "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn" ,
            "ttgJtRGJQctTZtZT" ,
            "CrZsJsPPZsGzwwsLwLmpwMDw");

        // When
        String result = target.part1(input);

        // Then
        assertThat(result).isEqualTo("157");
    }

    @Test
    public void firstRuckSack(){
        List<String> input = List.of("vJrwpWtwJgWrhcsFMMfFFhFp");

        // When
        String result = target.part1(input);

        // Then
        assertThat(result).isEqualTo("16");
    }
    @Test
    public void secondRuckSack(){
        List<String> input = List.of("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL");

        // When
        String result = target.part1(input);

        // Then
        assertThat(result).isEqualTo("38");
    }

    @Test
    public void partTwo() {
        // Given
        List<String> input = List.of(
            "vJrwpWtwJgWrhcsFMMfFFhFp",
            "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL",
            "PmmdzqPrVvPwwTWBwg",
            "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn",
            "ttgJtRGJQctTZtZT",
            "CrZsJsPPZsGzwwsLwLmpwMDw"
        );

        String result = target.part2(input);

        assertThat(result).isEqualTo("70");
    }

}
