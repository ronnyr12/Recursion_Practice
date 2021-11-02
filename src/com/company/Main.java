package com.company;

public class Main {

    public static void main(String[] args) {
	//testing recursion
        System.out.println(power(2,3));

        System.out.println("yahav isnt vegan!");

    }


    public static int power(int a, int b)
    {
        if (b == 0)
            return 1;
        return power (a, b - 1) * a;
    }

}
