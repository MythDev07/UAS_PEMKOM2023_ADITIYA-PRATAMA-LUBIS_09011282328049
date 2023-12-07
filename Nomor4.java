/*
 * By: Aditiya Pratama Lubis
 */

package vibes.guy.uas.pemkom2023;
import java.util.Scanner;

public class Nomor4 {
    public static void main (String[] args) {
        System.out.println ("Hello, user!");
        
        Scanner input = new Scanner (System.in);
        System.out.println ("Input Angka... (1 hingga 30)");
        int num = input.nextInt();         
        System.out.println ("Faktorisasi dari " + num + " adalah:");
        if (num % 2 == 0) {
            int num1 = num / 2;            
            System.out.println ("2");
            
            if (num1 % 2 == 0) {
                int num2 = num1 / 2;               
                System.out.println ("2 * 2");
                
                if (num2 % 2 == 0) {
                    int num3 = num2 / 2;                    
                    System.out.println ("2 * 2 * 2");
                    
                    if (num3 % 2 == 0) {                        
                        System.out.println ("2 * 2 * 2 * 2");
                    }
                    else {
                        System.out.println ("2 * 2 * 2 * " + num3);
                    }
                }
                else {
                    System.out.println ("2 * 2 * " + num2);
                }
            }
            else if (num1 % 3 == 0) {                
                int num2 = num1 / 3;
                System.out.println ("2 * 3"); 
                
                if (num2 % 5 == 0) {
                    System.out.println ("2 * 3 * 5");
                }
                else {}
            }
            else {
                System.out.println ("2 * " + num1);
            }
        }
        else if (num % 3 == 0) {
                int num1 = num / 3;                
                System.out.println ("3");
                
                if (num1 % 3 == 0) {                    
                    int num2 = num1 / 3;
                    System.out.println (3 * 3);
                    
                    if (num2 % 3 == 0) {
                        System.out.println ("3 * 3 * 3");
                    }
                    else {
                        System.out.println ("3 * 3 * " + num1);
                    }
                }
                else if (num1 % 5 == 0) {
                    System.out.println ("3 * 5");
                }
                else {
                    System.out.println ("3 * " + num1);
                }
        }
        else if (num % 5 == 0) {
            int num1 = num / 5;
            System.out.println (5);
            
            if (num1 % 5 == 0) {
                System.out.println ("2 * 5 * 5");
            }
            else {
                System.out.println ("Easter Eggs :D");
            }
        }
        else {
            System.out.println (num);
        }    
    }    
}

/*
*  Like the program says, confusing (muntah) XD 
*  God bless Sovngard!
*/