package com.company;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        // task37();
        task62();
        // task87();
        // task112();
        // task137();
    }

    /**
     * Задан массив, содержащий несколько нулевых элементов.
     * Сжать его, выбросив эти элементы.
     */
    private static void task137() {
        Random random = new Random();
        int arr[];
        Scanner num = new Scanner(System.in);
        System.out.println("Enter all array element: ");
        int n = num.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10 - 4);
        }
        System.out.println("Array before compression : " + Arrays.toString(arr));
        int temp;
        int count = 0, count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] != 0)) {
                temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count = count + 1;
            }
        }
        int[] arr1 = new int[arr.length];
        int i;
        for (i = 0; i < arr.length; i++) {
            if ((arr[i] == 0)) {
                count1++;
            }
        }
        arr = Arrays.copyOf(arr, arr.length - count1);
        System.out.println("Array after compression : " + Arrays.toString(arr));
    }

    /**
     * В одномерный массив целых чисел на место минимального элемента вставить максимальный элемент.
     */
    private static void task112() {
        Random random = new Random();
        int[] arr;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter array element: ");
        int n = num.nextInt();
        arr = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = (int) (Math.random() * 100 + 2);
        }
        int max, min, indexmax = 0, indexmin = 0;
        System.out.println(Arrays.toString(arr));
        min = max = arr[0];
        for (int i = 0; i <= n - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
                indexmax = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                indexmin = i;
            }
        }
        arr[indexmax] = min;
        arr[indexmin] = max;
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Имеется список учащихся класса с указанием роста каждого из них.
     * Выяснить, перечислены ли ученики в списке в порядке убывания их роста.
     */
    private static void task87() {
        Random random = new Random();
        Integer arr[], arr1[];
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of student: ");
        n = scanner.nextInt();
        arr = new Integer[n];
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = (int) (Math.random() * 40 + 150);
        }
        System.out.println("All student before sorting: " + Arrays.toString(arr));
        arr1 = Arrays.copyOf(arr, arr.length);
        //  arr1 = arr.clone();
       /* int temp, r;
        boolean flag;
        flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < arr1.length - 1; i++) {
                // r = (int)(Math.random()*n);
                if (arr1[i] < arr1[i + 1]) {
                    temp = arr1[i];
                    arr1[i] = arr1[i + 1];
                    arr1[i + 1] = temp;
                    flag = true;
                }
         }
          }*/
        Arrays.sort(arr1, Collections.reverseOrder());
        System.out.println("All student after sorting:" + Arrays.toString(arr1));
        if (Arrays.equals(arr, arr1))
            System.out.println("Student are not listed in descending order");
        else {
            System.out.println("Student are listed in descending order");
        }
    }

    /**
     * Найти сумму четных элементов массива целых чисел.
     */
    private static void task62() {
        Random random = new Random();
        int arr[], n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter all numbers array element: ");
        n = scanner.nextInt();
        arr = new int[n];
        int sum = 0;
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println("Array: " + Arrays.toString(arr));
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] % 2 != 1) {
                sum = sum + arr[i];
            }
        }
        System.out.println("Sums of all even array elements: " + sum);
    }


    /**
     * Даны натуральные числа а1, а2, ..., an.
     * Указать те из них, у кот. остаток от деления на М равен L (0 ≤ L ≤ M – 1).
     */
    private static void task37() {
        Random random = new Random();
        float arr[];
        float L;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number of array elements:");
        int n = num.nextInt();
        System.out.println("Enter divisor:");
        int M = num.nextInt();
        arr = new float[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 30);
            System.out.println("Array element " + i + ":\t" + arr[i]);
            L = arr[i] / M;
            if (L <= M - 1 && L >= 0) {
                arr[i] = L;
                System.out.println("Final result" + i + ":\t" + arr[i]);
            }
        }
    }
}


