package com.prateeksingh;

public class Main {

    public static int[] reverseAnArray(int arr[]){
        int n = arr.length;
        int low = 0, high = n-1;

        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }

        return arr;
    }

    public static void main(String[] args) {
	// write your code here
        int arr[] = {10, 5, 7, 30};

        int array[] = reverseAnArray(arr);

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
