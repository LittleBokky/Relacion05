package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Dime números:");
        int var2 = 0;
        int var3 = 0;
        boolean var4 = false;
        int var5 = 0;

        while(var5 < 10000)
        {
            ++var3;
            int var6 = var1.nextInt();
            var5 += var6;
            if (var5 < 10000)
            {
                var2 += var6;
            }
        }

        System.out.println("El total es " + var2);
        System.out.println("Se escribieron " + (var3 - 1) + " números.");
        System.out.println("La media es de " + var2 / var3);
    }
}
