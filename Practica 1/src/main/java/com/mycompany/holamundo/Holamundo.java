/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.holamundo;

import java.util.Scanner;

/**
 *
 * @author ESTEBAN
 */
public class Holamundo {

    public static void main(String[] args) {

        String nombre = "Esteban";
        Integer followersInstagram = 255;
        Integer followersYoutube = 900;
        String frase = "Hola, mi nombre es " + nombre + "tengo " + (followersInstagram + followersYoutube) + " followers.";

        System.out.println(frase);

        /* ----------------------------- */
        // Input por consola
        int edad;
        try (
                Scanner reader = new Scanner(System.in) // Reading from System.in
                ) {
            System.out.println("Ingrese un numero: ");
            edad = reader.nextInt(); // Scans the next token of the input as an int.
        }

        Boolean esMayorDeEdad = edad >= 18;

        if (esMayorDeEdad) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}
