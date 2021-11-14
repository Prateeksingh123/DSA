package com.prateeksingh;

public class Main {

    public static int maxSum(int arr[]){
        int n = arr.length;

        int res = arr[0];
        int maxEnding = arr[0];

        for(int i = 1; i < n; i++){
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }

        return res;
    }

    public static void main(String[] args) {
	// write your code here
        int arr[] = {2, 3, -8, 7, -1, 2, 3};

        System.out.println(maxSum(arr));
    }
}
