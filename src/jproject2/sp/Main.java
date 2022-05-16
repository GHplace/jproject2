package jproject2.sp;

public class Main {

    public static void main(String[] args) {
//work1
        int clientOS = 0;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");}
        else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
//work2
        int clientOS1 = 1;
        int clientDeviceYear = 2007;
        if (clientOS1 == 0 && clientDeviceYear>=2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if(clientOS1 == 0 && clientDeviceYear<2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS1 == 1 && clientDeviceYear>=2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS1 == 1 && clientDeviceYear<2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

//work3
        int year = 1900;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
            System.out.println("Год является високосным");
        }
        else {
            System.out.println("Год не является високосным");
        }

//work4
        int deliveryDistance = 95;
        int day = 1;
        if  (deliveryDistance < 20){
            System.out.println("Потребуется:" + day + " день.");
        }
        if (deliveryDistance >= 20 && deliveryDistance <= 60);{
            day += 1;
            System.out.println("Потребуется:" + day + " дня.");
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100);{
            day += 1;
            System.out.println("Потребуется:" + day + " дня.");
        }


//work5
        int monthNumber = 15;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
    }
} }



