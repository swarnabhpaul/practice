//Problem URL: https://practice.geeksforgeeks.org/batch-problems/maximum-and-value-1587115620/0/?track=DSASP-BitMagic&batchId=154

class Solution {

    // Function for finding maximum AND value.
    public static int maxAND(int arr[], int N) {

        // Your code here
        // You can add extra function (if required)
        int max = 0, i, p1 = -1, p2 = -1, max1, t, cnt, m, t1;
        for (i = 0; i < N; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        t = 1;
        while (t < max) {
            t = (t << 1);
        }
        t1 = t;

        while (t1 != 0) {
            cnt = 0;
            for (i = 0; i < N; i++) {
                if ((arr[i] & t) == t) {
                    cnt++;
                }
            }
            if (cnt > 1) {
                t += t1 / 2;
                t1 /= 2;
            } else {
                t -= t1;
                t1 /= 2;
                t += t1;
            }
        }
        return t;
    }

}