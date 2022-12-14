package com.company;

import java.util.Scanner;

public class Main {

    //Escribe un programa que muestre los n primeros términos de la serie de
    //Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1
    //y el resto se calcula sumando los dos anteriores, por lo que tendríamos que
    //los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se
    //debe introducir por teclado.

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Dime un numero: ");
        n = sc.nextInt();

        switch (n)
        {
            case 1:
                System.out.print("0");
                break;
            case 2:
                System.out.print("0 1");
                break;
            default:
                System.out.print("0 1");
                
                int f1 = 0;
                int f2 = 1;
                int aux;

                while(n > 2)
                {
                    aux = f1;
                    f1 = f2;
                    f2 = aux + f2;
                    System.out.print(" " + f2);
                    n--;
                }
        }
        System.out.println();
    }
}
