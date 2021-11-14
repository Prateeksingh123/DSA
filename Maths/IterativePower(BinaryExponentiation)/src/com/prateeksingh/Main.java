package com.prateeksingh;

public class Main {

    public static int power(int x, int n){
        int res = 1;

        while(n>0){
            if(n%2 != 0)
                res = res*x;

            x = x*x;
            n=n/2;
        }

        return res;
    }

    public static void main(String[] args) {

        System.out.println(power(4,5));

        //Time Complexity: O(log n)
        //Auxiliary Space: O(1)
    }
}
