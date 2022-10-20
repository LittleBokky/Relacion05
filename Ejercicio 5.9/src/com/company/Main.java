package com.company;

import java.util.Scanner;

public class Main {

    //Realiza un programa que nos diga cuántos dígitos tiene un número introducido
    //por teclado.

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n2 = 0, nDig = 1;

        System.out.print("Dime un numero: ");

        long n1 = n2;

        while (n1 > 10)
        {
            nDig++;
            n1 /= 10;
        }

        System.out.println(n2 + " tiene " + nDig + " dígito/s.");

    }
}
