package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test
    public void shouldSumOfAllSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.sumAllSales(sales);


        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldAverageMonthlySales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverageSum = 15;
        int actualAverageSum = service.averageMonthlySales(sales);


        Assertions.assertEquals(expectedAverageSum, actualAverageSum);
    }

    @Test
    public void shouldgetMaxMonth() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonth = 8;
        int actualMaxMonth = service.getMaxMonth(sales);


        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }


    @Test
    public void shouldgetMinMonth() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 9;
        int actualMinMonth = service.getMinSales(sales);


        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }


    @Test
    public void sholdNumberMonthMinSales() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumberMonthMinSales = 5;
        int actualNumberMonthMinSales = service.numberMonthMinSales(sales);


        Assertions.assertEquals(actualNumberMonthMinSales, expectedNumberMonthMinSales);
    }


    @Test
    public void sholdNumberMonthMaxSales() {

        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumberMonthMaxSales = 5;
        int actualNumberMonthMaxSales = service.numberMonthMaxSales(sales);


        Assertions.assertEquals(actualNumberMonthMaxSales, expectedNumberMonthMaxSales);
    }
}





