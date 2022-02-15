package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    public void shouldSum() {
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService statsService = new StatsService();

        long actual = statsService.sum(purchases);
        long expected = 180;
        assertEquals(expected, actual);

    }
    @Test
    public void shouldAverage() {
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService statsService = new StatsService();

        long actual = statsService.average(purchases);
        long expected = 15;
        assertEquals(expected, actual);

    }
    @Test
    public void shouldReturnMonthWithMax() {
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService statsService = new StatsService();

        long actual = statsService.monthWithMax(purchases);
        long expected = 8;
        assertEquals(expected, actual);

    }
    @Test
    public void shouldReturnMonthWithMin() {
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService statsService = new StatsService();

        long actual = statsService.monthWithMin(purchases);
        long expected = 9;
        assertEquals(expected, actual);

    }
    @Test
    public void shouldReturnMonthsWithMore() {
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService statsService = new StatsService();

        long actual = statsService.monthWithMax(purchases);
        long expected = 8;
        assertEquals(expected, actual);

    }
    @Test
    public void shouldReturnMonthWithLess() {
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService statsService = new StatsService();

        long actual = statsService.monthWithMin(purchases);
        long expected = 9;
        assertEquals(expected, actual);

    }
}