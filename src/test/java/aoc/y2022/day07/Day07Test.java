package aoc.y2022.day07;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Day07Test {
    private final Day07 target = new Day07();
    @Test
    void partOne() {
        String result = target.part1(List.of(
            "$ cd /",
                "$ ls" ,
                "dir a" ,
                "14848514 b.txt" ,
                "8504156 c.dat" ,
                "dir d" ,
                "$ cd a" ,
                "$ ls" ,
                "dir e" ,
                "29116 f" ,
                "2557 g" ,
                "62596 h.lst" ,
                "$ cd e" ,
                "$ ls" ,
                "584 i" ,
                "$ cd .." ,
                "$ cd .." ,
                "$ cd d" ,
                "$ ls" ,
                "4060174 j" ,
                "8033020 d.log" ,
                "5626152 d.ext" ,
                "7214296 k"
            ));
        Assertions.assertThat(result).isEqualTo("48381165");
    }


    @Test
    void partTwo() {
        String result = target.part2(List.of("mjqjpqmgbljsphdztnvjfqwrcgsmlb"));
        Assertions.assertThat(result).isEqualTo("19");
    }

}
