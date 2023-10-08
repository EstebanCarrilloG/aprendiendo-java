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
 * @author ESTEBAN Funciones en java
 *
 */
public class Ejercicio2Funciones {

    public static void main(String[] args) throws IOException {

        
        boolean continuar = true;
        String numero[] = {"primer", "segundo", "tercer"};
        int valor[] = {0, 0, 0};
        int index = 0;

        System.out.println("---- Calcular el numero mayor entre 3 numeros usando funciones ----");
        
        do {
            try {

                System.out.println("Ingrese el " + numero[index] + " numero:");
                valor[index] = cargarNumero();

                index++;

                if (valor[valor.length - 1] != 0) {
                    continuar = false;
                    obtenerNumeroMayor(valor[0], valor[1], valor[2]);
                    obtenerNumeroMenor(valor[0], valor[1], valor[2]);
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

    private static void obtenerNumeroMayor(int primerNumero, int segundoNumero, int tercerNumero) {

        int numeroMayor = primerNumero;

        if (segundoNumero > numeroMayor) {
            numeroMayor = segundoNumero;
        }
        if (tercerNumero > numeroMayor) {
            numeroMayor = tercerNumero;
        }

        System.out.println("El numero mayor es: " + numeroMayor);
    }

    private static void obtenerNumeroMenor(int primerNumero, int segundoNumero, int tercerNumero) {

        int numeroMenor = primerNumero;

        if (segundoNumero < numeroMenor) {
            numeroMenor = segundoNumero;
        }
        if (tercerNumero < numeroMenor) {
            numeroMenor = tercerNumero;
        }

        System.out.println("El numero menor es: " + numeroMenor);
    }
}
