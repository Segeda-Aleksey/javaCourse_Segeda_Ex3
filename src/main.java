import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        int[][] array = new int[4][3];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = scan.nextInt();
            }
        }

        scan.close();

//        1.Напишите программу, которая выводит номера строк и суммы их элементов (пример: Line 2: 17).

        int sum;
        for (int i = 0; i < array.length; i++){
            sum = array[i][0];
            for (int j = 1; j < array[i].length; j++){
                sum = sum + array[i][j];
            }
            System.out.println("Line " + i + ": " + sum);
        }

//        2.Напишите программу, которая выводит номера столбцов и суммы их элементов (пример: Column 3: 21).
//        int sum;
        for (int j = 0; j < array[j].length; j++){
            sum = array[0][j];
            for (int i = 1; i < array.length; i++){
                sum = sum + array[i][j];

            }
            System.out.println("Column " + j + ": " + sum);
        }

//        3.Напишите программу, которая заменяет все нечётные элементы массива на 1,
//        а чётные на 0 и выводит его на экран.

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] % 2 == 0)
                    System.out.print(0);
                else
                    System.out.print(1);
            }
            System.out.println();
        }

//        4.Напишите программу, которая для в каждой строке находит целое среднее арифметическое и
//        выводит его на экран.

        int avg;
        for (int i = 0; i < array.length; i++){
            sum = array[i][0];
            for (int j = 1; j < array[i].length; j++){
                sum = sum + array[i][j];
            }
            System.out.println("avg line" + i + ": " + sum/ array[i].length);
        }

//        ***Напишите программу, которая преобразует двумерный массив в перевёрнутый
//        одномерный и выводит все элементы одномерного массива на экран.

        int[] arrayOne = new int[array.length * array[0].length];
        int counter = 0;
        for (int i = array.length - 1; i >= 0; i--){
            for (int j = array[i].length - 1; j >= 0 ; j--){
                arrayOne[counter] = array[i][j];
                counter++;
            }
        }

        for (int num:arrayOne) {
            System.out.print(num + " ");
        }
    }
}

