package aoc.y2025.day03;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Day03Test {
    void part1Example() {
        String result = new Day03().part1(List.of(
            "987654321111111",
            "811111111111119",
            "234234234234278",
            "818181911112111"));
        assertThat(result).isEqualTo("357");
    }

    void oneLineTest() {
        String result = new Day03().part1(List.of("987654321111111"));
        assertThat(result).isEqualTo(("98"));
    }
}
