package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Dime la altura de la U: ");
        int var2 = var1.nextInt();

        int var3;
        for(var3 = 1; var3 < var2; ++var3) {
            System.out.print(". ");

            for(int var4 = 2; var4 < var2; ++var4) {
                System.out.print("  ");
            }

            System.out.println(".");
        }

        System.out.print("  ");

        for(var3 = 2; var3 < var2; ++var3) {
            System.out.print(". ");
        }

    }
}
