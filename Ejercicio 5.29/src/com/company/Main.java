package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Dime un número entero positivo: ");
        int var2 = var1.nextInt();

        System.out.print("Dime otro número: ");
        int var3 = var1.nextInt();

        System.out.print("Los números enteros positivos menores que " + var2);
        System.out.println(" que no son divisibles entre " + var3 + " son los siguientes:");

        for(int var4 = 1; var4 < var2; ++var4)
        {
            if (var4 % var3 != 0)
            {
                System.out.print(var4 + " ");
            }
        }
    }
}
