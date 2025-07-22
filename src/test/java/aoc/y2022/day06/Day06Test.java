package aoc.y2022.day06;

import aoc.y2022.day05.Day05;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Day06Test {
    private final Day06 target = new Day06();
        @Test
        void partOne() {
            String result = target.part1(List.of("mjqjpqmgbljsphdztnvjfqwrcgsmlb"));
            Assertions.assertThat(result).isEqualTo("7");
        }


    @Test
    void partTwo() {
        String result = target.part2(List.of("mjqjpqmgbljsphdztnvjfqwrcgsmlb"));
        Assertions.assertThat(result).isEqualTo("19");
    }

}
