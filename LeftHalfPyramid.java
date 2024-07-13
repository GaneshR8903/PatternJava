import java.util.Scanner;
public class LeftHalfPyramid {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the number of Rows :");
            int rows=sc.nextInt();
            for(int i=rows;i>0;i--){
                for(int j=1;j<i;j++){
                    System.out.print("  ");
                }
                for(int k=0;k<=rows-i;k++){
                    System.out.print((k<rows-i)?"* ":"*");
                }
                if(i>1){
                    System.out.println();
                }
                
            }
        }
    }
}