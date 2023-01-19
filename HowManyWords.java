import java.util.*;
import java.util.Scanner;
import java.util.List;
import java.util.HashSet;

/**
 * The HowManyWords class is a program which finds all the unique words in a given input.
 * 
 * This class contains one method and utilizes the HashSet data structure as well as an ArrayList. 
 * 
 * @author Nicole Issagholian, Kiara Chombo, Celeste Zepeda, Justin Chen, Jared Daniel
 *
 */
public class HowManyWords {

	/**
	* The main() method of this program. 
	* 
	* @param a String array args
	*/
	public static void main(String[] args) {
		Scanner data = new Scanner(System.in); //create scanner object

        HashSet<String> uniqueWords = new HashSet<String>(); //create HashSet to hold unique words

        while (data.hasNextLine()) {
            String line = data.nextLine();
            String currentWord = ""; 

            for (int i=0; i < line.length(); i++) {
                char c = line.charAt(i);

                if (Character.isAlphabetic(c)) {
                    currentWord += c;
                }

                else {
                    if (!currentWord.isEmpty()) {
                        uniqueWords.add(currentWord.toLowerCase());
                        currentWord = "";
                    }
                }
        
            }

            if(! currentWord.isEmpty()) 
            {
                uniqueWords.add(currentWord.toLowerCase());
            }
        } 

        List<String> uniqueWordList = new ArrayList<String>(uniqueWords);

        Collections.sort(uniqueWordList);
        for (String word : uniqueWordList) {
            System.out.println(word);
        }
        
        data.close();

	}

}
