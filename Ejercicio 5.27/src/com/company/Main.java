package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Dime un número: ");
        int var2 = var1.nextInt();
        int var3 = 0;
        int var4 = 0;

        for(int var5 = 0; var5 <= var2; var5 += 3)
        {
            System.out.println(var5);
            ++var3;
            var4 += var5;
        }

        System.out.print("\n Son " + var3 + " números que suman " + var4);
    }
}
