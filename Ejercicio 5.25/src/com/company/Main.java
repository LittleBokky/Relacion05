package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int var2 = var1.nextInt();

        int var3;
        for(var3 = 0; var2 > 0; var2 /= 10)
        {
            var3 = var3 * 10 + var2 % 10;
        }

        System.out.println("El número al revés es " + var3);
    }
}
