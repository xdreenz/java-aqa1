package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemainBelowBoundaryAmount() {
        CashbackHackService service = new CashbackHackService();
        int expected = 200;
        int actual = service.remain(800);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainBoundaryAmount() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainAboveBoundaryAmount() {
        CashbackHackService service = new CashbackHackService();
        int expected = 200;
        int actual = service.remain(2800);
        assertEquals(expected, actual);
    }
}