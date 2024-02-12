package lab2_var2_8;

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

        int determinant = calculateDeterminant(matrix);
        System.out.println("Matrix Determinant: " + determinant);
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

    public static int calculateDeterminant(int[][] matrix) {
        int n = matrix.length;
        if (n == 1) return matrix[0][0];

        int determinant = 0;
        for (int j = 0; j < n; j++) {
            determinant += matrix[0][j] * getCofactor(matrix, 0, j);
        }
        return determinant;
    }

    public static int getCofactor(int[][] matrix, int row, int col) {
        int n = matrix.length;
        int subMatrixRow = 0;
        int subMatrixColumn = 0;
        int[][] subMatrix = new int[n - 1][n - 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != row && j != col) {
                    subMatrix[subMatrixRow][subMatrixColumn++] = matrix[i][j];
                    if (subMatrixColumn == n - 1) {
                        subMatrixRow++;
                        subMatrixColumn = 0;
                    }
                }
            }
        }
        return (int) Math.pow(-1, row + col) * calculateDeterminant(subMatrix);
    }

    public static void printMatrix(int[][] matrix) {
        int n = matrix.length;

        for (int[] element : matrix) {
            for (int j = 0; j < n; j++) {
                System.out.print(element[j] + "\t");
            }
            System.out.println();
        }
    }
}

