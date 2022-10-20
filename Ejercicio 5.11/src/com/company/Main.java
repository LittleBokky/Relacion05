package com.company;

import java.util.Scanner;

public class Main {

    //Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
    //los 5 primeros números enteros a partir de uno que se introduce por teclado.

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Dime un numero: ");
        n = sc.nextInt();

        System.out.println("   n  |    n²   |    n³");
        System.out.println("---------------------------");
        for (int i = n; i < n + 5; i++)
        {
            System.out.printf("%5d |%8d |%9d\n", i, i * i, i * i * i);
        }
    }
}
