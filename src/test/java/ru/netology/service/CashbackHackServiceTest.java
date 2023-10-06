package ru.netology.service;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    // JUnit4 tests
    @org.junit.Test
    public void testJUnit4RemainWhenBelowBoundaryAmount() {
        int expected = 200;
        int actual = service.remain(800);
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testJUnit4RemainWhenBoundaryAmount() {
        int expected = 0;
        int actual = service.remain(1000);
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testJUnit4RemainWhenAboveBoundaryAmount() {
        int expected = 200;
        int actual = service.remain(2800);
        org.junit.Assert.assertEquals(expected, actual);
    }

    // JUnit5 tests
    @org.junit.jupiter.api.Test
    public void testJUnit5RemainWhenBelowBoundaryAmount() {
        int expected = 200;
        int actual = service.remain(800);
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void testJUnit5RemainWhenBoundaryAmount() {
        int expected = 0;
        int actual = service.remain(1000);
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void testJUnit5RemainWhenAboveBoundaryAmount() {
        int expected = 200;
        int actual = service.remain(2800);
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
}