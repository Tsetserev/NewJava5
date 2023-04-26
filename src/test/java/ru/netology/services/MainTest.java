package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testCountRestMonths() {
        Main service = new Main();

        int actual = Main.calculate(10_000,3_000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testCountRestMonths2() {
        Main service = new Main();

        int actual = Main.calculate(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

}