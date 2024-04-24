package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerador1;
        int denominador1;
        int numerador2;
        int denominador2;
        int operacao;

        System.out.println("CALCULADORA DE FRAÇÕES\n-----------------------------\n");
        System.out.println("1ª FRAÇÃO - Digite o numerador: ");
        if (sc.hasNextInt()) {
            numerador1 = sc.nextInt();
        } else {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
            return;
        }

        System.out.println("1ª FRAÇÃO - Digite o denominador: ");
        if (sc.hasNextInt()) {
            denominador1 = sc.nextInt();
        } else {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
            return;
        }

        System.out.println("2ª FRAÇÃO - Digite o numerador: ");
        if (sc.hasNextInt()) {
            numerador2 = sc.nextInt();
        } else {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro ou decimal.");
            return;
        }

        System.out.println("2ª FRAÇÃO - Digite o denominador: ");
        if (sc.hasNextInt()) {
            denominador2 = sc.nextInt();
        } else {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
            return;
        }

        if (denominador1 == 0 || denominador2 == 0) {
            System.out.println("ERRO: Indefinição");

        } else {

            System.out.println("Qual operação deseja realizar?\n");
            System.out.println("1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
            operacao = sc.nextInt();

            if (operacao == 1) {
                if (denominador1 == denominador2) {
                    int novoNumerador = numerador1 + numerador2;
                    System.out.println(numerador1 + "/" + denominador1 + " + " + numerador2 + "/" + denominador2 + " = " + novoNumerador + "/" + denominador1);
                } else {
                    // caso os denominadores sejam diferentes, encontrar MMC:
                    int novoDenominador = denominador1 * denominador2;
                    int novoNumerador1 = numerador1 * denominador2;
                    int novoNumerador2 = numerador2 * denominador1;
                    int novoNumerador = novoNumerador1 + novoNumerador2;
                    System.out.println(numerador1 + "/" + denominador1 + " + " + numerador2 + "/" + denominador2 + " = " + novoNumerador + "/" + novoDenominador);


                }
            } else if (operacao == 2) {
                if (denominador1 == denominador2) {
                    int novoNumerador = numerador1 - numerador2;
                    System.out.println(numerador1 + "/" + denominador1 + " - " + numerador2 + "/" + denominador2 + " = " + novoNumerador + "/" + denominador1);
                } else {
                    // caso os denominadores sejam diferentes, encontrar MMC:
                    int novoDenominador = denominador1 * denominador2;
                    int novoNumerador1 = numerador1 * denominador2;
                    int novoNumerador2 = numerador2 * denominador1;
                    int novoNumerador = novoNumerador1 - novoNumerador2;
                    System.out.println(numerador1 + "/" + denominador1 + " - " + numerador2 + "/" + denominador2 + " = " + novoNumerador + "/" + novoDenominador);
                }
        } else if (operacao == 3) {
                int novoNumerador = numerador1 * numerador2;
                int novoDenominador = denominador1 * denominador2;

                System.out.println(numerador1 + "/" +denominador1 + " x " +numerador2 + "/" + denominador2 + " = " +novoNumerador + "/" +novoDenominador);
            } else if (operacao == 4) {
                if (numerador2 == 0) {
                    System.out.println("ERRO: Não é possível dividir por zero.");
                } else {
                    int novoNumerador = numerador1 * denominador2;
                    int novoDenominador = denominador1 * numerador2;
                    if (novoDenominador == 0) {
                        System.out.println("ERRO: A divisão resultou em denominador zero.");
                    } else {
                        System.out.println(numerador1 + "/" + denominador1 + " ÷ " + numerador2 + "/" + denominador2 + " = " + novoNumerador + "/" + novoDenominador);
                    }
                }
                } else {

            System.out.println("Operação inválida.");

            }

        }
}}