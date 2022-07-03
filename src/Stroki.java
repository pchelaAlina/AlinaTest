/*Объявить строку с вашим полным именем и вывести на экран результат работы всех
стандартных методов работы со строками*/
public class Stroki {
    public static void main(String[] args) {
        String s1 = "Ханнанова Алина Рамзилевна";
        String s2 = "Alina";
        String s3 = "Khannanova";
        String s4 = "Ramzilevna";
        String s5 = "";
        String s7 = s1;
        String s8 = new String("ХАННАНОВА АЛИНА РАМЗИЛЕВНА");

        char[] s6 = new char[4];
        try {
            s1.getChars(11, 15, s6, 0);
            System.out.print("Скопированное значение: ");//getChars(1)
            System.out.println(s6);
        } catch (Exception ex) {
            System.out.println("Возникает исключение...");
        }

        boolean pravda;
        pravda=s1.equals(s7);

        boolean registr;
        registr=s1.equalsIgnoreCase(s8);

        boolean sufiks;
        sufiks=s1.endsWith("Алина");

        System.out.println(pravda);//equals(2)
        System.out.println(s1.length());//длина(3)
        System.out.println(s1.charAt(0));//вызов по индексу(4)
        System.out.println(s2.concat(" " + s3 + " " + s4));//соединили(5)
        System.out.println(s5.isEmpty());//проверили на пустоту(6)
        System.out.println(registr);//сравнение строк без учета регистра
        System.out.println(s1.startsWith("Ханнанова", 0));//правда если последовательность предоставленного аргумента верна
        System.out.println(sufiks);//заканчивается ли предложение на указанный аргумент
        System.out.println(s1.replace('Х', 'М'));//замена символа
        System.out.println(s1.contains("Рам"));//поиск на наличие содержания аргумента


    }
}










