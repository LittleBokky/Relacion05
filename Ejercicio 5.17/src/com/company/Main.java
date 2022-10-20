package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Introduzca un numero entero positivo: ");
        int var2 = var1.nextInt();
        int var3 = 0;
        if (var2 < 0)
        {
            System.out.println("Número inválido, introduzca un número positivo.");
        }

        if (var2 > 0)
        {
            for(int var4 = var2; var4 < var2 + 100; ++var4)
            {
                var3 += var4;
            }

            System.out.println("La suma de los 100 siguientes números es " + var3);
        }
    }
}
