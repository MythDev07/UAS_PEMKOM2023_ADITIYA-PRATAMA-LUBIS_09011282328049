package vibes.guy.uas.pemkom2023;
import java.util.Scanner;

public class Nomor5 {
    public static void main (String[] args) {
        
    char operator;
    Double angka1, angka2, hasil;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

    // ask users to enter operator
    System.out.println("Pilih operasi Matematika: +, -, *, or /");
    operator = input.next().charAt(0);

    // ask users to enter numbers
    System.out.println("Input angka pertama");
    angka1 = input.nextDouble();

    System.out.println("Input angka kedua");
    angka2 = input.nextDouble();

    switch (operator) {

      // performs addition between numbers
      case '+':
        hasil = angka1 + angka2;
        System.out.println(angka1 + " + " + angka2 + " = " + hasil);
        break;

      // performs subtraction between numbers
      case '-':
        hasil = angka1 - angka2;
        System.out.println(angka1 + " - " + angka2 + " = " + hasil);
        break;

      // performs multiplication between numbers
      case '*':
        hasil = angka1 * angka2;
        System.out.println(angka1 + " * " + angka2 + " = " + hasil);
        break;

      // performs division between numbers
      case '/':
        hasil = angka1 / angka2;
        System.out.println(angka1 + " / " + angka2 + " = " + hasil);
        break;

      default:
        System.out.println("Operasi tidak terbaca!");
        break;
    }

    input.close();
        
    }    
}
