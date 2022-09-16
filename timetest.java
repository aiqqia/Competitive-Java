import java.util.Scanner;
import java.util.Arrays;

public class timetest {
    public static void main(String[] args) {
        int s = 50;
        for(int i=51;i<=500;i++){
            s = s ^ i;
        }
        System.out.print(s);
    }
}
