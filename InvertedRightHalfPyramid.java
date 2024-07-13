import java.util.Scanner;

public class InvertedRightHalfPyramid {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the number of Rows:");
            int rows=sc.nextInt();
            for(int i=0;i<rows;i++){
                for(int j=rows;j>i;j--){
                    System.out.print((j>i+1)?"* ":"*");
                }
                if(i<rows-1){
                    System.out.println();
                }
            }
        }
    }
}

