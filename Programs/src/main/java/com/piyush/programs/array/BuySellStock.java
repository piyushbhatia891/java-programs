package com.piyush.programs.array;

import java.util.ArrayList;

class Interval {
    int buy, sell;
}
public class BuySellStock {
    public static void main(String[] args){
        int[] arr={7,2,4,8,7};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(final int[] arr) {
        int n = arr.length;
        if(n < 2) {
            return 0;
        }

        int[] lr = new int[n];
        int[] rl = new int[n];

        int msf = arr[0];
        for(int i = 1; i < n; i++) {
            msf = Math.min(msf, arr[i]);
            lr[i] = Math.max(lr[i - 1], arr[i] - msf);
        }

        msf = arr[n - 1];
        for(int i = n - 2; i >= 0; i--) {
            msf = Math.max(msf, arr[i]);
            rl[i] = Math.max(rl[i + 1], msf - arr[i]);
        }

        msf = 0;
        for(int i = 0; i < n; i++) {
            msf = Math.max(msf, lr[i] + rl[i]);
        }

        return msf;
    }

    static void maxProfit2(int[] arr){
        int i=0,profit=0,maxProfit=0,n=arr.length,buy=0;
        if (n == 1)
            return;

        int count = 0;
        ArrayList<Interval> sol = new ArrayList<Interval>();
        while (i < n - 1) {
            // Find Local Minima. Note that the limit is (n-2) as we are
            // comparing present element to the next element.
            while ((i < n - 1) && (arr[i + 1] <= arr[i]))
                i++;

            // If we reached the end, break as no further solution possible
            if (i == n - 1)
                break;

            Interval e = new Interval();
            e.buy = arr[i++];
            // Store the index of minima

            // Find Local Maxima.  Note that the limit is (n-1) as we are
            // comparing to previous element
            while ((i < n) && (arr[i] >= arr[i - 1]))
                i++;

            // Store the index of maxima
            e.sell = arr[i - 1];
            sol.add(e);

            // Increment number of buy/sell
            count++;
        }

        // print solution
        if (count == 0)
            System.out.println("There is no day when buying the stock "
                    + "will make profit");
        else {
            for (int j = 0; j < count; j++) {
                profit=profit+sol.get(j).sell-sol.get(j).buy;
                if(profit>maxProfit)
                    maxProfit=profit;
            }
        }
        System.out.println(maxProfit);

    }
}
