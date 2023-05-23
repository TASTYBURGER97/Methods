public class Main {
    public static void main(String[] args) {
        ///Task1
        int year = 2020;
        checkIFYearLeap(year);
        System.out.println();


        ///Task2
        int userOS = 0;
        int userDeviceYear = 2016;
        checkUserOS(userOS, userDeviceYear);
        System.out.println();


        ///Task3
        int deliveryDistance = 100;
        checkDeliveryDistance(deliveryDistance);
    }


    public static boolean checkIFYearLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true; // год является високосным
        } else {
            return false; // год не является високосным
        }
    }


    public static boolean checkUserOS(int userOS, int userDeviceYear) {
        System.out.println("///Task2");
        if (userDeviceYear < 2015) {
            switch (userOS) {
                case 0:
                    System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегчённую версию приложения для Android по ссылке");
            }
        } else {
            switch (userOS) {
                case 0:
                    System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегчённую версию приложения для Android по ссылке");
                    break;
            }

        }
        return false;
    }


    public static boolean checkDeliveryDistance(int deliveryDistance) {
        System.out.println("///Task3");
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставка не осуществляется");
        }

        return false;
    }
}


