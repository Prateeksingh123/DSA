package com.prateeksingh;

public class Main {

    public static boolean isEqPoint(int arr[]){
        int n = arr.length;
        int sum = 0;

        for(int i = 0; i < n; i++)
            sum += arr[i];

        int l_sum = 0;
        for(int i = 0; i < n; i++){
            if(l_sum == sum - arr[i])
                return true;

            l_sum += arr[i];
            sum -= arr[i];
        }
        return false;

    }

    public static void main(String[] args) {
	// write your code here
        int arr[] = {3, 4, 8, -9, 20, 6};

        System.out.println(isEqPoint(arr));
    }
}
