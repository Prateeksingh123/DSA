package com.prateeksingh;

public class Main {

    public static int findMajority(int arr[]){
        int n = arr.length;
        int res = 0, count = 1;

        for(int i = 1; i < n; i++){
            if(arr[res] == arr[i])
                count++;
            else
                count--;

            if(count == 0){
                res = i;
                count = 1;
            }
        }

        count = 0;
        for(int i = 0; i < n; i++){
            if(arr[res] == arr[i])
                count++;
        }

        if(count <= n/2)
            res = -1;

        return res;
    }

    public static void main(String[] args) {
	// write your code here
        int arr[] = {3, 7, 4, 7, 7, 5};

        int idx = findMajority(arr);

        if(idx == -1)
            System.out.println(idx);
        else
            System.out.println(arr[idx]);
    }
}
