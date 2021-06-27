import java.util.Scanner;
//28/06/2021 : 00:04
class Solution {
    public static int romanToInt(String s) {
        int num=0;
        int i=1,v=5,x=10,l=50,c=100,d=500,m=1000;
        int hi=0,hv=0,hx=0,hl=0,hc=0,hd=0,hm=0;
        for(int j=s.length()-1 ; j>=0 ; j--){
            char ch = s.charAt(j);
            switch(ch){
                case 'I':   if(hi == 0){
                                num+=i;
                            }
                            else{
                                num-=i;
                            }
                            break;
                case 'V':   if(hv == 0){
                                num+=v;
                            }
                            hi=1;
                            break;
                case 'X':   if(hx == 0){
                                num+=x;
                            }
                            else{
                                num-=x;
                            }
                            hi=1;
                            break;
                case 'L':   if(hl == 0){
                                num+=l;
                            }
                            hx=1;
                            break;
                case 'C':   if(hc == 0){
                                num+=c;
                            }
                            else{
                                num-=c;
                            }
                            hx=1;
                            break;
                case 'D':   if(hd == 0){
                                num+=d;
                            }
                            hc=1;
                            break;
                case 'M':   if(hm == 0){
                                num+=m;
                            }
                            hc=1;
                            break;
                default: break;
            }
        }
        return num;
    }
}

public class comp4{
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        System.out.println(Solution.romanToInt(s));
    }
}

