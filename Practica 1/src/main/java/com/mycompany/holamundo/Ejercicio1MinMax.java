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
 * @author ESTEBAN Obtener el numero mayor y menor entre 3 numeros
 *
 */
public class Ejercicio1MinMax {

    public static void main(String[] args) throws IOException {
        
        System.out.println("---- Calcular el numero mayor entre 3 numeros ----");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese el primer numero:");
        String primerNumero = br.readLine();

        System.out.println("Ingrese el segundo numero:");
        String segundoNumero = br.readLine();

        System.out.println("Ingrese el tercer numero:");
        String tercerNumero = br.readLine();

        int n1 = Integer.parseInt(primerNumero);
        int n2 = Integer.parseInt(segundoNumero);
        int n3 = Integer.parseInt(tercerNumero);

        int numeroMayor = n1;

        if (n2 > numeroMayor) {
            numeroMayor = n2;
        }
        if (n3 > numeroMayor) {
            numeroMayor = n3;
        }

        int numeroMenor = n1;

        if (n2 < numeroMenor) {
            numeroMenor = n2;
        }
        if (n3 < numeroMenor) {
            numeroMenor = n3;
        }

        String respuesta = numeroMayor + " es el numero mayor y " + numeroMenor + " es el menor.";
        System.out.println(respuesta);

    }
}
