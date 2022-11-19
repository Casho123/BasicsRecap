public class Main {
    public static void main(String[] args) {

        //Enter problem:

        problem2(12);
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
}