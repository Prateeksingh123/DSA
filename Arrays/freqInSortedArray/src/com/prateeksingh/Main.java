package com.prateeksingh;

public class Main {

    public static void printFreq(int arr[]){
        int n = arr.length;

        int freq = 1, i = 1;

        while(i < n) {
            while (i < n && arr[i] == arr[i - 1]) {
                freq++;
                i++;
            }
            System.out.println(arr[i - 1] + " " + freq);
            i++;
            freq = 1;
        }
        if(n==1 || arr[n-1] != arr[n-2]){
            System.out.print(arr[n-1] + " " + 1);
        }
    }

    public static void main(String[] args) {
	// write your code here
        int arr[] = {10, 10, 10, 25, 30, 30};

        printFreq(arr);
    }
}
