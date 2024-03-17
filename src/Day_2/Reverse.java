package Day_2;
import java.util.Scanner;
import static java.lang.System.out;
public class Reverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while(n != 0){
            int digit = n%10;
            out.println(digit);
            n = n/10;
        }
        scn.close();
    }
}