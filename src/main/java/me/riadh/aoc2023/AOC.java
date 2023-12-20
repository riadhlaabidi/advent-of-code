package me.riadh.aoc2023;

import me.riadh.Puzzle;

public class AOC {
    public static Puzzle getPuzzle(int day) {
        Puzzle puzzle;
        switch (day) {
            case 1 -> puzzle = new Day1();
            case 2 -> puzzle = new Day2();
            case 3 -> puzzle = new Day3();
            default -> throw new IllegalArgumentException("Invalid day");
        }
        return puzzle;
    }
}
