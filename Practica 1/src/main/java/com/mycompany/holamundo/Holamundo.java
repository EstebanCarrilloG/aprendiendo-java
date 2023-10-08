/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.holamundo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ESTEBAN
 */
public class Holamundo {

    public static void main(String[] args) {

        System.out.println("---- Hola mundo ----");

        String nombre = "Esteban";
        Integer followersInstagram = 255;
        Integer followersYoutube = 900;
        String frase = "Hola, mi nombre es " + nombre + "tengo " + (followersInstagram + followersYoutube) + " followers.";

        System.out.println(frase);

        /* ----------------------------- */
        // Input por consola
        
        Scanner teclado = new Scanner(System.in);
        int edad;
        boolean continua;
        do {
            try {
                continua = false;
                System.out.print("Ingrese un valor entero:");
                edad = teclado.nextInt();
                String mensaje = edad >= 18 ? "Es mayor de edad" : "Es menor de edad";
                System.out.println(mensaje);

            } catch (InputMismatchException ex) {
                System.out.println("Debe ingresar obligatoriamente un número entero.");
                teclado.next();
                continua = true;
            }
        } while (continua);

    }
}
