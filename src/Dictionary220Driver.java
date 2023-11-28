import java.util.Locale;
import java.util.Scanner;

/********************************
 * File: []
 * By: Akim Tarasov
 * Date : []
 * Description : []
 ********************************/
public class Dictionary220Driver {
    public static void main(String[] args) {
        System.out.println("- Dictionary 220 Java Standard -----");
        System.out.println("-----       powered by Google Guava -");
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

            System.out.println("   |");
            dictionary.displayDefinitions(item);
            System.out.println("   |");

        }
        System.out.println("-----THANK YOU-----");
    }
}
