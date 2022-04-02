import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice : ");
        int ch = sc.nextInt();
        switch(ch){
            case 1: int s=0,c=0;
                    for(int i=1;i<10;i++){
                        s = (int)(i * Math.pow(10,c)) + s;
                        System.out.print(s + " ");
                        c++;
                    } 
                    break;
            case 2: System.out.println("Enter n : ");
                    int N = sc.nextInt();
                    int num1 = 0, num2 = 1;
                    int counter = 0;
                    while (counter < N) {
                        System.out.print(num1 + " ");
                        int num3 = num2 + num1;
                        num1 = num2;
                        num2 = num3;
                        counter = counter + 1;
                    }
                    break;
            default : System.out.println("Wrong Choice");
                      break;
        }
    }
}
