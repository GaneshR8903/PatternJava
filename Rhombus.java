
import java.util.Scanner;
public class Rhombus {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the number of rows :");
            int rows=sc.nextInt();
            for(int i=0;i<rows;i++){
                for(int j=0;j<i;j++){
                    System.out.print(" ");
                }
                for(int k=0;k<rows-1;k++){
                    System.out.print((k<rows-2)?"* ":"*");
                }
                if(i<rows-1){
                    System.out.println();
                }
                
            }
        }
    }
}
