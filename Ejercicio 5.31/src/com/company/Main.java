package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Introduzca la altura de la L: ");
        int var2 = var1.nextInt();

        int var3;
        for(var3 = 1; var3 < var2; ++var3)
        {
            System.out.println(".");
        }

        for(var3 = 0; var3 < var2 / 2 + 1; ++var3)
        {
            System.out.print(". ");
        }
    }
}
