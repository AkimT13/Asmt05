import java.util.Scanner;

/********************************
 * File: []
 * By: Akim Tarasov
 * Date : []
 * Description : []
 ********************************/
public class Dictionary220Driver {
    public static void main(String[] args) {


    }
    public static void Search(){
        Scanner input= new Scanner(System.in);
        String item = "";
        while(!item.equals("!q")){
            System.out.print("Search: ");
            item = input.next();
            System.out.println("   |");


        }
    }
}
