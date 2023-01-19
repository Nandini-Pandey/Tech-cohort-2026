import java.util.*;
public class a1_q4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int low= sc. nextInt();
        int high=sc.nextInt();

        for (int n=low; n<=high; n++){
            int count=0;
            for(int x=2; x*x<=n; x++){
                if(n%x==0){
                    count++;
                    break;
                }

            }
            if (count==0){
                System.out.println(n);
            }
        }


    }
}