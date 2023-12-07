package vibes.guy.manage.nilai;
import java.util.Scanner;

public class ifStatement {
    
    public static void main (String[] args){
    
        Scanner n = new Scanner (System.in);
        System.out.println ("Do you want to proceed? Y/N");
        String input;
        input = n.nextLine();
        
        //if Statement
        if (input.equals("Y")){
            System.out.println ("Okey then, you just screw your self!");
        }
        else if (input.equals("N")){
            System.out.println ("Yeah, thought all of this is boring.");
        }
        else{
            System.out.println ("Don't talk to me you retard!!");
        }
    }
}

/*
 * Bruh
 */
