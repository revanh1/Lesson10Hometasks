package Lesson10.Hometask.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.Scanner;

public class PrintsSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = getValue(scanner);
        int square = getSquare(num);
        System.out.println("number is : " + num);
        System.out.println("square of this number is : " + square);
    }

    public static int getValue(Scanner scanner){
        int num;
        while (true){
            try {
                System.out.println("enter number : ");
                num = Integer.parseInt(scanner.nextLine());
                break;
            }catch (Exception e){
                System.out.println("non-integer value : ");
            }
        }
        return num;
    }

    public static int getSquare(int number){
        return (int) Math.pow(number, 2);
    }
}
