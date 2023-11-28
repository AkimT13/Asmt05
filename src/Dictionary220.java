import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

/********************************
 * File: Dictionary220
 * By: Akim Tarasov
 * Date : Nov 27
 * Description : A dictionary that holds words that are able to contain multiple definitions.
 ********************************/

public class Dictionary220 {
        Multimap<String, String> dictionary = ArrayListMultimap.create();

    public Dictionary220(){
        for(Word word : Word.values()){
            for(int i=0;i<word.getDefinitions().length;i++){
                dictionary.put(word.getWordName(),word.getDefinitions()[i]);
            }
        }


    }

    public void displayDefinitions(String word){
        ArrayList<String> definitions = new ArrayList<>(dictionary.get(word)); // create an arrayList with a collection as the constructor
        if(definitions.size()==0){
            System.out.println("<Not Found>");
        }

        for(int i =0;i<definitions.size();i++){
            word = word.substring(0,1).toUpperCase() + word.substring(1);
            System.out.println( word + ": " + definitions.get(i));
        }


    }



}
