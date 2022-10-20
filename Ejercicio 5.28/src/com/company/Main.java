package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner var1 = new Scanner(System.in);

        int var2;
        do {
            System.out.print("Dime un número entero: ");
            var2 = var1.nextInt();

            if (var2 < 0)
            {
                System.out.println("El número introducido no es correcto.");
            }
        }
        while(var2 < 0);

        int var3 = var2;
        
        if (var2 == 0)
        {
            System.out.println("0! = 1");
        } else
            {
            for(int var4 = 1; var4 < var2; ++var4)
            {
                var3 *= var4;
            }

            System.out.println(var2 + "! = " + var3);
        }
    }
}
