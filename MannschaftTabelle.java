import java.net.NetworkInterface;
import java.util.Scanner;
import java.util.ArrayList;

public class MannschaftTabelle {

    public static void main(String[] args) {

        while (true) {

            Scanner scanner = new Scanner(System.in);


            System.out.print("Sage dein Spiel  ");


            String Spiel = scanner.nextLine();

            System.out.println("| Spiel: " + Spiel + " |");


            System.out.print("Sage die Tore der Heimmannschaft: ");


            String ToreHeimmannschaften = scanner.nextLine();

            System.out.println("|Tore Heimmannschaft: " + ToreHeimmannschaften + " |");

            System.out.print("Sage die Tore der Gastmannschaft: ");

            String ToreGastmannschaft = scanner.nextLine();

            System.out.println("Tore Gastmannschaft: " + ToreGastmannschaft + " |");

            System.out.println(String.format("! Es steht %s zu %s !", ToreHeimmannschaften, ToreGastmannschaft));

            System.out.print("Gibt es noch mehr Spiele, die du in deinen Kader rein machen willst?");

            String Ja = scanner.next();


            ArrayList liste = new ArrayList();

            liste.add("Deutschland");
            liste.add("Polen");
            liste.add("Frankreich");
            liste.add("Real Madrid");
            liste.add("Barcelona");


            System.out.println(liste);
        }
    }


}


























