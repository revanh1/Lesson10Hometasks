package Lesson10.Hometask.task2;

import java.util.Scanner;

public class CustomException {

    public static void checkNumber(int num) throws InvalidInputException{
        int minValue = 0, maxValue = 90;
        if(num < 0 || num > maxValue){
            throw new InvalidInputException("The number should be between : " + minValue + " and " + maxValue);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            int myNumber = scanner.nextInt();
            checkNumber(myNumber);
        }catch (InvalidInputException e){
            System.out.println("Invalid input exception : " + e.getMessage());
        }catch (Exception e){
            System.out.println("Other exception is occured : "+e.getMessage());
        }finally {
            System.out.println("Finally i got this ;)) ");
        }
    }
}
