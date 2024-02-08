package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale = totalSale + sale;
        }
        return totalSale;
    }

    public long average(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale = totalSale + sale;
        }
        long averageSale = totalSale / sales.length;
        return averageSale;
    }


    public int mounthMaxSale(long[] sales) {
        int mounhtMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[mounhtMax] <= sales[i]) {
                mounhtMax = i;
            }
        }
        return mounhtMax + 1;
    }


    public int mounthMinSale(long[] sales) {
        int mounhtMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[mounhtMax] >= sales[i]) {
                mounhtMax = i;
            }
        }
        return mounhtMax + 1;
    }


    public int mounthsBelowAverage(long[] sales) {

        int quantity = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                quantity = quantity + 1;
            }
        }
        return quantity;
    }

    public int mounthsAboveAverage(long[] sales) {

        int quantity = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                quantity = quantity + 1;
            }
        }
        return quantity;
    }
}




