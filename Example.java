import java.util.Scanner;

public class Example {
    //1.Пример с глобальными переменными:

    /*
    public static int Int1;
    public static boolean Bool1;
    public static byte Byte1;
    public static short Short1;
    public static long Long1;
    public static float Float1;
    public static double Double1;
    public static char Char1;

     */


    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        //1.Пример с локальными переменными:

        //int Int2 = 10;
        //boolean Bool2 = true;
        //byte Byte2 = 100;
        //short Short2 = 1000;
        //long Long2 = 100000000;
        //float Float2 = 3.14f;
        //double Double2 = 4.765528;
        //char Char2 = 'A';

        //1.1 Использование локальных переменных:

        //System.out.println("Int2 = " + Int2);
        //System.out.println("Bool2 = " + Bool2);
        //System.out.println("Short2 = " + Short2);
        //System.out.println("Long2 = " + Long2);
        //System.out.println("Float2 = " + Float2);
        //System.out.println("Double2 = " + Double2);
        //System.out.println("Char2 = " + Char2);

        //2. Считываем из консоли каждый тип и присваиваем его переменной:
        /*
        System.out.println("Введите int: ");
        int Int2 = sc.nextInt();

        System.out.println("Введите Boolean: ");
        boolean Bool2 = sc.nextBoolean();

        System.out.println("Введите Short: ");
        short Short2 = sc.nextShort();

        System.out.println("Введите Long: ");
        long Long2 = sc.nextLong();

        System.out.println("Введите Float: ");
        float Float2 = sc.nextFloat();

        System.out.println("Введите Double: ");
        double Double2 = sc.nextDouble();

        System.out.println("Введите Char: ");
        String Char2 = sc.next();
        */

       //1.1 Использование глобальных переменных:
        //Int1 = 10;
        //Bool1 = true;
        //Byte1 = 100;
        //Short1 = 1000;
        //Long1 = 1000000000;
        //Float1 = 3.14f;
        //Double1 = 4.10;
        //Char1 = 'A';

       //3. Таблица: (Country-Italy,Mark-Fiat,Price-30000)

        System.out.println("Страна: ");
        String country = sc.next();
        System.out.println("Марка: ");
        String mark = sc.next();
        System.out.println("Цена: ");
        int price = sc.nextInt();

        System.out.println("|--------|-------|--------|");
        System.out.println("|-Страна-|-Марка-|--Цена--|");
        System.out.printf("%8s | %5s | %6d\n" ,country,mark,price);
        System.out.println("|--------|-------|--------|");






    }
}
