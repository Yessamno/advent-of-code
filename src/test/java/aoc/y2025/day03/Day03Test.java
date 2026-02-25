package aoc.y2025.day03;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Day03Test {
    @Test
    void part1Example() {
        String result = new Day03().part1(List.of(
            "987654321111111",
            "811111111111119",
            "234234234234278",
            "818181911112111"));
        assertThat(result).isEqualTo("357");
    }

    @Test
    void oneLineTest() {
        String result = new Day03().part1(List.of("987654321111111"));
        assertThat(result).isEqualTo(("98"));
    }

    @Test
    void part2Example() {
        String result = new Day03().part2(List.of(
            "987654321111111",
            "811111111111119",
            "234234234234278",
            "818181911112111"
        ));
        assertThat(result).isEqualTo("3121910778619");
    }
}
