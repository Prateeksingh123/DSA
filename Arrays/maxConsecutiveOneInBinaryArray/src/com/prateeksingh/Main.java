package com.prateeksingh;

public class Main {

    public static int max(int arr[]){
        int n = arr.length;
        int res = 0, curr = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] == 0)
                curr = 0;
            else{
                curr++;
                res = Math.max(res,curr);
            }
        }

        return res;
    }

    public static void main(String[] args) {
	// write your code here
        int arr[] = {1, 0, 1, 1, 1, 1,  0, 1, 1};

        System.out.println(max(arr));
    }
}
