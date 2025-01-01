package me.Matt.adventofcode.day.day6;

import java.util.List;
import me.Matt.adventofcode.day.Answer;
import me.Matt.adventofcode.day.Solver;
import me.Matt.adventofcode.util.Listx;

public final class Solution implements Solver {
    @Override
    public Answer solve(String input) {
        List<List<Character>> scheme = Listx.splitInput2D(input);

        var map = new LaboratoryMap(scheme);
        var guard = new Guard(map, scheme);
        var simulation = new Simulation(map, guard);

        int part1 = simulation.countUniqueVisitedTiles();
        int part2 = simulation.countPossibleLoops();

        return new Answer(part1, part2);
    }
}
