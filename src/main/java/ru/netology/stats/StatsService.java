package ru.netology.stats;

public class StatsService {

    public int sumAllSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }

        return sum;
    }

    public int averageMonthlySales(int[] sales) {
        int sum = sumAllSales(sales);
        int averageMonthlySales = sum / 12;
        return averageMonthlySales;
    }

    public int getMaxMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int getMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int numberMonthMinSales(int[] sales) {
        int numberMonthMinSales = 0;
        int averageSales = averageMonthlySales(sales);
        for (int sale : sales) {
            if (sale < averageSales) {
                numberMonthMinSales += 1;
            }
        }
        return numberMonthMinSales;
    }

    public int numberMonthMaxSales(int[] sales) {
        int numberMonthMaxSales = 0;
        int averageSales = averageMonthlySales(sales);
        for (int sale : sales) {
            if (sale > averageSales) {
                numberMonthMaxSales += 1;
            }
        }
        return numberMonthMaxSales;
    }

}