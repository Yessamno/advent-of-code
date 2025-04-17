package aoc.day01;


import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class Day01Test {

    @Test
    public void oneElfTwoSnacks(){
        // Given
        List<String> input = List.of("100", "200");

        // When
        String result = new Day01().part1(input);

        // Then
        assertThat(result).isEqualTo("300");
    }

    @Test
    void twoElves() {
        List<String> input = List.of("200", "", "100");
        String result = new Day01().part1(input);
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
        List<String> input = Collections.singletonList("test");

        // When
        String result = new Day01().part2(input);

        // Then
        assertThat(result).isEqualTo(input.get(0));
    }
}
