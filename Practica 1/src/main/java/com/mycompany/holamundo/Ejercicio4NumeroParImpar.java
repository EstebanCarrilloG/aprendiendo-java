/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.holamundo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ESTEBAN Mostrar si el numero ingresado es par o impar
 *
 */
public class Ejercicio4NumeroParImpar {

    public static void main(String[] args) throws IOException {

        boolean continuar;

        do {
            try {
                continuar = false;
                System.out.println("Ingrese el numero:");
                int primerNumero = cargarNumero();
                String resultado = primerNumero % 2 == 0 ? "par" : "impar";
                System.out.println("El numero ingresado es: " + resultado);
            } catch (NumberFormatException ex) {
                System.out.println("Error:Solo se admiten numeros enteros.");
                continuar = true;
            }
        } while (continuar);
    }

    private static int cargarNumero() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numeroUno = br.readLine();
        int numero = Integer.parseInt(numeroUno);
        return numero;
    }

}
