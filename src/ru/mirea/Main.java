package ru.mirea;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code her

        ////////////////// Task1 /////////////
       /* Scanner scanner = new Scanner(System.in);

        int a = 1; //4 байта
        float b = 2.2f; //8-16
        boolean c = false; //1 байта


        String string = "adawd wadwa"; // объект
        String[] stringArray = string.split(" ");


        char g = 'd';

        a = scanner.nextInt();
        System.out.println(a+1);

        b = a;
        a= (int) b;

        System.out.println(a);*/

        ////////////////// Task3 /////////////

        int[] mass = {1,2,3,4,5,6,7};

        int summ = 0;
        for(int a: mass){
            summ+=a;
        }

        System.out.println("Число суммы масства равно: "+summ );

        ////////////////// Task4 /////////////

        System.out.println((int)(returnRandInt(100)));
    }


    public static int returnRandInt(int scale){
        return (int)(Math.random()*scale);
    }
}
