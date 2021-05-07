package Gustavotestescom.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number1, number2, number3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type three numbers");
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();
        number3 = scanner.nextInt();

        if (number1 > number2 &&  number1 > number3){
            System.out.println(number3 + " " + number2 + " "+ number1);
        }
        else if (number2 > number1  && number2 > number3){
            System.out.println(number3 + " " + number1 + " " + number2);
        }
        else if (number3 > number1 && number2 > number1){
            System.out.println(number1 + " " + number2 + " " + number3);
        }
        else if(number3 > number2 && number1 > number2){
            System.out.println(number3 + " " + number1 + " " + number2);
        }

        else{
            System.out.println("The numbers are equal");
        }
    }
}
