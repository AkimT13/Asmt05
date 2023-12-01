
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.*;

/********************************
 * File: Dictionary220
 * By: Akim Tarasov
 * Date : Nov 27
 * Description : A dictionary that holds words that are able to contain multiple definitions.
 ********************************/

public class Dictionary220 {
    Multimap<String, String> multimap = ArrayListMultimap.create();


    public Dictionary220() {
        for (Entries entries : Entries.values()) {

            for (int i = 0; i < entries.getDefinitions().length; i++) {

                multimap.put(entries.getWordName().toLowerCase(), entries.getDefinitions()[i]);
            }
        }
    }

    public void displayDefinitions(String word) {


        ArrayList<String> definitions = new ArrayList<>(multimap.get(word));// create an arrayList with a collection as the constructor
        String displayWord = "";
        for (Entries enumEntries : Entries.values()) {
            if (enumEntries.getWordName().equalsIgnoreCase(word)) {
                displayWord = enumEntries.getWordName();
            }
        }

        for (int i = 0; i < definitions.size(); i++) {

            System.out.println(displayWord + ": " + definitions.get(i));
        }


    }


}
