public class Main {
    public static void main(String[] args) {

        //Enter problem:

        problem4(50, 60);
    }

    public static void problem1(int age) {
        if (0 <= age && age <= 2) {
            System.out.println("baby");
        } else if (3 <= age && age <= 13) {
            System.out.println("child");
        } else if (14 <= age && age <= 19) {
            System.out.println("teenager");
        } else if(20 <= age && age <= 65) {
            System.out.println("adult");
        } else if(66 <= age) {
            System.out.println("elder");
        }
    }

    public static void problem2(int number) {
        if (number % 10 == 0) {
            System.out.println("The number is divisible by 10");
        } else if (number % 7 == 0) {
            System.out.println("The number is divisible by 7");
        } else if (number % 6 == 0) {
            System.out.println("The number is divisible by 6");
        } else if(number % 3 == 0) {
            System.out.println("The number is divisible by 3");
        } else if (number % 2 == 0) {
            System.out.println("The number is divisible by 2");
        } else {
            System.out.println("Not divisible");
        }
    }
    public static void problem3(int number, String type, String day) {
        double totalPrice = 0;
        double pricePerOne = 0;
        if (type.equals("Students")) {
            if (day.equals("Friday")) {
                pricePerOne = 8.45;
            } else if (day.equals("Saturday")) {
                pricePerOne = 9.80;
            } else if (day.equals("Sunday")) {
                pricePerOne = 10.46;
            }
            totalPrice = number * pricePerOne;
            if (number >= 30) {
                totalPrice  = totalPrice * 0.85;
            }
        } else if (type.equals("Business")) {
            if (day.equals("Friday")) {
                pricePerOne = 10.90;
            } else if (day.equals("Saturday")) {
                pricePerOne = 15.60;
            } else if (day.equals("Sunday")) {
                pricePerOne = 16;
            }
            totalPrice = number * pricePerOne;
            if (number >= 100) {
                totalPrice  = totalPrice - 10 * pricePerOne;
            }
        } else if(type.equals("Regular")) {
            if (day.equals("Friday")) {
                pricePerOne = 15;
            } else if (day.equals("Saturday")) {
                pricePerOne = 20;
            } else if (day.equals("Sunday")) {
                pricePerOne = 22.50;
            }
            totalPrice = number * pricePerOne;
            if ( 10 <= number && number <= 20) {
                totalPrice  = totalPrice * 0.95;
            }
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }

    public static void problem4(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end ; i++) {
            sum += i;

        }
        System.out.println("Sum: " + sum);

    }
}