package com.company;

import java.util.Scanner;

public class Main {

    //Realiza el control de acceso a una caja fuerte. La combinación será un
    //número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
    //acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
    //y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
    //Tendremos cuatro oportunidades para abrir la caja fuerte.

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int intentos = 4, n;
        boolean acertado = false;

        do {
            System.out.print("Dime el codigo: ");
            n = sc.nextInt();

            if (n == 5356)
            {
                acertado = true;
            }
            else
                {
                System.out.println("Codigo incorrecto");
                 }

            intentos--;

        }
        while((intentos > 0) && (!acertado));

        if (acertado)
        {
            System.out.println("Has abierto la caja");
        }
        else
            {
            System.out.println("No puedes intentarlo más");
            }
    }
}
