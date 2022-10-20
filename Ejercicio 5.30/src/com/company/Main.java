package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner var1 = new Scanner(System.in);
        byte var2 = 0;
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        String var8 = "";
        String var9 = "";
        boolean var10 = true;

        byte var15;
        int var16;
        do {
            System.out.println("\nPor favor, introduzca la primera hora.");

            boolean var11;
            do {
                var11 = true;
                System.out.print("Día: ");
                String var6 = var1.next();
                byte var13 = -1;
                switch(var6.hashCode())
                {
                    case -1439023607:

                        if (var6.equals("miércoles"))
                        {
                            var13 = 4;
                        }
                        break;
                    case -1149099798:
                        if (var6.equals("jueves"))
                        {
                            var13 = 6;
                        }
                        break;
                    case -1081297404:
                        if (var6.equals("martes"))
                        {
                            var13 = 2;
                        }
                        break;
                    case -791806760:
                        if (var6.equals("sábado"))
                        {
                            var13 = 10;
                        }
                        break;
                    case 49:
                        if (var6.equals("1"))
                        {
                            var13 = 1;
                        }
                        break;
                    case 50:
                        if (var6.equals("2"))
                        {
                            var13 = 3;
                        }
                        break;
                    case 51:
                        if (var6.equals("3"))
                        {
                            var13 = 5;
                        }
                        break;
                    case 52:
                        if (var6.equals("4"))
                        {
                            var13 = 7;
                        }
                        break;
                    case 53:
                        if (var6.equals("5"))
                        {
                            var13 = 9;
                        }
                        break;
                    case 54:
                        if (var6.equals("6"))
                        {
                            var13 = 11;
                        }
                        break;
                    case 55:
                        if (var6.equals("7"))
                        {
                            var13 = 13;
                        }
                        break;
                    case 103334771:
                        if (var6.equals("lunes"))
                        {
                            var13 = 0;
                        }
                        break;
                    case 454093564:
                        if (var6.equals("viernes"))
                        {
                            var13 = 8;
                        }
                        break;
                    case 1837791503:
                        if (var6.equals("domingo"))
                        {
                            var13 = 12;
                        }
                }

                switch(var13)
                {
                    case 0:
                    case 1:
                        var2 = 1;
                        var8 = "lunes";
                        break;
                    case 2:
                    case 3:
                        var2 = 2;
                        var8 = "martes";
                        break;
                    case 4:
                    case 5:
                        var2 = 3;
                        var8 = "miercoles";
                        break;
                    case 6:
                    case 7:
                        var2 = 4;
                        var8 = "jueves";
                        break;
                    case 8:
                    case 9:
                        var2 = 5;
                        var8 = "viernes";
                        break;
                    case 10:
                    case 11:
                        var2 = 6;
                        var8 = "sábado";
                        break;
                    case 12:
                    case 13:
                        var2 = 7;
                        var8 = "domingo";
                        break;
                    default:
                        var11 = false;
                }

                if (!var11) {
                    System.out.println("No se ha introducido correctamente el día de la semana.");
                    System.out.print("Los días válidos son: lunes, martes, miércoles, ");
                    System.out.println("jueves, viernes, sábado y domingo.");
                }
            } while(!var11);

            boolean var12;
            do {
                var12 = true;
                System.out.print("Hora: ");
                var16 = var1.nextInt();
                if (var16 < 0 || var16 > 23) {
                    System.out.println("No se ha introducido correctamente la hora del día.");
                    System.out.println("Las horas válidas están entre 0 y 23.");
                    var12 = false;
                }
            } while(!var12);

            System.out.println("Por favor, introduzca la segunda hora.");

            do {
                var10 = true;
                var11 = true;
                System.out.print("Día: ");
                String var7 = var1.next();
                byte var14 = -1;
                switch(var7.hashCode()) {
                    case -1439023607:
                        if (var7.equals("miércoles")) {
                            var14 = 4;
                        }
                        break;
                    case -1149099798:
                        if (var7.equals("jueves")) {
                            var14 = 6;
                        }
                        break;
                    case -1081297404:
                        if (var7.equals("martes")) {
                            var14 = 2;
                        }
                        break;
                    case -791806760:
                        if (var7.equals("sábado")) {
                            var14 = 10;
                        }
                        break;
                    case 49:
                        if (var7.equals("1")) {
                            var14 = 1;
                        }
                        break;
                    case 50:
                        if (var7.equals("2")) {
                            var14 = 3;
                        }
                        break;
                    case 51:
                        if (var7.equals("3")) {
                            var14 = 5;
                        }
                        break;
                    case 52:
                        if (var7.equals("4")) {
                            var14 = 7;
                        }
                        break;
                    case 53:
                        if (var7.equals("5")) {
                            var14 = 9;
                        }
                        break;
                    case 54:
                        if (var7.equals("6")) {
                            var14 = 11;
                        }
                        break;
                    case 55:
                        if (var7.equals("7")) {
                            var14 = 13;
                        }
                        break;
                    case 103334771:
                        if (var7.equals("lunes")) {
                            var14 = 0;
                        }
                        break;
                    case 454093564:
                        if (var7.equals("viernes")) {
                            var14 = 8;
                        }
                        break;
                    case 1837791503:
                        if (var7.equals("domingo")) {
                            var14 = 12;
                        }
                }

                switch(var14) {
                    case 0:
                    case 1:
                        var15 = 1;
                        var9 = "lunes";
                        break;
                    case 2:
                    case 3:
                        var15 = 2;
                        var9 = "martes";
                        break;
                    case 4:
                    case 5:
                        var15 = 3;
                        var9 = "miércoles";
                        break;
                    case 6:
                    case 7:
                        var15 = 4;
                        var9 = "jueves";
                        break;
                    case 8:
                    case 9:
                        var15 = 5;
                        var9 = "viernes";
                        break;
                    case 10:
                    case 11:
                        var15 = 6;
                        var9 = "sábado";
                        break;
                    case 12:
                    case 13:
                        var15 = 7;
                        var9 = "domingo";
                        break;
                    default:
                        var15 = 0;
                }

                if (!var11) {
                    System.out.println("No se ha introducido correctamente el día de la semana.");
                    System.out.print("Los días válidos son: lunes, martes, miércoles, ");
                    System.out.println("jueves, viernes, sábado y domingo.");
                }
            } while(!var11);

            if (var15 <= var2) {
                System.out.println("El segundo día debe ser posterior al primero.");
                var10 = false;
            }

            if (var10) {
                do {
                    var12 = true;
                    System.out.print("Hora: ");
                    var5 = var1.nextInt();
                    if (var5 < 0 || var5 > 23) {
                        System.out.println("No se ha introducido correctamente la hora del día.");
                        System.out.println("Las horas válidas están entre 0 y 23.");
                        var12 = false;
                    }
                } while(!var12);
            }
        } while(!var10);

        System.out.print("Entre las " + var16 + ":00h del " + var8);
        System.out.print(" y las " + var5 + ":00h del " + var9);
        System.out.println(" hay " + (var15 * 24 + var5 - (var2 * 24 + var16)) + " hora/s.");

    }
}
