package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

    int num = 0;
        System.out.print("Please Enter a number form 0 to 10: ");



        do {
            num = scan.nextInt();
            switch (num) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("Suspenso");
                    break;
                case 5:
                    System.out.println("Aprobado");
                    break;
                case 6:
                    System.out.println("Bien");
                    break;
                case 7:
                case 8:
                    System.out.println("Notable");
                    break;
                case 9:
                case 10:
                    System.out.println("Sobresaliente");
                    break;
                default:
                    System.out.println("The Entered Number Is Wrong " +
                            "Please try Again...");
                    break;

            }
        }

        while(0 >= num | 10 < num);






    }
}
