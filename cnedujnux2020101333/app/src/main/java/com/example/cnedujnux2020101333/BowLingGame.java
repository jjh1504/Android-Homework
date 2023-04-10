package com.example.cnedujnux2020101333;

public class BowLingGame {
    private int  score =0;
    public void roll(int pins) {
        score += pins;
    }
    public int score() {
        return score;
    }
}
