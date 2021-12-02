package com.tsdv.dttung;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = nextInt("Enter n: ");
        int m = nextInt("Enter m: ");
        try {
            int p = division(n, m);
            System.out.println("p = " + p);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static int nextInt(String prompt) {
        System.out.print(prompt);
        int n = 0;
        boolean invalidInput = true;
        while (invalidInput) {
            try {
                Scanner sc = new Scanner(System.in);
                n = sc.nextInt();
                invalidInput = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Try again!");
                System.out.print(prompt);
            }
        }
        return n;
    }
    public static int division(int a, int b) throws Exception {
        if (b == 0) throw new Exception("Loi chia cho 0!");
        return a/b;
    }

}
