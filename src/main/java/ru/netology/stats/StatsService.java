package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            // аналог sum = sum + purchase;
            sum += purchase;
        }
        return sum;
    }

    public int midleSum(int[] items) {
        int allSum = 0;
        for (int item : items) {
            allSum += item;
        }
        return allSum / items.length;
    }

    public int findMaximum(int[] purchases) {
        int currentMaximum = purchases[0];
        int counter = 1;
        for (int i = 0; i > purchases.length; i++) {
            counter = 1;
            if (currentMaximum < purchases[i]) {
                counter += i;
                currentMaximum = counter;
            }
        }
        return currentMaximum;
    }


    public int findMinimum(int[] purchases) {
        int currentMinimum = purchases[0];
        int counter = 1;
        for (int i = 0; i < purchases.length; i++) {
            counter = 1;
            if (currentMinimum > purchases[i]) {
                counter += i;
                currentMinimum = counter;
            }
        }
        return currentMinimum;
    }



    public int monthsWithBelowAverageSales(int[] purchases) {
        int mean = midleSum(purchases);
        int month = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] < mean) {
                month++;
            }
        }
        return month;
    }

    public int monthsWithAboveAverageSales(int[] purchases) {
        int mean = midleSum(purchases);
        int month = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] > mean) {
                month++;
            }
        }
        return month;
    }
}
