
import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the number of rows:");
            int rows=sc.nextInt();
            for(int i=0;i<rows;i++){
                for(int j=rows;j>i;j--){
                    System.out.print("  ");
                }
                for(int k=0;k<(2*i-1);k++){
                    System.out.print((k<(2*i-2))?"* ":"*");
                }
                if(i<rows){
                System.out.println();
                }
            }
            for(int i=rows-1;i>0;i--){
                for (int j=rows;j>i;j--) {
                    System.out.print("  ");
                }
                for(int k=0;k<(2*i-1);k++){
                    System.out.print((k<(2*i-2))?"* ":"*");
                }
                if(i>1){
                    System.out.println();
                }
                
            }
        }
    }
}
