import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i,j,N;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows : ");
        N = sc.nextInt();

        for(i=0 ; i<N;i++){
            for(j=0; j<i; j++){
                    System.out.print(" ");
            }
            for(j=0;j<N;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}