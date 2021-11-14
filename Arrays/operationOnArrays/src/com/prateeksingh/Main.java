package com.prateeksingh;

public class Main {

    public static int linearSearch(int arr[], int x){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            if(arr[i] == x)
                return i;
        }
        return -1;
    }

    public static int[] insertion(int arr[], int x, int pos){

        int idx = pos - 1;

        for(int i = 3; i >= idx; i--){
            arr[i+1] = arr[i];
        }
        arr[idx] = x;

        return arr;
    }

    public static void main(String[] args) {
        // Linear Search
//        int arr[] = {20,5,7,25};
//        int x = 5;
//        int idx = linearSearch(arr, x);
//        System.out.println(arr[idx]);

        //Insertion in an array

        int arr[] = new int[5];

        arr[0] = 1;
        arr[1] = 5;
        arr[2] = 20;
        arr[3] = 7;

        int x = 10;
        int pos =2;

        int array[] = insertion(arr, x, pos);

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
