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
public class EjercicioTres {        

    public static void main(String[] args) throws IOException {

        System.out.println("Ingrese el primer numero:");
        int primerNumero = cargarNumero();

        System.out.println("Ingrese el segundo numero:");

        int segundoNumero = cargarNumero();

        System.out.println("Ingrese el tercer numero:");

        int tercerNumero = cargarNumero();

        calcularPromedio(primerNumero, segundoNumero, tercerNumero);

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
