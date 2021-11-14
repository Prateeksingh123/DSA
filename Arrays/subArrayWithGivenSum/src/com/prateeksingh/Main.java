package com.prateeksingh;

public class Main {

    public static boolean isSubSum(int arr[], int sum){
        int n = arr.length;
        int curr_sum = arr[0], s = 0;

        for(int e = 1; e < n; e++){
            while((curr_sum > sum) && (s < e-1)){
                curr_sum -= arr[s];
                s++;
            }
            if(curr_sum == sum)
                return true;
            if(e < n)
                curr_sum += arr[e];
        }
        return (curr_sum == sum);
    }

    public static void main(String[] args) {
	// write your code here
        int arr[] = {1, 4, 20, 3, 10, 5};
        int sum = 33;

        System.out.println(isSubSum(arr, sum));
    }
}
