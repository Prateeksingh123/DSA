package com.prateeksingh;

public class Main {

    public static int[] moveZeroes(int arr[]){
        int n = arr.length;

        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
	// write your code here
        int arr[] = {0, 0, 0, 10, 0};

        int array[] = moveZeroes(arr);

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
