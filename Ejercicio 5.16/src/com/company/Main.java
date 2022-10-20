package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Dime un número y te diré si es primo: ");
        int var2 = var1.nextInt();
        boolean var3 = true;

        for(int var4 = 2; var4 < var2; ++var4)
        {
            if (var2 % var4 == 0)
            {
                var3 = false;
            }
        }

        if (var3)
        {
            System.out.println("\nEs primo");
        } else
            {
            System.out.println("\nNo es primo");
            }
    }
}
