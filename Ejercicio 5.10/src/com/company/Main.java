package com.company;

import java.util.Scanner;

public class Main {

    //Escribe un programa que calcule la media de un conjunto de números positivos
    //introducidos por teclado. A priori, el programa no sabe cuántos números se
    //introducirán. El usuario indicará que ha terminado de introducir los datos
    //cuando meta un número negativo.

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double n = 0;
        double numInt = 0;
        double suma = 0;


        System.out.println("Dime un numero negativo: ");
        System.out.println("Dime más numeros: ");

        while (numInt >= 0)
        {
            numInt = sc.nextDouble();
            n++;
            suma += numInt;
        }

        System.out.print("La media de los números es: ");
        System.out.println((suma - numInt) / (n - 1));
    }
}
