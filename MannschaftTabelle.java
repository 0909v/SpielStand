import java.net.NetworkInterface;
import java.util.Scanner;


public class MannschaftTabelle {

    public static void main(String[] args) {



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

        System.out.println(String.format("! Es steht %s zu %s !", ToreHeimmannschaften , ToreGastmannschaft));


    }






    }






