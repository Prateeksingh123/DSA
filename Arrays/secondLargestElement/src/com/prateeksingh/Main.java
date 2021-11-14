package com.prateeksingh;

public class Main {

    public static int secondLargest(int arr[]){
        int res = -1, largest = 0;
        int n = arr.length;

        for(int i = 1; i < n; i++){
            if(arr[i] > arr[largest]){
                res = largest;
                largest = i;
            }
            else if(arr[i] != arr[largest]) {
                if (res == -1 || arr[i] > arr[res]) {
                    res = i;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
	// write your code here
        int arr[] = {20,10,20,8,12};

        int idx = secondLargest(arr);
        System.out.println(arr[idx]);
    }
}
