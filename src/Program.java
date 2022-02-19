import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        int count = 1, count1 = 1, count2 = 0, countUnique = 0, z = 0;
        boolean search = false;
        System.out.print("Введите длину массива: ");
        int lenghtArray = in.nextInt();
        int[] firstArray = new int[lenghtArray];

        System.out.println("Массив равен: ");
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = rnd.nextInt(1, 10);
            System.out.print(firstArray[i] + " ");
        }


        for (int i = 0; i < firstArray.length; i++) {
            countUnique++;
            for (int j = i + 1; j < firstArray.length; j++) {
                if (firstArray[i] == firstArray[j]) {
                    count++;
                }
            }
        }
        count = countUnique - count + 1;

            System.out.println();
            System.out.println("Количество уникальных элементов" + count);
            int[][] matrix = new int[count][2];

        for (int i = 0; i < firstArray.length; i++) {
            countUnique++;
            for (int j = i + 1; j < firstArray.length; j++) {
                if (firstArray[i] == firstArray[j]) {
                    count1++;
                }
            }
        }

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

        }
    }
