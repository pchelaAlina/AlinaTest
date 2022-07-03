/*Написать программу, которая увеличивает вам зарплату каждый месяц на $1000,
используя циклы while/ do ... while, for. (Все три реализации)*/

public class Kalkul {
    public static void main(String[] args) {
        int zp = 50;
                while (zp<100000) {
            System.out.println(zp);
            zp = zp+1000;
        }//while
        zp+=1000;
        System.out.print(zp);//dowhile
        for (int pz = 50; pz <100000;pz+=1000){
            System.out.println(pz);//for
        }
    }
}

