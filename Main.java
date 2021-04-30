package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch ((number + 44 + 1) / 45) {
            case 1:
                System.out.println("0-44");
                break;
            case 2:
                System.out.println("45-89");
                break;
            case 3:
                System.out.println("90-134");
                break;
            default:
                System.out.println("Vochmiban");
        }

    }
}


