package Day_2;

import java.util.Scanner;
import static java.lang.System.out;
public class LcdAndGcd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        out.println("Enter a number1");
        int num1 = scn.nextInt();
        out.println("Enter second number2");
        int num2 = scn.nextInt();
        int on1 = num1;
        int on2 = num2;
        while(num1%num2 != 0){
            int temp = num1%num2;
            num1 =  num2;
            num2 = temp;
        }
        int gcd = (on1*on2)/num2;
        out.println(gcd);
        out.println(num2);
    }
}