/*
Escreva um programa que leia um valor inteiro, calcule e mostre o seu fatorial. Fatorial
de um número natural n, representado por n!, é o produto de todos os inteiros positivos menores ou
iguais a n. Exemplo: 3! = 6, ou seja, 1 x 2 x 3 = 6.

 */

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int resultado = 1;

        System.out.println("Qual número você gostaria de saber o fatorial? ");
        numero = scanner.nextInt();

        long fatorial = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + fatorial);

    }

    public static long calcularFatorial(int numero) {
        long fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}




