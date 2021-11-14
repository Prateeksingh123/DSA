package com.prateeksingh;

public class Main {

    public static int[] rotateByOne(int arr[]){
        int n = arr.length;
        int temp = arr[0];
        int i;

        for(i = 0; i < n-1; i++){
            arr[i] = arr[i+1];
        }
        arr[i] = temp;

        return arr;
    }

    public static void main(String[] args) {
	// write your code here
        int arr[] = {30, 5, 20};

        int array[] = rotateByOne(arr);

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
