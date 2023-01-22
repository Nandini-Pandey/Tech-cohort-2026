import java.util.*;
public class a2_q2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int row=1; row<=n; row++){
            for(int col=n; col>=row; col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
