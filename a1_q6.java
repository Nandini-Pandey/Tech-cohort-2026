import java.util.*;
public class a1_q6 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int rev= 0;
        while(n>0){
            int n1=n/10;
            int lastdigit= n%10;
            rev= rev*10 + lastdigit;
            n=n1;

        
        }
        System.out.println(rev);



    }
    
}
