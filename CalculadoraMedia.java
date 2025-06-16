/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoramedia;

/**
 *
 * @author Patrícia
 */
import java.util.Scanner;
        
public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double soma = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = scanner.nextDouble();
            soma += nota;
        }

        double media = soma / 4;
        System.out.println("A média das 4 notas é: " + media);

        scanner.close();
    }
}
