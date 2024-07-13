import java.util.Scanner;

public class Square{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int rows=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows;j++){
                System.out.print((j<rows-1)?"*_":"*");
            }
            if(i<rows-1){
                System.out.println();
            }
        }
        sc.close();
    }
}