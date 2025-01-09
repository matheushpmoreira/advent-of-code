package me.Matt.adventofcode.day.day8;

record Antenna(int x, int y, char frequency) {
    public boolean hasSameFrequency(Antenna other) {
        return this.frequency == other.frequency;
    }
}
