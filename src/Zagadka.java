/* 1. Необходимо написать программу, где бы пользователю предлагалось ввести
число на выбор: 5, 4 или 1, а программа должна сказать, какое число ввёл пользователь: 5, 4, или 1.*/
import java.util.Scanner;

public class Zagadka {
    public static void main(String []args){
        System.out.print("Введите число 5, 4 или 1: ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i==1) {
            System.out.println("Вы ввели число 1");
        }
        else if (i==4) {
            System.out.println("Вы ввели число 4");
        }
        else if (i==5) {
            System.out.println("Вы ввели число 5");
        }
    }

}

