package matriz;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Defina um valor para criar a matriz: ");
        int n = scanner.nextInt();
        matrixCalc(diffDiagonal(n));
    }

    public static int[][] diffDiagonal(int num) {        
        System.out.println("Matriz: " + num + 'x' + num + " criada");
        int[][] matriz = new int[num][num];
        System.out.print("******************************");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println();
            System.out.print("|");
            for (int y = 0; y < matriz.length; y++) {
                matriz[i][y] = (int) (Math.random() * 51);
                System.out.print(matriz[i][y] + "\t");
            }
            System.out.print("|");
        }
        System.out.println();
        System.out.println("******************************");
        return matriz;

    }

    public static void matrixCalc(int[][] matriz) {
        int diagonal1 = 0;
        int diagonal2 = 0;
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz.length; y++) {
                if (x == y) {
                    diagonal1 += matriz[x][y];
                }
            }
        }
        for (int i = matriz.length - 1; i >= 0; i--) {
            for (int y = matriz.length - 1; y >= 0; y--) {
                if (i + y == matriz.length - 1) {
                    diagonal2 += matriz[i][y];
                }
            }
        }
        System.out.println("Resultado = " + diagonal1 + '-' + diagonal2);
        System.out.println("Resultado Final = " + (diagonal1 - diagonal2));
    }
}
