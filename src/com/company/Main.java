package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // write your code here
        int value1;
        int value2;
        String operation = null;
        String value3;
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        String letters[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        //ввод числа
        System.out.println("Enter your Roman Numerals or Integer number:");
        Scanner cti = new Scanner(System.in);
        String a = cti.next();
        Scanner cti1 = new Scanner(System.in);
        String a1 = cti.next();

        //проверяем входит ли строка "a" в массив строк массива "letters"
        boolean flag = false;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i].equals(a)) {
                flag = true;
            }
        }
        switch (a){
            case "I":
                System.out.println(1);
                break;
            case "II":
                System.out.println(2);
                break;
            case "III":
                System.out.println(3);
                break;
            case "IV":
                System.out.println(4);
                break;
            case "V":
                System.out.println(5);
                break;
            case "VI":
                System.out.println(6);
                break;
            case "VII":
                System.out.println(7);
                break;
            case "VIII":
                System.out.println(8);
                break;
            case "IX":
                System.out.println(9);
                break;
            case "X":
                System.out.println(10);
                break;
        }


        while (true) {
            System.out.println("Введите, через пробел, сначала одно целое число, затем оператор(+,-,/,*) , потом другое целое число: ");

            Scanner scanner = new Scanner(System.in);
            value1 = scanner.nextInt();
            operation = scanner.next();
            value2 = scanner.nextInt();


            if ((value1 >= 0 || value1 < 10) || (value2 > 0 || value2 < 10)) {
                switch (operation) {
                    case "+":
                        System.out.println( value1 + value2);
                        break;
                    case "-":
                        System.out.println(value1 - value2);
                        break;
                    case "*":
                        System.out.println(value1 * value2);
                        break;
                    case "/":
                        System.out.println(value1 / value2);
                        break;
                    default:
                        System.out.printf("Error! Enter correct operator");
                        return;
                }
                System.out.print("\nThe result is given as follows:\n");


            }



        }
    }
}
