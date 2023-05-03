package ru.netology.stats;

public class StatsService {

    public int salesSum(int[] sales) {
        int salesSum = 0;
        for (int i = 0; i < sales.length; i++) {
            salesSum = salesSum + sales[i];
        }
        return salesSum;
    }

    public int salesAverage(int[] sales) {
        int salesAverage = 0;
        int salesSum = 0;
        for (int i = 0; i < sales.length; i++) {
            salesSum = salesSum + sales[i];
            salesAverage = salesSum / (i + 1);
        }
        return salesAverage;
    }

    public int maxSalesMonth(int[] sales) {
        int maxSalesMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxSalesMonth]) {
                maxSalesMonth = i;
            }
        }
        return maxSalesMonth + 1;
    }

    public int minSalesMonth(int[] sales) {
        int minSalesMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minSalesMonth]) {
                minSalesMonth = i;
            }
        }
        return minSalesMonth + 1;
    }

    public int lowSalesMonthAmount(int[] sales) {
        int lowSalesMonthAmount = 0;
        int average = salesAverage(sales);
        for (int j = 0; j < sales.length; j++) {
            if (sales[j] < average) {
                lowSalesMonthAmount = lowSalesMonthAmount + 1;
            }
        }
        return lowSalesMonthAmount;
    }

    public int highSalesMonthAmount(int[] sales) {
        int average = salesAverage(sales);
        int highSalesMonthAmount = 0;
        for (int j = 0; j < sales.length; j++) {
            if (sales[j] > average) {
                highSalesMonthAmount = highSalesMonthAmount + 1;
            }
        }
        return highSalesMonthAmount;
    }
}
