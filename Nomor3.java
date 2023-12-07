package vibes.guy.uas.pemkom2023;
import java.util.Scanner;

public class Nomor3 {
    public static void main (String[] args) {
        System.out.println ("Hello, user!");
        
        Scanner input = new Scanner (System.in);
        System.out.println ("Input banyak suku angka...");
        int n = input.nextInt(), sukuSatu = 0, sukuDua = 1;
        System.out.println("Deret Fibonacci hingga " + n + " suku: ");

        for (int i = 1; i <= n; ++i) {
        System.out.print(sukuSatu + ", ");

        // compute the next term
        int nextSuku = sukuSatu + sukuDua;
        sukuSatu = sukuDua;
        sukuDua = nextSuku;
        }        
    }    
}
