import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int baris = in.nextInt();

        for (int i=baris; i>0; i--) {
            for (int j=i-1; j>0; j--) {
                System.out.print(" ");
            }
            
            for (int k=i; k<baris; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
