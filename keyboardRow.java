package programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class keyboardRow {

	public static void main(String[] args) {
		System.out.println(findWords(new String [] {"Hello","Alaska","Dad","Peace"}));

	}
	
	 public static String[] findWords(String[] words) {
	        List<String> result = new ArrayList<String> ();
	        Map<Character,Integer> map = new HashMap<Character,Integer>();
	       String[] data = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
	        for(int i = 0; i<data.length; i++){
	            for(char c: data[i].toCharArray()){
	                map.put(c, i);//put <char, rowIndex> pair into the map
	            }
	        }
	         
	        for(String word : words){
	            String upperWord = word.toUpperCase();
	            int value = map.get(upperWord.charAt(0));
	            boolean isMatch = true;
	            for(char ch: upperWord.toCharArray()){
	                if(value != map.get(ch)){
	                    isMatch = false;
	                }
	            }
	            if(isMatch){
	             result.add(word);   
	            }
	        }
	        String[] res = new String[result.size()];
	        return result.toArray(res);
	        
	    }
}
