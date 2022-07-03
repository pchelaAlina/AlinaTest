/* 1. Необходимо написать программу, где бы пользователю предлагалось ввести число
на выбор: 7, 3 или 2, а программа должна сказать, какое число ввёл пользователь: 7, 3, или 2.*/
import java.util.Scanner;
public class Osenka {
    public static void main(String[] args) {
    System.out.print("Введите число 7, 3 или 2: ");
    Scanner scanner = new Scanner(System.in);
    int i = scanner.nextInt();
    switch (i) {
        case 7: System.out.println("Вы ввели цифру 7");
        case 3: System.out.println("Вы ввели цифру 3");
        case 2: System.out.println("Вы ввели цифру 2");
    }
    }
}
