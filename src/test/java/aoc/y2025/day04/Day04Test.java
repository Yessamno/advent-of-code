package aoc.y2025.day04;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Day04Test {
    @Test
    void part1Example() {
        String result = new Day04().part1(List.of(
            "..@@.@@@@.",
            "@@@.@.@.@@",
            "@@@@@.@.@@",
            "@.@@@@..@.",
            "@@.@@@@.@@",
            ".@@@@@@@.@",
            ".@.@.@.@@@",
            "@.@@@.@@@@",
            ".@@@@@@@@.",
            "@.@.@@@.@."));
        assertThat(result).isEqualTo("13");
    }

    @Test
    void part2Example() {
        String result = new Day04().part1(List.of(""));
        assertThat(result).isEqualTo("");
    }
}
