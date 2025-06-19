package aoc.y2022.day04;

import aoc.y2022.day04.day04;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Day04Test {

    private final day04 target = new day04();

    @Test
    public void partOne(){
        List<String> input = List.of(
            "2-4,6-8",
            "2-3,4-5",
            "5-7,7-9",
            "2-8,3-7",
            "6-6,4-6",
            "2-6,4-8");

        // When
        String result = target.part1(input);

        // Then
        assertThat(result).isEqualTo("2");
    }

    @Test
    public void  partTwo(){
        List<String> input = List.of(
            "2-4,6-8",
            "2-3,4-5",
            "5-7,7-9",
            "2-8,3-7",
            "6-6,4-6",
            "2-6,4-8");

        // When
        String result = target.part2(input);

        // Then
        assertThat(result).isEqualTo("4");
    }
}
