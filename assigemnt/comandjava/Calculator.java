package comandjava;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number :");
        int num1 = input.nextInt();
        System.out.println("Enter 2nd number :");
        int num2 = input.nextInt();
        System.out.println("Enter a operator(+,-,*,/) :");
        char op = input.next().charAt(0);
        int result=0;
        switch (op){
            case '+':
                result=num1+num2;
                break;
            case '-':
                result=num1-num2;
                break;
            case '*':
                result=num1*num2;
                break;
            case '/':
                result=num1/num2;
                break;
            default:
                System.out.println("Invalid operator.. ");
        }
        System.out.println("result = "+result);
    }
}
