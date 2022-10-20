package com.company;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Introduzca tantos números como desee, se parará al insertar un número negativo.");
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;


        while(var2 >= 0) {
            ++var3;
            System.out.println("Número " + var3);
            var2 = var1;
            if (var2 % 2 != 0) {
                var5 += var2;
                ++var4;
            }

            if (var2 > var5) {
                var5 = var2;
            }
        }

        System.out.println("Se han introducido " + (var3 - 1) + " números.");
        System.out.println("La media de los impares es de " + (double)(var5 / var4));
        System.out.println("El número par más grande fue " + var5);

    }
}
