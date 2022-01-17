// TSU SOFTWARE - PROGRAMACION
// ALUMNO: JORGE H. LUNA SALAZAR
// FECHA: 15.01.2022

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ---- TIPOS DE DATOS ----
        // Primitivos (Se escriben con minúsculas siempre)
        // Numericos: byte, short, int, long, float, double
        // Caracter: char

        // Se usan comillas simples! Y solo una letra
        char name = 'E';

        // Estructurados: (Se usa una mayúscula en la primera letra)
        // String (cadenas)
        // Arreglos
        // Clases

        // ---- ENTRADA Y SALIDA ----
        // - Salida: System.out.println()
        // - Entrada: Scanner entrada = new Scanner(System.in); y entrada.nextInt();

        int a;
        int b;
        int c;
        int d;
        int e;
        double f;

        // String lleva comillas dobles
        String persona = "Jorge";
        System.out.println("Buen día, " + persona);

        // Crear un nuevo objeto que permite entrada de datos desde el teclado
        Scanner entrada = new Scanner(System.in);

        // Variables para operar càlculos aritméticos
        System.out.println("Ingresa un numero entero:");
        a = entrada.nextInt();

        System.out.println("Ingresa un número entero:");
        b = entrada.nextInt();

        // Multiplicar dos variables enteras
        c = a * b;

        // Impresión de los valores
        System.out.println(a + " * " + b + " = " + c);

        // Suma de las dos variables
        d = c + a;
        System.out.println(c + " + " + a + " = " + d);

        // Resta de dos variables
        e = d - b;
        System.out.println(d + " - " + b + " = " + e);

        // Division de dos variables
        f = (double) b / a;
        System.out.println(b + " / " + a + " = " + f);

    }
}
