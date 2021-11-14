package com.prateeksingh;

public class Main {

    public static void leftRotate(int arr[], int d){
        int n = arr.length;

        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverse(int arr[], int low, int high){

        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
	// write your code here
        int arr[] = {10, 5, 30, 15};

        leftRotate(arr, 3);
    }
}
