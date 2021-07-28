import java.util.*;

public class Wfreque {

    public static void main(String[] args) {

        String s = "To be or not to be";
	//for split a above string
        String a[] = s.split(" ");
        HashMap<String, Integer> words = new HashMap<>();
	//foreach loop to print string element array
        for (String str : a) {
		//checks key is mapped or not
            if (words.containsKey(str)) {
                words.put(str, 1 + words.get(str));
            } else {
                words.put(str, 1);
            }
        }
        System.out.println(words);
    }
}