package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Introduzca 2 números enteros: ");
        int var2 = var1.nextInt();
        int var3 = var1.nextInt();
        if (var2 == var3) {
            System.out.println("No puede ser el mismo número.");
        }

        int var4;
        if (var3 > var2)
        {
            for(var4 = var2; var4 < var3; var4 += 7)
            {
                System.out.println(var4);
            }
        }

        if (var2 > var3)
        {
            for(var4 = var3; var4 < var2; var4 += 7)
            {
                System.out.println(var4);
            }
        }
    }
}
