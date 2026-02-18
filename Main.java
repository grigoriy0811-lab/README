import java.util.Random;

public class Main {
    public static final int SIZE = 8;

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] rotateMatrix(int[][] matrix) {
        int[][] rotated = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotated[j][SIZE - 1 - i] = matrix[i][j];
            }
        }
        return rotated;
    }

    public static void main(String[] args) {
        int[][] colors = new int[SIZE][SIZE];
        Random random = new Random();

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }

        System.out.println("Исходная матрица:");
        printMatrix(colors);

        int[][] rotatedColors = rotateMatrix(colors);

        System.out.println("Матрица повернутая на 90 градусов:");
        printMatrix(rotatedColors);
    }
}