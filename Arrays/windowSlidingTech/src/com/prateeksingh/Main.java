package com.prateeksingh;

public class Main {

    public static int windowSlidingTech(int arr[], int k){
        int n = arr.length;

        int curr_sum = 0;
        for(int i = 0; i < k; i++){
            curr_sum += arr[i];
        }

        int max_sum = curr_sum;
        for(int i = k; i < n; i++){
            curr_sum += (arr[i] - arr[i-k]);
            max_sum = Math.max(curr_sum,max_sum);
        }

        return max_sum;
    }

    public static void main(String[] args) {
	// write your code here
        int arr[] = {1, 8, 30, -5, 20, 7};
        int k = 3;

        System.out.println(windowSlidingTech(arr, k));
    }
}
