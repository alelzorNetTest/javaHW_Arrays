package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldCalcSalesSum() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.salesSum(sales);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void shouldCalcSalesAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.salesAverage(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);

    }

    @Test
    public void shouldFindMaxSalesMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxSalesMonth = 8;
        int actualMaxSalesMonth = service.maxSalesMonth(sales);

        Assertions.assertEquals(expectedMaxSalesMonth, actualMaxSalesMonth);

    }

    @Test
    public void shouldFindMinSalesMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinSalesMonth = 9;
        int actualMinSalesMonth = service.minSalesMonth(sales);

        Assertions.assertEquals(expectedMinSalesMonth, actualMinSalesMonth);

    }

    @Test
    public void shouldCalcLowSalesMonthAmount() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedLowSalesMonthAmount = 5;
        int actualLowSalesMonthAmount = service.lowSalesMonthAmount(sales);

        Assertions.assertEquals(expectedLowSalesMonthAmount, actualLowSalesMonthAmount);

    }

    @Test
    public void shouldCalcHighSalesMonthAmount() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedHighSalesMonthAmount = 5;
        int actualHighSalesMonthAmount = service.highSalesMonthAmount(sales);

        Assertions.assertEquals(expectedHighSalesMonthAmount, actualHighSalesMonthAmount);

    }

}
