package vibes.guy.uas.pemkom2023;
import java.util.*;

public class Nomor6 {
    public static void Palindrome(String s){    
    String reverse = new StringBuffer(s).reverse().toString();
        if (s.equals(reverse)){
        System.out.println("Ya, itu palindrom. A+!!");
        }
        else{
        System.out.println("Tidak, bukan palindrom");
        }
    }
 
    public static void main (String[] args){
    System.out.println ("Masukkan kata!");        
    Scanner input = new Scanner (System.in);
    String kata = input.nextLine();
    Palindrome(kata);
                       
    }    
}
