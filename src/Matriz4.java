import java.util.Scanner;

public class Matriz4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int valor = 1;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = valor;
                valor++;
            }
        }

        System.out.println("matriz 4x4 preenchida automaticamente: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        int somaColuna = 0;
        for(int i = 0; i < 4; i++) {
            somaColuna += matriz[i][0];
        }
        System.out.println("a soma da coluna 0 é: "+somaColuna);

    int somaLinha = 0;
    for(int i = 0; i < 4; i++) {
            somaLinha += matriz[0][i];
        }
        System.out.println("a soma da linha 0 é: "+somaLinha);

    int SomaColunaLinha = somaLinha + somaColuna - matriz[0][0]; //para somar sem repetir algum valor;
    int somaTotal = somaLinha + somaColuna;                      //para somar repetindo o valor [0][0] algum valor;
        System.out.println("a soma da linha + coluna sem repetir algum numero é: "+SomaColunaLinha);
        System.out.println("a soma da linha + coluna repetindo o numero [0][0] é: "+somaTotal);
    }
}
