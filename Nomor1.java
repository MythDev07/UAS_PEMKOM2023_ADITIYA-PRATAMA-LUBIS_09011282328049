/*
 * By: Aditiya Pratama Lubis
 */

package vibes.guy.uas.pemkom2023;
import java.util.Scanner;

public class Nomor1 {
    public static void main (String[] args) {
        System.out.println ("Hello, user!");
        
        Scanner input = new Scanner (System.in);
        int susu = 15000;             
        int sosis = 10000;
        int keripik = 20000;
        
        
        System.out.println ("Selamat datang di toko HunningBrew :)");
        System.out.println ("Berapa susu?");
        int susuln = input.nextInt();
        System.out.println ("Berapa sosis?");
        int sosisln = input.nextInt();
        System.out.println ("Berapa keripik?");
        int keripikln = input.nextInt();
        
        int totalHarga = susuln * susu + sosisln * sosis + keripikln * keripik;
        int totalBelanja = susuln + sosisln + keripikln;
        System.out.println ("Jadi totalnya = Rp." + totalHarga);
        
        if (totalBelanja >= 5 && totalBelanja <= 10) {
            System.out.println ("Selamat kamu mendapat diskon sebesar 5% :D");
                       
            int totalHargaln1 = totalHarga * 5 / 100;
            int total1 = totalHarga - totalHargaln1;
            System.out.println ("Maka menjadi = Rp." + total1);    
        }    
        else if (totalBelanja >= 11 && totalBelanja <= 20) {
            System.out.println ("Selamat kamu mendapat diskon sebesar 10% :D");
                       
            int totalHargaln2 = totalHarga * 10 / 100;
            int total2 = totalHarga - totalHargaln2;
            System.out.println ("Maka menjadi = Rp." + total2); 
        }  
        else if (totalBelanja >20) {
            System.out.println ("Selamat kamu mendapat diskon sebesar 20% :D");
                       
            int totalHargaln3 = totalHarga * 20 / 100;
            int total3 = totalHarga - totalHargaln3;
            System.out.println ("Maka menjadi = Rp." + total3);
        }    
        else {}               
        
        System.out.println ("Terimakasih :)");
    }
}
