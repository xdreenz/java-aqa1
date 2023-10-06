package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemainWhenBelowBoundaryAmount() {
        CashbackHackService service = new CashbackHackService();
        int expected = 200;
        int actual = service.remain(800);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainWhenBoundaryAmount() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainWhenAboveBoundaryAmount() {
        CashbackHackService service = new CashbackHackService();
        int expected = 200;
        int actual = service.remain(2800);
        assertEquals(actual, expected);
    }
}