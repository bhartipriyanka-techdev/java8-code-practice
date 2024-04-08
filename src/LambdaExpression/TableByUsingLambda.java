package LambdaExpression;

import java.util.Scanner;
@FunctionalInterface
interface Table {
    void showTable();
}
public class TableByUsingLambda {
    public static void main(String[] args) {
        Table table =()-> {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter any no to print the Table:");
            int num = scanner.nextInt();
            for(int i =1; i<= 10; i++){
                System.out.println(num +"*"+ i +"="+ num*i);
            }
        };
        table.showTable();
    }
}
