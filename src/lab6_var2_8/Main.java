package lab6_var2_8;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        char[][] grid = {
                {'*', '*', '.', '.', '.'},
                {'*', '.', '.', '*', '.'},
                {'.', '.', '*', '.', '.'},
                {'.', '*', '*', '*', '*'}
        };

        HashSet<String> figures = new HashSet<>();

        int rows = grid.length;
        int cols = grid[0].length;

        boolean[][] visited = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '*' && !visited[i][j]) {
                    StringBuilder figure = new StringBuilder();
                    explore(grid, visited, i, j, figure);
                    figures.add(figure.toString());
                }
            }
        }

        System.out.println("Различные фигуры на клетчатом листе бумаги:");
        for (String figure : figures) {
            System.out.println(figure);
        }
    }

    private static void explore(char[][] grid, boolean[][] visited, int row, int col, StringBuilder figure) {
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == '.' || visited[row][col]) {
            return;
        }

        visited[row][col] = true;
        figure.append(row).append(",").append(col).append(";");

        explore(grid, visited, row + 1, col, figure);
        explore(grid, visited, row - 1, col, figure);
        explore(grid, visited, row, col + 1, figure);
        explore(grid, visited, row, col - 1, figure);
    }
}