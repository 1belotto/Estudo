/*
Proponha um programa em Java que leia um número inteiro positivo ne em seguida exiba n
linhas do chamado Triângulo de Floyd, conforme exemplificado abaixo:
n = 3
1
23
456
 */

import java.util.Scanner;

public class trianguloFloyd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um número: ");
        int n = scanner.nextInt();

        if(n<=0){
            System.out.println("digite um numero maior que zero!");
        } else{
            int numero = 1;
            for(int i=1; i<=n; i++){
                for(int j=1; j<=i; j++){


                System.out.print(numero);
                numero++;
            }
            System.out.println();
        }
            scanner.close();
    }}
}
