import java.util.*;
public class WPara {

    public static void main(String[] args) {
	
        int hashValue = Integer.hashCode(155); 
        String s = "Paranoids are not paranoid because they are paranoid but because they keep putting them selves deliberately into paranoid avoidable situation";
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
	System.out.println("Hash code Value object: " + hashValue);
        System.out.println(words);

        
    }
}

