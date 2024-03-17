package Day_2;
import java.util.Scanner;
import static java.lang.System.out;
public class Rotate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        out.println("Enter the number");
        int n = scn.nextInt();
        out.println("Enter thr rotate");
        int k = scn.nextInt();
        int count = 0;
        int sum = 0;
        int on = n;
        while(on != 0){
            on = on/10;
            count++;
        }
        k = k%count;
        if(k < 0){
            k = k+count;
        }
        int temp1 = (int)Math.pow(10,k);
        int temp2 = (int)Math.pow(10,count-k);
        int num1 = n%temp1;
        int num2 = n/temp1;
        sum = (num1*temp2)+num2;
        out.println(sum);



    }
}

