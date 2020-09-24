import java.sql.SQLOutput;
import java.util.Scanner;

//program in in Dutch to show the lenght of input
public class GebruikersInvoer {
    public static void main(String[] args) {
        //State welcome message
        System.out.println("Voer een woord in");
        //Read users input in java 11 var s = new Scanner(System.in); is also oke?
        Scanner s = new Scanner(System.in);
        //State variable text
        var tekst = s.nextLine();
        //Show lenght of users input
        System.out.println(tekst.length());

        //State Welcome message
        System.out.println("Voer een getal in");
        //Read users input in java 11
        Scanner v = new Scanner(System.in);
        var number = v.nextLine();
        // idk what to do :D
        System.out.println("De tafel van " +number + " is ");



    }
}
