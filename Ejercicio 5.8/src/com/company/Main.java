package com.company;

import java.util.Scanner;

public class Main {

    //Muestra la tabla de multiplicar de un número introducido por teclado.

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Dime un numero: ");
        n = sc.nextInt();

        for (int i = 0; i <= 10; i++)
        {
            System.out.printf("%d x %2d = %3d\n", n, i, n * i);
        }
    }
}
