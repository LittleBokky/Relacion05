package com.company;

import java.util.Scanner;

public class Main {

    //Escribe un programa que lea una lista de diez números y determine cuántos
    //son positivos, y cuántos son negativos.

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Dime 10 numeros: ");
        n = sc.nextInt();
        int negativos = 0;
        int positivos = 0;

        for (int i = 0; i < 10; i++)
        {
            if (n < 0)
            {
                negativos++;
            }
            else
                {
                positivos++;
                }
         }
        System.out.println("Has escrito " + positivos + " positivos y " + negativos + " negativos.");
    }
}
