public class Main {
    public static void main(String[] args) {
        //Домашнее задание 1.1
        System.out.println("Задание 1.1");
int month = 0;
int total = 0;
int salary = 15000;
        while (total <= 2_459_000) {
             total = total + total / 100;
            total+=salary;
            month++;
            System.out.println("Месяц " + month + " сумма накоплении равна " + total);

        }

        System.out.println("Задание 1.2");
        int j = 1;
        while (j <=10){
            System.out.print(j++ + " ");
        }
        System.out.println();
        for (int i = 10; i > 0; i--){
            System.out.print(i + " ");
        }
        System.out.println("Задание 1.3");
        int y = 12_000_000;
        int numberYear = 0;
        for (int i = 1; i <=10; i++){
numberYear = (y / 1000) * (17 - 8);
y = y + numberYear;
            System.out.println("Год " + i + " численность населения составляет " + y);
        }

        System.out.println("Задание 2.1");
        int total2 = 15000;
        for (int i = 1; total2 <= 12000000; i++) {
            total2 = total2 + total2 / 100 * 7;
            System.out.println("Месяц " + i + " сумма накоплении составляет " + total2);
        }
        System.out.println("Задание 2.2");
        int total3 = 15000;
        for (int i = 1; total3 <= 12_000_000; i++){
            total3 = total3 + total3 / 100 * 7;
            if (i % 6 == 0){
                System.out.println("Месяц " + i + " сумма накоплении составляет " + total3);
            }
        }

        System.out.println("Задание 2.3");
        int total4 = 15000;
        int year = 9;
        for (int i = 1; i <= year * 12; i++){
            total4 = total4 + total4 / 100 * 7;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплении составляет " + total4);
            }
        }
        System.out.println("Задание 2.4");
int fridayNumber = 4;
for (;fridayNumber <=31;fridayNumber+=7){
    System.out.println("Сегодня пятница " + fridayNumber + "-е число. Необходимо подготовить отчёт." );
}

        System.out.println("Задание 3.1");

int thisYear = 2022;
int year200 = thisYear - 200;
int year100 = thisYear + 100;
for (int i = 0;i <= year100; i+=79){
    if (i >= year200){
        System.out.println(i);
    }
}



    }
}