/*
Proponha um programa em Java que lê uma variável n, inteira e maior que zero, que
representa o número de linhas da figura que segue o padrão a seguir:
n= 5
*
**
***
****
*****
 */

import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um número para ver sua piramide: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("digite um numero maior que zero!");
        } else {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");


        scanner.close();
    }
}}}
