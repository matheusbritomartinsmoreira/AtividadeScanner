/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuadanumero;

/**
 *
 * @author Matheus Brito
 */
import java.util.Scanner;

public class TabuadaNumero {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
           System.out.print("Digite um número para ver a tabuada: ");
        int num = scanner.nextInt();

        System.out.println("Tabuada do " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        scanner.close();
    }
}