package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Dime un número: ");
        long var2 = var1.nextLong();

        System.out.print("Dime otro número: ");
        long var4 = var1.nextLong();
        long var6 = var2;
        long var8 = 0L;
        int var10 = 0;

        if (var2 == 0L)
        {
            var10 = 1;
        }

        while(var6 > 0L)
        {
            var8 = var8 * 10L + var6 % 10L;
            var6 /= 10L;
            ++var10;
        }

        var6 = var4;

        long var11;

        for(var11 = 0L; var6 > 0L; var6 /= 10L)
        {
            var11 = var11 * 10L + var6 % 10L;
        }

        long var13 = 0L;
        long var15 = 0L;

        for(int var18 = 0; var18 < var10; ++var18)
        {
            int var17 = (int)(var8 % 10L);

            if (var17 % 2 == 0)
            {
                var13 = var13 * 10L + (long)var17;
            } else
                {
                var15 = var15 * 10L + (long)var17;
                }

            var17 = (int)(var11 % 10L);
            if (var17 % 2 == 0)
            {
                var13 = var13 * 10L + (long)var17;
            }
            else
                {
                var15 = var15 * 10L + (long)var17;
                }

            var8 /= 10L;
            var11 /= 10L;
        }

        System.out.println("El número con pares es: " + var13);
        System.out.println("El número con impares es: " + var15);
    }
}
