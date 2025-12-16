package aoc.y2025.day02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Day02Test {
    @Test
    void part1Example() {
        String result = new Day02().part1(List.of("11-22","95-115","998-1012","1188511880-1188511890","222220-222224","1698522-1698528","446443-446449","38593856-38593862","565653-565659","824824821-824824827","2121212118-2121212124"        ));
        assertThat(result).isEqualTo("1227775554");
    }
    @Test
    void part1SingleExample() {
        String result = new Day02().part1(List.of("11-22"));
        assertThat(result).isEqualTo("33");
    }
}
