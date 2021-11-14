package com.prateeksingh;

public class Main {

    public static int maxDiff(int arr[]){
        int n = arr.length;
        int res = arr[1] - arr[0], minVal = arr[0];

        for(int i = 1; i < n; i++){
            res = Math.max(res, arr[i] - minVal);
            minVal = Math.min(minVal, arr[i]);
        }

        return res;
    }

    public static void main(String[] args) {
	// write your code here
        int arr[] = {2,3,10,6,4,8};

        System.out.print(maxDiff(arr));
    }
}
