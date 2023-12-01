import java.util.Locale;
import java.util.Scanner;

/********************************
 * File: Dictionary220 driver
 * By: Akim Tarasov
 * Date : Nov 28
 * Description : mdriver for dicionary.
 ********************************/
public class Dictionary220Driver {
    public static void main(String[] args) {
        displayGreeting();
        Search();


    }
    public static void Search(){
        Scanner input= new Scanner(System.in);
        boolean searching = true;
        String item;
        Dictionary220 dictionary = new Dictionary220();
        while(searching){
            System.out.print("Search: ");

            item = input.next().toLowerCase();
             if(item.equals("!q")){
                searching = false;
                break;
            }
            else if(!dictionary.multimap.containsKey(item)){
                System.out.println("   |");
                System.out.println("<Not found>");
                System.out.println("   |");
            }
            else {
                System.out.println("   |");
                dictionary.displayDefinitions(item);
                System.out.println("   |");
            }
        }
        System.out.println("\n" + "-----THANK YOU-----");
    }
    public static void displayGreeting(){
        System.out.println("- DICTIONARY 220 JAVA Standard -----");
        System.out.println("-----      powered by Google Guava -");
    }
}
