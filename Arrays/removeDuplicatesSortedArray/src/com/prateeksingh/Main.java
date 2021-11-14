package com.prateeksingh;

public class Main {

    public static int[] remDups(int arr[]){
        int n = arr.length;

        int res = 1;

        for(int i = 1; i < n; i++){
            if(arr[i] != arr[res-1]){
                arr[res]= arr[i];
                res++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
	// write your code here
        int arr[] = {10,20,20,30,30,30,30};

        int array[] = remDups(arr);

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
