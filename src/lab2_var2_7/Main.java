package lab2_var2_7;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        while (n <= 0) {
            try {
                System.out.print("Enter matrix dimension: ");
                n = Integer.parseInt(scanner.nextLine());
                if (n <= 0) System.out.println("Matrix dimension mast be > 0!");
            } catch (NumberFormatException e) {
                System.out.println("IT'S NOT A INTEGER!");
            }
        }

        int[][] matrix = generateMatrix(n);
        System.out.println("Source matrix:");
        printMatrix(matrix);

        for (int i = 1; i < 4; i++) {
            matrix = rotateMatrix(matrix);
            System.out.printf("Matrix after rotating %d degrees counterclockwise:\n", i * 90);
            printMatrix(matrix);
        }
    }

    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(2 * n + 1) - n;
            }
        }
        return matrix;
    }

    public static int[][] rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        int[][] rotatedMatrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotatedMatrix[i][j] = matrix[j][n - i - 1];
            }
        }
        return rotatedMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        int n = matrix.length;

        for (int[] ints : matrix) {
            for (int j = 0; j < n; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }
    }
}
