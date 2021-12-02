package com.tsdv.dttung;

public class FractionProgram {
    public void run() {
        boolean running = true;
        while (running) {
            printMenu();
            int choice = nextInt("Enter your choice: ");
            doTask(choice);
            if (choice == 0) running = false;
        }
    }

    private void doTask(int choice) {
        switch (choice) {
            case 1: demoAddition(); break;
            case 2: demoSubtraction(); break;
            case 3: demoDivision(); break;
            case 4: demoMultiplication(); break;
            case 0: break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    private void demoAddition() {
        Fraction f1 = nextFraction();
        Fraction f2 = nextFraction();
        Fraction f3 = f1.add(f2);
        System.out.println(f1 + " + " + f2 + " = " + f3);
    }

    private int nextInt(String s) {
        return 0;
    }

    private void printMenu() {
    }
}
