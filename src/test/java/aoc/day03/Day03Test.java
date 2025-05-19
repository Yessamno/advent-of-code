package aoc.day03;
import aoc.Day03.Day03;
import aoc.day02.Day02;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static aoc.day02.Day02.*;
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
}
