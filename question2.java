import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice : ");
        char ch = sc.next().charAt(0);
        switch(ch){
            case 'N' : int a,b,c;
                       System.out.println("Enter 3 numbers : ");
                       a = sc.nextInt();
                       b = sc.nextInt();
                       c = sc.nextInt();
                       int max=0,min=0;
                       if(a>=b && a>=c){
                           max = a;
                       } else if(b>=a && b>=c){
                           max = b;
                       } else if(c>=a && c>=b){
                           max = c;
                       }
                       if(a<=b && a<=c){
                            min = a;
                       } else if(b<=a && b<=c){
                            min = b;
                       } else if(c<=a && c<=b){
                            min = c;
                       }
                       System.out.println("Maximum : " +max);
                       System.out.println("Minimum : " +min);
                       break;
            case 'D' : int n;
                       System.out.println("Enter a number : ");
                       n = sc.nextInt();
                       int maxD,minD,x;
                       maxD = minD = n%10;
                       n=n/10;
                       while(n>0){
                           x = n%10;
                           if(x > maxD) 
                            maxD = x;
                           if(x < minD)
                            minD = x;
                           n=n/10;
                       }
                       System.out.println("Maximum Digit : " +maxD);
                       System.out.println("Minimum Digit : " +minD);
                       break;
            default : System.out.println("Wrong Choice");
                      break;
        }
    }
}
