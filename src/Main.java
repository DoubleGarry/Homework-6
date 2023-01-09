public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();

    }
    public static void task1(){
        System.out.println("Задача 1");
        for (int q=1; q <=10; q=q+1 ){
            System.out.println(q);
        }
    }
    public static void task2(){
        System.out.println("Задача 2");
        for (int i=10; i >=1; i=i-1 ){
            System.out.println(i);
        }
    }
    public static void task3(){
        System.out.println("Задача 3");
        for (int w=0; w <=17; w=w+2 ){
            System.out.println(w);
        }
    }
    public static void task4(){
        System.out.println("Задача 4");
        for (int e=10; e >=-10; e=e-1 ){
            System.out.println(e);
        }
    }
    public static void task5(){
        System.out.println("Задача 5");
        for (int r=1904; r<=2096; r=r+4 ){
            System.out.println( r + " год является високосным");
        }
    }
    public static void task6(){
        System.out.println("Задача 6");
        for (int t=7; t<=98; t=t+7 ){
            System.out.println(t);
        }

    }
    public static void task7(){
        System.out.println("Задача 7");
        for (int y=1; y<=512; y=y*2 ){
            System.out.println(y);
        }
    }
    public static void task8(){
        System.out.println("Задача 8");
        int savings  = 29000;
        int total = 0;
        for (int i=1; i <=12; i=i+1 ){
            total = total + savings;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task9(){
        System.out.println("Задача 9");
        int savings  = 29000;
        int total = 0;
        for (int i=1; i <=12; i=i+1 ){
            total = total + total/100;
            total = total + savings;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task10(){
        System.out.println("Задача 10");
        for (int i=1; i <=10; i=i+1) {
            System.out.println("2х" + i + "=" + (i*2));
        }

    }
}