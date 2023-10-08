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
 * @author ESTEBAN Calculo de promedio de tres numeros ingresados
 *
 */
public class Ejercicio3NumeroPromedio {

    public static void main(String[] args) throws IOException {

        boolean continuar = true;
        String numero[] = {"primer", "segundo", "tercer"};
        int valor[] = {0, 0, 0};
        int index = 0;
        
        System.out.println("---- Calcular el numero promedio de 3 numeros ----");

        do {
            try {

                System.out.println("Ingrese el " + numero[index] + " numero:");
                valor[index] = cargarNumero();

                index++;

                if (valor[valor.length - 1] != 0) {
                    continuar = false;
                    calcularPromedio(valor[0], valor[1], valor[2]);
                }

            } catch (NumberFormatException ex) {
                System.out.println("Error: Solo se admiten numeros.");
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

    private static void calcularPromedio(int primerNumero, int segundoNumero, int tercerNumero) {

        int sumatoria = (primerNumero + segundoNumero + tercerNumero);
        double promedio = Double.valueOf(sumatoria) / 3;

        System.out.println("El numero promedio es: " + promedio);
    }
}
