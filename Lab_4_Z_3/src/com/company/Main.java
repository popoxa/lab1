package com.company;

import java.util.Scanner;

public class Main {
    public static int rand(int a, int b){
        if (a > b){
            int c = a;
            a = b;
            b = c;
        }
        return (int) (Math.random()* (( b + 1 ) - a) + a);

    }

    public static void rand (int a){
            System.out.print(a + " ");
            }

    public static void sortirovka(int a[]){
        int i, j, g = 0;
        for(i = a.length - 1; i >= 0; i-- ){
            for (j = 0; j < i; j++){
                if(a[j] > a[j + 1]){
                g = a[j];
                a[j] = a[j+1];
                a[j+1] = g;
                }
            }
        }
    }

    public static void main(String[] args) {
        int m = 0, n = 0, j = 0, i = 0, d;
        int k;
        int a[][] = new int [5][10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число a: ");
        m = sc.nextInt();
        System.out.print("Введите число b: ");
        n = sc.nextInt();
        System.out.println("Укажите номер массива для сортировки: ");
        d = sc.nextInt();
        while (j < 5) {
            int arr[] = new int[10];
            for (i = 0; i < 10; i++) {
                arr[i] = rand(m, n);
                a[j][i] = arr[i];
            }
            if (d - 1  == j) {
                int a1[] = new int[10];
                for (i = 0; i < 10; i++) {
                    a1[i] = a[j][i];
                }
                sortirovka(a1);
                for (i = 0; i < 10; i++) {
                    int h = a1[i];
                    rand(h);
                }
                System.out.println();
            }
            else {
                int a2[] = new int[10];
                for (i = 0; i < 10; i++) {
                    a2[i] = a[j][i];
                }
                for (i = 0; i < 10; i++) {
                    int h = a2[i];
                    rand(h);
                }
                System.out.println();
                }
                j++;
            }
        }



    }

