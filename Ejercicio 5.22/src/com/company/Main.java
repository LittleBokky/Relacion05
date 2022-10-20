package com.company;

public class Main {

    public static void main(String[] args)
    {
        boolean var1 = false;

        for(int var2 = 2; var2 <= 100; ++var2)
        {
            var1 = true;

            for(int var3 = 2; var3 < var2; ++var3)
            {
                if (var2 % var3 == 0)
                {
                    var1 = false;
                }
            }

            if (var1)
            {
                System.out.print(var2 + " ");
            }
        }
    }
}
