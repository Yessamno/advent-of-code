package aoc.y2022.day01;


import aoc.y2022.day01.Day01;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class Day01Test {

    private final Day01 day01 = new Day01();

    @Test
    public void oneElfTwoSnacks(){
        // Given
        List<String> input = List.of("100", "200");

        // When
        String result = day01.part1(input);

        // Then
        assertThat(result).isEqualTo("300");
    }

    @Test
    void twoElves() {
        List<String> input = List.of("200", "", "100");
        String result = day01.part1(input);
        assertThat(result).isEqualTo("200");
    }

    @Test
    void stringsAreSpecial() {
        assertThat("Mark" == "Mark").isTrue();
        assertThat("Mark" == new String("Mark")).isFalse();
        assertThat("Mark".equals(new String("Mark"))).isTrue();
    }

    @Test
    public void testPart2(){
        // Given
        List<String> input = List.of(
            "1000",
            "2000",
            "3000",
            "",
            "4000",
            "",
            "5000",
            "6000",
            "",
            "7000",
            "8000",
            "9000",
            "",
            "10000"
        );

        // When
        String result = day01.part2(input);

        // Then
        assertThat(result).isEqualTo("45000");
    }
}
