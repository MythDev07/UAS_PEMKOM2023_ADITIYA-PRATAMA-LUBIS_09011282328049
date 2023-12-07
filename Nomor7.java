/*
 * By: Aditiya Pratama Lubis
 */

package vibes.guy.uas.pemkom2023;
import java.util.ArrayList;
import java.util.Scanner;

public class Nomor7 {
    public static void main (String[] args) {
        
        ArrayList <String> data1 = new ArrayList<>();
        data1.add ("Habiburrahman El Shirazy");
        data1.add ("2007");
        ArrayList <String> data2 = new ArrayList<>();
        data2.add ("Habiburrahman El Shirazy");
        data2.add ("2010");       
        ArrayList <String> data3 = new ArrayList<>();
        data3.add ("Habiburrahman El Shirazy");
        data3.add ("2014");
        ArrayList <String> data4 = new ArrayList<>();
        data4.add ("Andrea Hirata");
        data4.add ("2020");
        ArrayList <String> data5 = new ArrayList<>();
        data4.add ("Andrea Hirata");
        data4.add ("2019");
        
        String judul[] = {"(1) Ketika Cinta Bertasbih", "(2) Bumi Cinta", "(3) Api Tauhid", "(4)Guru Aini", "(5) Orang-orang Biasa"};
        System.out.println (judul[0]);
        System.out.println (judul[1]);
        System.out.println (judul[2]);
        System.out.println (judul[3]);
        System.out.println (judul[4]);
        System.out.println ("Silahkan ketik nomor pada data di atas untuk melihat selengkapnya");
        Scanner input = new Scanner (System.in);
        String n = input.nextLine();                                
        
        if (n.equals ("1" )) {
            System.out.println ("Ketika Cinta Bertasbih");
            System.out.println (data1);
        }
        else if (n.equals ("2" )) {
            System.out.println ("Bumi Cinta");
            System.out.println (data2);
        }
        else if (n.equals ("3" )) {
            System.out.println ("Api Tauhid");
            System.out.println (data3);
        }
        else if (n.equals ("4" )) {
            System.out.println ("Guru Aini");
            System.out.println (data4);
        }
        else if (n.equals ("5" )) {
            System.out.println ("Orang-orang Biasa");
            System.out.println (data5);
        }
        else {
            System.out.println ("Maaf, input yang diketik tidak terproses");
        }
        
        System.out.println ("Ingin membuat/menambah repository buku? Y/N");
        if (n.equals ("Y")) {
            System.out.println ("Maaf, layanan sedang rusak");
        }
        else{}
    }
}
