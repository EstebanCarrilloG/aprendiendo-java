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
 * @author ESTEBAN
 * Funciones en java
 * 
 */
public class EjercicioDos {

    public static void main(String[] args) throws IOException {

        System.out.println("Ingrese el primer numero:");
        int primerNumero = cargarNumero();

        System.out.println("Ingrese el segundo numero:");

        int segundoNumero = cargarNumero();

        System.out.println("Ingrese el tercer numero:");

        int tercerNumero = cargarNumero();

        obtenerNumeroMayor(primerNumero, segundoNumero, tercerNumero);
        obtenerNumeroMenor(primerNumero, segundoNumero, tercerNumero);

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

        System.out.println("El numero mayor es:" + numeroMayor);
    }

    private static void obtenerNumeroMenor(int primerNumero, int segundoNumero, int tercerNumero) {

        int numeroMenor = primerNumero;

        if (segundoNumero < numeroMenor) {
            numeroMenor = segundoNumero;
        }
        if (tercerNumero < numeroMenor) {
            numeroMenor = tercerNumero;
        }

        System.out.println("El numero menor es:" + numeroMenor);
    }
}
