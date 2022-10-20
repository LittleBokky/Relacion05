package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Dime un número: ");
        long var2 = var1.nextLong();

        System.out.print("Dime un dígito: ");
        int var4 = Integer.parseInt(System.console().readLine());
        
        long var5 = var2 * 10L + 1L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 1;

        if (var5 == 0L)
        {
            var9 = 1;
        }

        while(var5 > 0L)
        {
            var7 = var7 * 10L + var5 % 10L;
            var5 /= 10L;
            ++var9;
        }

        while(var7 != 1L) {
            if (var7 % 10L == (long)var4)
            {
                System.out.print(var10 + " ");
            }

            var7 /= 10L;
            ++var10;
        }

    }
}
