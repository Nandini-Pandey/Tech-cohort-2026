import java.util.*;
public class a3_q5 {
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int row=0; row<=2*n; row++){
            int totalcolinrow=row>n?2*n-row-1:row;//using ternary operator
           
            int totalspace=n-totalcolinrow;
            for(int s=0; s<=totalspace; s++){
                System.out.print(' ');

            }
            for(int col=0; col<totalcolinrow; col++ ){
                System.out.print('*');
            }
            System.out.println();
        }
    
    }
}    
