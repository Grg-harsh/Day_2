package Day_2;

import java.util.Scanner;
import static java.lang.System.out;
public class PrimeFactor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 2; i*i <= n; i++){
            while(n%i == 0){
                out.print(i+"\t");
                n = n/i;
            }
        }
        if(n != 0){
            out.print(n+"\t");
        }

    }
}