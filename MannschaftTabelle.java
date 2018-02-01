import java.net.NetworkInterface;
import java.util.Scanner;
import java.util.ArrayList;

public class MannschaftTabelle {

    public static void main(String[] args) {

        while (true) {

            Scanner scanner = new Scanner(System.in);


            System.out.print("Sage dein Spiel  ");          //schreibe "Sage dein Spiel"


            String Spiel = scanner.nextLine();                      //lese Eingabe , also das Spiel

            System.out.println("| Spiel: " + Spiel + " |");         //Gebe das geschrieben Spiel aus


            System.out.print("Sage die Tore der Heimmannschaft: ");      //schreibe "Sage die Tore der Heimmannschaft: "


            String ToreHeimmannschaften = scanner.nextLine();               //lese Eingabe, also die Tore der Heimmannschaft

            System.out.println("|Tore Heimmannschaft: " + ToreHeimmannschaften + " |");     //Gebe Tore der Heimmannschaft aus

            System.out.print("Sage die Tore der Gastmannschaft: ");                //schreibe "Sage die Tore der Gastmannschaft: "

            String ToreGastmannschaft = scanner.nextLine();                    //lese die Tore der Gastmannschaft

            System.out.println("Tore Gastmannschaft: " + ToreGastmannschaft + " |");              //Gebe die Tore der Gastmannschaft aus

            System.out.println(String.format("! Es steht %s zu %s !", ToreHeimmannschaften, ToreGastmannschaft));     //Gebe mit den gelesenen Tor-Variablen den pielstand aus

            ArrayList liste = new ArrayList();                     //erstelle eine ArrayList

            liste.add(Spiel);                    //das bisher angegeben Spiel in die Liste hinzufügen


                    String x = ToreGastmannschaft();
                    String y = ToreHeimmannschaften();
                    if ( y < x) {
                   System.out.println("Die Gastmannschaft hat gewonnen!");
                    }
                    else if (x < y) {               // Wrong indentation
                        System.out.println("Die Heimmannschaft hat gewonnen!");
                    }


                System.out.println(liste);                     //Liste mit dem angegeben Spiel ausgeben
            }


        }


    }



























