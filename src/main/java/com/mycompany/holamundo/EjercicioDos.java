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
 */
public class EjercicioDos {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese el primer numero:");
        String numeroUno = br.readLine();

        System.out.println("Ingrese el segundo numero:");
        String numeroDos = br.readLine();

        System.out.println("Ingrese el tercer numero:");
        String numeroTres = br.readLine();

        obtenerNumeroMayor(numeroUno, numeroDos, numeroTres);

    }

    private static void obtenerNumeroMayor(String numeroUno, String numeroDos, String numeroTres) {

        int primerNumero = Integer.parseInt(numeroUno);
        int segundoNumero = Integer.parseInt(numeroDos);
        int tercerNumero = Integer.parseInt(numeroTres);

        int numeroMayor = primerNumero;

        if (segundoNumero > numeroMayor) {
            numeroMayor = segundoNumero;
        }
        if (tercerNumero > numeroMayor) {
            numeroMayor = tercerNumero;
        }

        int numeroMenor = primerNumero;

        if (segundoNumero < numeroMenor) {
            numeroMenor = segundoNumero;
        }
        if (tercerNumero < numeroMenor) {
            numeroMenor = tercerNumero;
        }

        String respuesta = numeroMayor + " es el mayor y " + numeroMenor + " es menor.";
        System.out.println(respuesta);
    }
}
