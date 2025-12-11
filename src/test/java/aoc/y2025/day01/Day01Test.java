package aoc.y2025.day01;

import org.junit.jupiter.api.Disabled;
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
        assertThat(result).isEqualTo("0");
    }

    @Test
    void movePastZeroTwice() {
        String result = new Day01().part1(List.of("L200"));
        assertThat(result).isEqualTo("0");
    }

    @Test
    void moveTo49ThenRightTo99() {
        String result = new Day01().part1(List.of("L1","R50"));
        assertThat(result).isEqualTo("0");
    }

    @Test
    void moveFarLeftThenFarRight(){
        String result = new Day01().part1(List.of("L51","R102"));
        assertThat(result).isEqualTo("0");
    }

    @Test
    void movePastZeroTwiceInOnceMove(){
        String result = new Day01().part1(List.of("L150"));
        assertThat(result).isEqualTo("1");
    }

    @Test
    void partOneExample(){
        String result = new Day01().part1(List.of(
            "L68",
            "L30",
            "R48",
            "L5",
            "R60",
            "L55",
            "L1",
            "L99",
            "R14",
            "L82"
        ));
        assertThat(result).isEqualTo(("3"));
    }

    @Test
    @Disabled
    void partTwoExample(){
        String result = new Day01().part1(List.of(
            "L68",
            "L30",
            "R48",
            "L5",
            "R60",
            "L55",
            "L1",
            "L99",
            "R14",
            "L82"
        ));
        assertThat(result).isEqualTo(("6"));
    }


}
