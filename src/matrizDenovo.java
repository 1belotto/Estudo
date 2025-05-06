/*
Escreva um algoritmo que leia uma matriz quadrada de sétima ordem M(7,7), 7 linhas
e 7 colunas, e efetue a soma dos elementos da diagonal principal (canto superior esquerdo ao canto
inferior direito). Depois de calculado mostre a soma na tela.
 */

import java.util.Scanner;

public class matrizDenovo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[7][7];
        int valor = 1;
        int somaDiagonalPrincipal = 0;
        int coluna = 0;
        int linha = 0;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                matriz[i][j] = valor;
                valor++;
                System.out.print(matriz[i][j] + "\t"); //mostrar matriz
            }
            System.out.println();
        }
for(int i = 0; i < 7; i++) {
    somaDiagonalPrincipal += matriz[linha][i];
}
        System.out.println("a soma da diagonal principal é: " +somaDiagonalPrincipal);
            }
        }


