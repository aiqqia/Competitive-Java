public class ci{
    public static void main(String[] args) {
        double p = 120000;
        double sum = 0.0;
        double r = 1.1;
        for(int i=1;i<=40 ; i++){
            sum+=p;
            sum*=r;
        }
        System.out.println(sum);
    }
}