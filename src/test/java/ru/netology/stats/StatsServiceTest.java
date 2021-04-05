package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    StatsService service = new StatsService();
    int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateSum() {
        int actual = service.calculateSum(this.purchases);
        int expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    void midleSum() {
        int expected = 15;
        int actual = service.midleSum(this.purchases);
        assertEquals(expected, actual);
    }

    @Test
    void findMaximum() {
        int expected = 8;
        int actual = service.findMaximum(this.purchases);
        assertEquals(expected, actual);
    }

    @Test
    void findMinimum() {
        int expected = 9;
        int actual = service.findMinimum(this.purchases);
        assertEquals(expected, actual);
    }

    @Test
    void monthsWithBelowAverageSales() {
        int expected = 5;
        int actual = service.monthsWithBelowAverageSales (this.purchases);
        assertEquals(expected, actual);
    }

    @Test
    void monthsWithAboveAverageSales() {
        int expected = 5;
        int actual = service.monthsWithAboveAverageSales(this.purchases);
        assertEquals(expected, actual);
    }
}

