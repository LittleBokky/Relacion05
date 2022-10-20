package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Dime un número entero positivo: ");

        long var2 = var1.nextLong();
        long var4 = var2;
        long var6 = 0L;
        int var8 = 0;

        if (var2 == 0L)
        {
            var8 = 1;
        }

        while(var4 > 0L)
        {
            var6 = var6 * 10L + var4 % 10L;
            var4 /= 10L;
            ++var8;
        }

        System.out.print("Dígitos pares: ");
        int var10 = 0;

        for(int var11 = 0; var11 < var8; ++var11)
        {
            int var9 = (int)(var6 % 10L);

            if (var9 % 2 == 0)
            {
                System.out.print(var9 + " ");
                var10 += var9;
            }

            var6 /= 10L;
        }

        System.out.println("\nSuma de los dígitos pares: " + var10);
    }
}
