package com.prateeksingh;

public class Main {

    public static void bonacciSeries(int n, int m){

        int a[] = new int[m];
        for(int i = 0; i < m; i++)
            a[i] = 0;

        a[n-1] = 1;
        a[n] = 1;

        for(int i = n+1; i < m; i++)
            a[i] = 2*a[i-1]-a[i-n-1];

        for(int i = 0; i < m; i++)
            System.out.print(a[i] + " ");
    }

    public static void main(String[] args) {
	// write your code here
        int N = 5, M = 15;

        bonacciSeries(N ,M);
    }
}
