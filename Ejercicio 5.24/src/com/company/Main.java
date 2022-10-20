package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Introduzca la altura de la pirámide: ");
        int var2 = var1.nextInt();
        int var3 = 1;
        boolean var4 = false;

        for(int var5 = var2 - 1; var3 <= var2; --var5)
        {
            int var6;
            for(var6 = 1; var6 <= var5; ++var6)
            {
                System.out.print(" ");
            }

            for(var6 = 1; var6 < var3; ++var6)
            {
                System.out.print(var6);
            }

            for(var6 = var3; var6 > 0; --var6)
            {
                System.out.print(var6);
            }

            System.out.println();
            ++var3;
        }
    }
}
