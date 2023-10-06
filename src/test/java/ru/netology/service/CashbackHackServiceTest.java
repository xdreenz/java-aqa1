package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemainWhenBelowBoundaryAmount() {
        int expected = 200;
        int actual = service.remain(800);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainWhenBoundaryAmount() {
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainWhenAboveBoundaryAmount() {
        int expected = 200;
        int actual = service.remain(2800);
        assertEquals(actual, expected);
    }
}