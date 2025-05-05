/*
Crie uma matriz de dimensões 3x3 a partir de números inteiros positivos lidos pelo usuário.
Seu programa Java deve controlar que essa leitura para aceitar apenas valores válidos. Em
seguida, exiba os elementos da diagonal principal.
 */

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int valor;
                do{
                    System.out.println("digite o valor para a posição [" + i + "][" + j + "]: ");
                    valor = scanner.nextInt();
                    if(valor <=0){
                        System.out.println("VALOR INVALIDO");
                    }
                } while (valor <=0);
                matriz[i][j] = valor;
            }
        }
        System.out.println("Elementos da diagonal principal: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("posição [" + i + "][" + i + "]: " + matriz[i][i]);
        }
scanner.close();
    }
}
