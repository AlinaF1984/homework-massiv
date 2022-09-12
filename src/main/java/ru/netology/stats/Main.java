package ru.netology.stats;

public class Main {
    public static void main(String[] args) {

        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println();
        service.sumAllSales(sales);
        System.out.println();
        service.averageMonthlySales(sales);
        System.out.println();
        service.getMaxMonth(sales);
        System.out.println();
        service.getMinSales(sales);
        System.out.println();
        service.numberMonthMinSales(sales);
        System.out.println();
        service.numberMonthMaxSales(sales);

    }
}