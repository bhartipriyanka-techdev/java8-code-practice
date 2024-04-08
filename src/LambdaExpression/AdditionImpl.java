package LambdaExpression;

import java.util.Scanner;

public class AdditionImpl {
    public static void main(String[] args) {
        //Addition addition = ( number1,number2)-> (number1+number2);

        //calling The Add Method
       // int sum = addition.add(100,200);
       // System.out.println("Addition is :"+sum);

        //Giving The method Definition
        Addition addition = (num1, num2) -> System.out.println("Addition is :"+(num1+num2));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number :");
        int num1 = scanner.nextInt();
        System.out.print("Enter 2nd number :");
        int num2 = scanner.nextInt();

        //Method Calling
        addition.add(num1,num2);

    }



}
