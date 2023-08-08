package org.example;

public class MaxDoubleSliceSum {
    public int solution(int [] A) {
        int [] s = new int[A.length];
        int [] e = new int[A.length];

        for (int i = 1; i < A.length -1 ; i++) {
            s[i] = Math.max(A[i], s[i-1] + A[i]);
            if (s[i] < 0) s[i] = 0;
        }

        for (int i = A.length - 2; i > 0 ; i--) {
            e[i] = Math.max(A[i], e[i+1] + A[i]);
            if (e[i] < 0) e[i] = 0;
        }

        int max = 0;

        for (int i = 1; i < A.length -1; i++) {
            max = Math.max(s[i-1] + e[i+1], max);
        }
        return max;
    }


    public int solution2(int [] A) {
        int N = A.length;
        int[] maxLeft = new int[N];
        int[] maxRight = new int[N];

        // Calculate the maximum sums to the left of each position
        for (int i = 1; i < N - 1; i++) {
            maxLeft[i] = Math.max(maxLeft[i - 1] + A[i], 0);
        }

        // Calculate the maximum sums to the right of each position
        for (int i = N - 2; i > 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1] + A[i], 0);
        }

        int maxSum = 0;

        // Calculate the sum of each possible double slice and find the largest sum
        for (int i = 1; i < N - 1; i++) {
            int doubleSliceSum = maxLeft[i - 1] + maxRight[i + 1];
            maxSum = Math.max(maxSum, doubleSliceSum);
        }

        return maxSum;
    }
}
