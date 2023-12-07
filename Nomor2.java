/*
 * By: Aditiya Pratama Lubis
 */

package vibes.guy.uas.pemkom2023;
import java.util.Scanner;

public class Nomor2 {
    public static void main (String[] args) {
        System.out.println ("Hello, user!");
        
        Scanner input = new Scanner (System.in);
        System.out.println ("Masukan Username =");
        String username = input.nextLine();
        System.out.println ("Lanjut, masukan Password =");
        String password = input.nextLine();
        
        System.out.println ("Oke. Ingin mencoba apakah data-mu tersinkron? Y/N");
        String n = "";
        n = input.nextLine();
        
        if (n.equals ("Y")) {
            System.out.println ("Oke. " + username);
            System.out.println ("Password?");
            n = input.nextLine();
            
            if (n.equals (password)) {
                System.out.println ("SALAH! Tapi bo'ong. Akun-mu aman :D");
            }
            else {
                    System.out.println ("Maaf, tidak tertera :(");
            }
        }  
        else {}
            System.out.println ("Baiklah, terimakasih menggunakan layanan kami :)");        
        
    }    
}
