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
    @Test
    public void test0()
    {
        BowLingGame game = new BowLingGame();
        for (int i=0;i<20;i++)
        {
            game.roll(0);
        }
        assertEquals(0,game.score());

    }
//    private BowLingGame game;
//
//    @Before
//    public void setUp() throws Exception {
//        game = new BowLingGame();
//    }
//
//    @Test
//    public void test20Zeros()
//    {
//        repeatRoll(0, 20);
//        assertEquals(0, game.score());
//    }
//    @Test
//    public void test20Ones()
//    {
//        repeatRoll(1,20);
//        assertEquals(20,game.score());
//    }
//
//    private void repeatRoll(int pin, int times) {
//        for(int i=0;i<times;i++)
//        {
//            game.roll(pin);
//        }
//    }
}