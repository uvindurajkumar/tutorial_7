import java.util.ArrayList;
import java.util.Scanner;

public class PlayerSelection {
    public static ArrayList<String> players = new ArrayList<>();


    public static void Menu(){
        String choice = new Scanner(System.in).nextLine();
        System.out.print("Enter 'A' to add a player : ");
        System.out.print("Enter 'V' to view all player : ");

        switch (choice){
            case "A":
                Add();
                break;
            case "V":
                View();
                break;
            }
        }
    public static void Add(){

    }
    public static void View(){

    }
    public static void bestBatsman(){

    }
    public static void bestBowlers(){

    }
    public  static void bestKeeper(){

    }
}
