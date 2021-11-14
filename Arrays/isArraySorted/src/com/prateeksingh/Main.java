package com.prateeksingh;

public class Main {

    public static boolean isArraySorted(int arr[]){
        int n = arr.length;

        for(int i = 1; i < n; i++){
            if(arr[i] < arr[i-1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
	// write your code here
        int arr[] = {100, 20, 200};

        System.out.println(isArraySorted(arr));
    }
}
