package com.company;

public class less1 {
    public static void main(String[] args) {

    }

    public static int func1(int x) {
        if (x < 0) return 1;
        return x + func1(x - 2);
    }
}
