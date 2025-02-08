import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите n:");
        int n = in.nextInt();
        int[] Array = new int[n];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = (int)(Math.random() * 101);//заполнение массива случайными целыми числами от 0 до 100
        }
        System.out.println("Исходный массив:\n" + Arrays.toString(Array));
        InsertionSort(Array);
    }
    public static void InsertionSort(int[] Array){
        int j;//Добавил заранее, т.к. вне второго цикла j не видно
        for(int i = 1; i<Array.length; i++){
            int temp = Array[i];
            for(j = i; j > 0 && temp < Array[j - 1]; j--){
                Array[j] = Array[j - 1];
            }
            Array[j] = temp;
        }
        System.out.println("Конечный массив:\n" + Arrays.toString(Array));
    }
}