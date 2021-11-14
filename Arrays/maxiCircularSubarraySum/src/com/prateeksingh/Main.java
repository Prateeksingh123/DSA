package com.prateeksingh;

public class Main {

    public static int normalMaxSum(int arr[]){
        int n = arr.length;
        int res = arr[0], maxEnding = arr[0];

        for(int i = 1; i < n; i++){
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }

    public static int overallMaxSum(int arr[]){
        int n = arr.length;

        int max_normal = normalMaxSum(arr);
        if(max_normal < 0)
            return max_normal;

        int arr_sum = 0;
        for(int i = 0; i < n; i++){
            arr_sum += arr[i];
            arr[i] = -arr[i];
        }
        int max_circular = arr_sum + normalMaxSum(arr);

        return Math.max(max_normal, max_circular);
    }

    public static void main(String[] args) {
	// write your code here
        int arr[] = {3, -4, 5, 6, -8, 7};

        System.out.print(overallMaxSum(arr));
    }
}
