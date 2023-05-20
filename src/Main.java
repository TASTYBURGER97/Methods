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
        int deliveryDistance = 110;
        checkDeliveryDistance(deliveryDistance);
    }


    public static void checkIFYearLeap(int year) {
        System.out.println("///Task1");
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("год" + year + "является високосным");
        } else {
            System.out.println("год" + year + " не является високосным");

        }
    }

    public static void checkUserOS(int userOS, int userDeviceYear) {
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
    }


    public static void checkDeliveryDistance(int deliveryDistance) {
        System.out.println("///Task3");
        if (deliveryDistance > 0 && deliveryDistance < 3000) {
            System.out.println("Время доставки = " + ((deliveryDistance + 19) / 40 + 1));
            return;
        }
        System.out.println("Доставка не осуществляется");
    }
}
