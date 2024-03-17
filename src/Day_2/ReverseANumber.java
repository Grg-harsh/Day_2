package Day_2;
import java.util.Scanner;
import static java.lang.System.out;
public class ReverseANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int idx = 1;
        int ans = 0;
        while(n!=0){
            int rem = n%10;
            int temp = (int)Math.pow(10,rem-1);
            ans = ans+(idx*temp);
            n = n/10;
            idx++;
        }
        out.println(ans);
    }
}
