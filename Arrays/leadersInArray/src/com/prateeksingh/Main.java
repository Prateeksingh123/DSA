package com.prateeksingh;

public class Main {

    public static void leader(int arr[]){
        int n = arr.length;

        int curr_ldr = arr[n-1];
        System.out.print(curr_ldr + " ");

        for(int i = n-2; i >= 0; i--){
            if(arr[i] > curr_ldr){
                curr_ldr = arr[i];
                System.out.print(curr_ldr + " ");
            }
        }
    }

    public static void main(String[] args) {
	// write your code here
        int arr[] ={7, 10, 4, 3, 6, 5, 2};

        leader(arr);
    }
}
