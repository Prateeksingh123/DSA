package com.prateeksingh;

public class Main {

    public static int maxEvenOdd(int arr[]){
        int n = arr.length;
        int res = 1, curr = 1;

        for(int i = 1; i < arr.length; i++){
            if((arr[i]%2 == 0 && arr[i-1]%2 != 0) || (arr[i]%2 != 0 && arr[i-1]%2 == 0)) {
                curr++;
                res = Math.max(res, curr);
            }else
                curr = 1;
        }
        return res;
    }

    public static void main(String[] args) {
	// write your code here
        int arr[] = {10, 12, 14, 7, 8};

        System.out.print(maxEvenOdd(arr));
    }
}
