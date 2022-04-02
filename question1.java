import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        double discount = 0;
        if(amount<=5000) 
            discount = 0;
        else if(amount > 5000 && amount <= 15000)
            discount = (amount * 0.1) + 1000;
        else if(amount > 15000 && amount <= 30000)
            discount = (amount * 0.15) + 1500;
        else if(amount > 30000)
            discount = (amount * 0.2) + 2500;
        System.out.println("Total discount : " + discount);
        System.out.println("Amount to be paid : " + (amount-discount));
    }
}
