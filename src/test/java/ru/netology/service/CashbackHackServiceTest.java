package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemainWhenBelowBoundaryAmount() {
        int expected = 200;
        int actual = service.remain(800);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainWhenBoundaryAmount() {
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainWhenAboveBoundaryAmount() {
        int expected = 200;
        int actual = service.remain(2800);
        assertEquals(expected, actual);
    }
}