package com.company;

public class Main {

    public static int fib(int a) {
        switch (a) {
            case 0:
                return 0;
            case 1:
                return 1;
                default:
                    return fib(a - 1) + fib(a - 2);

        }
    }

    public static void main(String[] args) {
	// write your code here
        int a = 2;
        long time = 0;
        long timeMillis = System.currentTimeMillis() / 1000;
        while (time <= 60){
            fib(a);
            long timeMillis1 = System.currentTimeMillis() / 1000;
            time = (int) (timeMillis1 - timeMillis);
            a++;
        }
        System.out.println(a);
        System.out.print(time);
        System.currentTimeMillis();







    }
}
