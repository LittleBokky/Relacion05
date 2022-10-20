package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Introduzca la altura del triángulo equilatero: ");
        int var2 = var1.nextInt();
        System.out.print("Introduzca el carácter de relleno: ");
        String var3 = var1.next();
        int var4 = 1;
        int var5 = 1;

        for(int var6 = var2 - 1; var4 <= var2; var5 += 2)
        {
            int var7;
            for(var7 = 1; var7 <= var6; ++var7)
            {
                System.out.print(" ");
            }

            for(var7 = 1; var7 <= var5; ++var7)
            {
                System.out.print(var3);
            }

            System.out.println();
            ++var4;
            --var6;
        }
    }
}
