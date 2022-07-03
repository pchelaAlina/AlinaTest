/*Написать программу, которая вам уменьшает
зп с $10000 до $0 каждый месяц используя циклы while/ do ... while, for. (Все три реализации).*/
public class Vminus {
    public static void main(String[]args){
        int vm =10000;
        while (vm>=0) {
            System.out.println(vm);
            vm--;//while
        }
        do { System.out.println(vm);
            vm--;
        } while(vm>=0);//dowhile
        for(int mv=10000;mv>=0;mv--) {
            System.out.println(mv);//for но для другой переменной
        }
    }
}
