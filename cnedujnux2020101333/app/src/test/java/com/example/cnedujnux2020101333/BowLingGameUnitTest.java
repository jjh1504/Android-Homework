package com.example.cnedujnux2020101333;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BowLingGameUnitTest {

    private BowLingGame game;

    @Before
    public void setUp() throws Exception {
        game = new BowLingGame();
    }

    @Test
    public void test0()throws Exception
    {
        RollForManyTimes(0,20);
        assertEquals(0, game.score());

    }
    @Test
    public void test1() throws Exception
    {
        RollForManyTimes(1, 20);
        assertEquals(20, game.score());
    }
    @Test
    public void testOneSpare() throws Exception {
        rollSpare();
        game.roll(8);
        RollForManyTimes(0,16);
        assertEquals(26,game.score());
    }

    @Test
    public void testOneStrike() throws Exception {
        rollStrike();
        game.roll(4);
        game.roll(5);
        game.roll(1);
        game.roll(8);
        RollForManyTimes(0,15);
        assertEquals(37,game.score());
    }

    @Test
    public void testPerfectGame() throws Exception {
        RollForManyTimes(12,10);
        assertEquals(300, game.score());
    }

    private void rollSpare() {
        game.roll(5);
        game.roll(5);
    }
    private void rollStrike() {
        game.roll(10);
    }

    private void RollForManyTimes(int pin, int times) {
        for (int i=0;i<times;i++)
        {
            game.roll(pin);
        }
    }



}