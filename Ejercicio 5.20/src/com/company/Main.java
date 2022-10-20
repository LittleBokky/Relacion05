package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Introduzca la altura de la pirámide: ");
        int var2 = var1.nextInt();
        System.out.print("Introduzca el carácter de relleno: ");
        String var3 = var1.next();
        int var4 = 1;
        boolean var5 = false;
        int var6 = var2 - 1;

        int var8;
        for(int var7 = 0; var4 < var2; var7 += 2)
        {
            for(var8 = 1; var8 <= var6; ++var8)
            {
                System.out.print(" ");
            }

            System.out.print(var3);

            for(var8 = 1; var8 < var7; ++var8)
            {
                System.out.print(" ");
            }

            if (var4 > 1)
            {
                System.out.print(var3);
            }

            System.out.println();
            ++var4;
            --var6;
        }

        for(var8 = 1; var8 < var4 * 2; ++var8)
        {
            System.out.print(var3);
        }
    }
}
