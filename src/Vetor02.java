/*
Escreva um programa Java que leia do teclado um vetor de 10 posições com inteiros.
Escreva na tela quantos valores pares foram armazenados nesse vetor e qual o maior valor
armazenado.
 */

import java.util.Scanner;

public class Vetor02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];
        int pares = 0;
        int maior;

        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();

            // Conta pares
            if (vetor[i] % 2 == 0) {
                pares++;
            }
        }

        // Inicializa 'maior' com o primeiro valor do vetor
        maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        // Exibe os resultados
        System.out.println("\nQuantidade de valores pares: " + pares);
        System.out.println("Maior valor armazenado: " + maior);

        scanner.close();
    }
}

