package com.prateeksingh;

public class Main {

    public static int getWater(int arr[]){
        int n = arr.length;

        int res = 0;
        int lMax[] = new int[n];
        int rMax[] = new int[n];
        lMax[0] = arr[0];

        for(int i = 1; i < n; i++)
            lMax[i] = Math.max(arr[i], lMax[i-1]);

        rMax[n-1] = arr[n-1];
        for(int i = n-2; i >= 0; i--)
            rMax[i] = Math.max(arr[i], rMax[i+1]);

        for(int i = 1; i < n; i++){
            res = res + (Math.min(lMax[i], rMax[i]) - arr[i]);
        }

        return res;
    }

    public static void main(String[] args) {
	// write your code here
        int arr[] = {3, 0, 1, 2, 5};

        System.out.print(getWater(arr));
    }
}
