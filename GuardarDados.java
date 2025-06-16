/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guardardados;

/**
 *
 * @author Matheus Brito
 */
import java.util.Scanner;

public class GuardarDados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua data de nascimento (dd/mm/aaaa): ");
        String dataNascimento = scanner.nextLine();

        System.out.print("Digite seu curso: ");
        String curso = scanner.nextLine();

        System.out.print("Digite sua série: ");
        String serie = scanner.nextLine();

        System.out.print("Digite sua altura (em metros, ex: 1.75): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();

        System.out.println("\nDados cadastrados:");
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Curso: " + curso);
        System.out.println("Série: " + serie);
        System.out.println("Altura: " + altura + " m");
        System.out.println("Peso: " + peso + " kg");

        scanner.close();
    }
}