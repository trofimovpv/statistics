package ru.netology.stats;

public class StatsService {

    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long average(long[] sales) {
        return sum(sales) / 12;

    }

    public int maximum(long[] sales) {
        int maximumMonth = 0;
        long maximum = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (maximum <= sales[i]) {
                maximum = sales[i];
                maximumMonth = i;
            }
        }
        return maximumMonth + 1;
    }

    public int minimum(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthLowerAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int monthHigherAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale >= averageSale) {
                counter++;
            }
        }
        return counter;


    }
}