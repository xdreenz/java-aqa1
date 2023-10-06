package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemainNotBoundaryAmount() {
       CashbackHackService service = new CashbackHackService();
       int expected = 200;
       int actual = service.remain(2800);
       assertEquals(actual, expected);
    }

    @Test
    public void testRemainBoundaryAmount() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(2000);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainAboveBoundaryAmount() {
        CashbackHackService service = new CashbackHackService();
        int expected = 200;
        int actual = service.remain(2800);
        assertEquals(expected, actual);
    }
}