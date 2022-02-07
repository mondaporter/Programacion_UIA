package com.company;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //pedirConShowInputDialog();
        //pedirConScanner();
        pedirConBufferReader();

    }

    static  void pedirConScanner(){

        // Clase Scanner - permite obtener la entrada de datos primitivos

        Scanner teclado = new Scanner(System.in);

        // Enteros

        System.out.println("Cual es el año actual?");
        int year = teclado.nextInt();
        System.out.println("El año actual es " + year);

        // Float

        System.out.println("Introduzca la coordenada x");
        float coord = teclado.nextFloat();
        System.out.println("La coordenada x es " + coord);

        // Double

        System.out.println("¿Cuál es el importe total?");
        double cuenta = teclado.nextDouble();
        System.out.println("El importe total es $" + cuenta);

        // next

        System.out.println("¿Como te llamas?");
        String nombre = teclado.next();
        System.out.println("Tu nombre es " + nombre);

    }

    static void pedirConShowInputDialog() {

        // en Cadena
        String name = JOptionPane.showInputDialog("Cuál es tu nombre?");
        JOptionPane.showMessageDialog(null, "Tu nombre es " + name);

        // Numbero entero
       int entero = Integer.parseInt(JOptionPane.showInputDialog("Inserte un entero:"));
       JOptionPane.showMessageDialog(null, "El número es: " + entero);

       // Caracter individual
       char letra = JOptionPane.showInputDialog("¿Cuál es la primera letra de tu nombre?").charAt(0);
       JOptionPane.showMessageDialog(null, "El caracter es: " + letra);

       // Numero decimal
       double decimal = Double.parseDouble(JOptionPane.showInputDialog("¿Cuál es la estatura?"));
       JOptionPane.showMessageDialog(null,"La Estatura es: " + decimal);

    }

    static void pedirConBufferReader() {

        // BufferedReader depende directamente de InputStreamReader, pues lo inicializa.
        InputStreamReader entrada = new InputStreamReader(System.in); // Guarda la entrada de texto
        BufferedReader teclado = new BufferedReader(entrada);  // Lo lee en la memoria

        // En un String

        try {
            // Lee el string
            System.out.println("¿Cuál es tu nombre?");
            String nombre = teclado.readLine();
            System.out.println("Tu nombre es " + nombre);

        } catch (Exception e) {  //el error por lo que se interrumpe el flujo se almacena en e

            System.out.println("Ups, es un dato erróneo.");
            System.out.println(e); // Imprimirá el error de la consola.
        }

        // Ahora en un entero

        try {
            System.out.println("Introduce un número entero");
            int entero = Integer.parseInt(teclado.readLine());
            System.out.println("El número es: " + entero);

        } catch (Exception e) {

            System.out.println("Ups, es un error");
            System.out.println(e);
        }

        // Como es con un caracter
        try {
            System.out.println("Introduce tu Apellido");
            char inicial = teclado.readLine().charAt(0);
            System.out.println("La inicial de tu apellido es: " + inicial);

        } catch (Exception e) {

            System.out.println("Ups, es un error");
            System.out.println(e);
        }

        // Y un decimal
        try {
            System.out.println("Introduce la estatura");
            double height = Double.parseDouble(teclado.readLine());
            System.out.println("Tu estatura es: " + height);

        } catch (Exception e) {

            System.out.println("Ups es un error");
            System.out.println(e);
        }
    }
}

