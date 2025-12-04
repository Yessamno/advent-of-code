package aoc.y2025.day01;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static java.util.Collections.emptyList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Day01Test
{

    @Test
    void noInput() {
        String result = new Day01().part1(emptyList());
        assertThat(result).isEqualTo("0");
    }

    @Test
    void moveToZero() {
        String result = new Day01().part1(List.of("L50"));
        assertThat(result).isEqualTo("1");
    }

    @Test
    void movePastZero() {
        String result = new Day01().part1(List.of("L51"));
        assertThat(result).isEqualTo("1");
    }

    @Test
    void movePastZeroTwice() {
        String result = new Day01().part1(List.of("L200"));
        assertThat(result).isEqualTo("2");
    }

    @Test
    void moveRight() {
        String result = new Day01().part1(List.of("R49"));
        assertThat(result).isEqualTo("0");
    }

}
