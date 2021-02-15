

import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {

                System.out.println("PART-1:");
                Scanner kb = new Scanner(System.in);

                System.out.println("Enter a number: ");
                int number = kb.nextInt();


                if (number % 3 == 0) {
                    System.out.println(number + " is a multiple of 3.");
                } else {
                    System.out.println(number + " is not a multiple of 3.");
                }


                System.out.println("========================================");
                System.out.println("PART-2:");

                int numberOfDigits = 0;

                int total = 0;
                int newValue = number;

                while (number != 0) {
                    total = (number % 10) + total;
                    numberOfDigits++;
                    number /= 10;
                }

                System.out.println(newValue + " has " + numberOfDigits + " digits and their sum is " + total);
                System.out.println("========================================");

                System.out.println("PART-3:");

                System.out.println("Enter a first number: ");

                System.out.println("Enter a second number: ");
                int value2 = kb.nextInt();

                int value = kb.nextInt();
                int count = 0;

                for (int num = value2 ; num <= value; num++)    // 111 112 113 .... 189 190
                {
                    if (num % 10 == 0) {
                        count++;

                    }
                }
                System.out.println("There are " + count + " numbers divisible by 10 between "+ value2 + " and " + value );
                System.out.println("====================");

                System.out.println("PART-4:");
                Scanner scann = new Scanner(System.in);

                System.out.println("Enter your height(cm):");

                int height = kb.nextInt();
                if (height >= 200) {
                    System.out.println("you are very tall.!!");
                } else if (height >= 180) {
                    System.out.println("you are tall.!!");
                } else if (height >= 165) {
                    System.out.println("your height is normal.!!");
                } else if (height >= 140) {
                    System.out.println("you are short.!!");
                } else {
                    System.out.println("you are very short.!!");
                }
                System.out.println("============================ ");
                System.out.println("PART-5: ");

                Scanner letter = new Scanner(System.in);
                System.out.println("Enter letter grade: ");

                char letterGrade = kb.next().charAt(0);

                switch (letterGrade) {
                    case 'A':
                        System.out.println("Excellent.");
                        break;
                    case 'B':
                        System.out.println("Good.");
                        break;
                    case 'C':
                        System.out.println("Fair.");
                        break;
                    case 'D':
                        System.out.println("Must Study More.  ");
                        break;
                    case 'F':
                        System.out.println("Let's talk \n  ");
                        break;
                    default:
                        System.out.println("Wrong letter grade. ");
                }


            }
        }







