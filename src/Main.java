import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    /**
     * Реализуйте метод, который получает в качестве параметра год, проверяет, является ли он високосным,
     * и выводит результат в консоль.
     * Эту проверку вы уже реализовывали в задании по условным операторам.
     * Теперь проверку оберните в метод и используйте год, который приходит в виде параметра.
     * Результат программы выведите в консоль. Если год високосный, то напечатайте сообщение: «...  год — високосный год».
     * Если год невисокосный, то: «... год — невисокосный год».
     *
     */

   public static void checksTheYear(int year){
       if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
           System.out.println(year + " год является високосным");
       } else {
           System.out.println(year + " год не является високосным");
       }
   }
    public static void task1() {
        System.out.println("Задача 1");

        checksTheYear(1900);
    }

    /**
     * Напишите метод, куда подаются два параметра: тип операционной системы (0 — iOS, 1 — Android ) и год выпуска устройства.
     * Если устройство старше текущего года, предложите ему установить облегченную версию.
     * Текущий год можно получить таким способом:
     * int currentYear = LocalDate.now().getYear();
     * Или самим задать значение вручную — ввести в переменную числовое значение.
     * В результате программа должна выводить в консоль сообщение, какую версию приложения (обычную или облегченную)
     * и для какой ОС (Android или iOS) установить пользователю.
     * */

    public static int determineTheYear (){
        int currentYear = LocalDate.now().getYear();
        return currentYear;
    }

    public static void installApp(int clientDeviceYear,int clientOS){
        int currentYear = determineTheYear();
        if (clientOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static int getClientOS(String name) {
        if (name.equals("iOS")) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        String osName = "IOS";
        int clientOS = getClientOS(osName);
        int clientDeviceYear = 2015;

        installApp(clientDeviceYear, clientOS);
    }

    /**
     * Ваша задача — доработать код, а именно написать метод, который на вход принимает дистанцию
     * и возвращает итоговое количество дней доставки.
     */
    public static void calcDelivery(int deliveryDistance) {
        if(deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3");
        } else if (deliveryDistance >= 100) {
            System.out.println("Доставки нет");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");

        int deliveryDistance = 101;
        calcDelivery(deliveryDistance);
    }
}