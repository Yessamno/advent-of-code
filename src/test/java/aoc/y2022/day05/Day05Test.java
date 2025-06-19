package aoc.y2022.day05;


import aoc.y2022.day05.Day05;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Day05Test {
    private final Day05 target = new Day05();

    @Test
    @Disabled
    void partOne() {
        String result = target.part1(List.of(
            "    [D]   ",
            "[N] [C]   ",
            "[Z] [M] [P]",
            " 1   2   3",
            "",
            "move 1 from 2 to 1",
            "move 3 from 1 to 3",
            "move 2 from 2 to 1",
            "move 1 from 1 to 2"));
        Assertions.assertThat(result).isEqualTo("CMZ");
    }

    @Test
    void firstStack() {
        String result = target.part1(List.of(
            "[D]",
            "[N]",
            "[Z]",
            " 1",
            ""
        ));
        Assertions.assertThat(result).isEqualTo(
            "D"
        );
    }

    @Test
    void twoStacks() {
        String result = target.part1(List.of(
//            "    [D]",
            "[N] [C]",
            "[Z] [M]",
            " 1    2",
            ""
        ));
        Assertions.assertThat(result).isEqualTo(
            "NC"
        );
    }
}
