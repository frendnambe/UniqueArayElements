import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("Введите длину массива: ");
        int lenghtArray = in.nextInt();
        int[] firstArray = new int[lenghtArray];

        System.out.println("Массив равен: ");
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = rnd.nextInt(1, 10);
            System.out.print(firstArray[i] + " ");
        }

        boolean search = false;
        int count = 0;
        for (int i = 0; i < firstArray.length; i++) {
            search = false;
            for (int j = i + 1; j < firstArray.length; j++) {
                if (firstArray[i] == firstArray[j]) {
                    search = true;
                    break;
                }
            }
            if (!search) count++;
        }


        System.out.println();
        System.out.println("Количество уникальных элементов: " + count);
        int[][] matrix = new int[count][2];
        for (int i = 0; i < firstArray.length; i++) {
            if (i == 0){
                matrix[0][0] = firstArray[0];
                matrix[0][1] = 1;
                count = 1;
            }
            else{
                search = false;
                for (int j = 0; j < count; j++)
                {
                    if (firstArray[i] == matrix[j][0])
                    {
                        matrix[j][1]++;
                        search = true;
                        break;
                    }
                }
                if (!search){
                    matrix[count][0] = firstArray[i];
                    matrix[count][1] = 1;
                    count++;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][0] + " (" + matrix[i][1] + " раз)");
            System.out.println();
        }

    }
}