package com.company;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(sum(1, 8));
        System.out.println(count(19876666));
    }

    public static int sum(int a, int b) {
        if (a==0||b==0)
            return 0;
        if (b == 1)
            return a;
        return (sum(a, b - 1) + a);


    }
     public static int count (int a) {
        if (a<10)
            return 1;
        return count(a/10)+1;
     }
}
