package ru.mirea;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

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

    }
}
