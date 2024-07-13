import java.util.Scanner;
public class InvertedFullPyramid {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the number of Rows :");
            int rows=sc.nextInt();
            for(int i=0;i<rows;i++){
                for(int j=0;j<i;j++){
                    System.out.print(" ");
                }
                for(int k=i;k<rows;k++){
                    System.out.print((k<rows)?"* ":"*");
                }
                if(i<rows-1){
                    System.out.println();
                }
            }
        }
    }
}
