package pl.javastart.task;

import java.util.Scanner;

class ArrayCalculator {
    private int[] arr;
    private final Scanner sc = new Scanner(System.in);

    void run() {
        createArray();
        fillInArray();
        printSumOfPoweredNumbers();
    }

    private void printSumOfPoweredNumbers() {
        System.out.println("Suma kwadratów wprowadzonych liczb to " + countSumOfPowers());
    }

    private int countSumOfPowers() {
        int sum = 0;

        for (int cell : arr) {
            sum += Math.pow(cell, 2);
        }

        return sum;
    }

    private void fillInArray() {
        System.out.println("Wprowadź " + arr.length + " liczb:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sc.nextLine();
        }
    }

    private void createArray() {
        System.out.println("Podaj rozmiar tablicy:");
        int length = sc.nextInt();
        sc.nextLine();
        arr = new int[length];
    }
}
