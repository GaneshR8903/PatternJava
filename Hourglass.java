import java.util.Scanner;

public class Hourglass {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("Enter the number of rows: ");
            int rows=sc.nextInt();
            for(int i=0;i<rows;i++){
                for(int j=0;j<i;j++){
                    System.out.print("  ");
                }
                for(int k=i;k<rows;k++){
                    System.out.print("* ");
                }
                for(int l=i;l<rows-1;l++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            for(int i=1;i<rows;i++){
                for(int j=rows-1;j>i;j--){
                    System.out.print("  ");
                }
                for(int k=0;k<=i;k++){
                    System.out.print("* ");
                }
                for (int l=0; l<i; l++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
