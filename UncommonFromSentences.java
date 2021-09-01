package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonFromSentences {

	public static void main(String[] args) {
		
		Arrays.stream(uncommonFromSentences("how am i","i am fine")).forEach(System.out::println);

	}
	
public static String[] uncommonFromSentences(String s1, String s2) {
        
        Map<String,Integer> map = new HashMap<String,Integer>();
        String str = s1 + " " + s2;
        
        for(String word : str.split(" ")){
             if(map.get(word) != null){
            	 int val = map.get(word);
               map.put(word,++val);
           }else{
               map.put(word,1);
           }
        }
         
       List<String> res = new ArrayList<String>();
        int i=0;
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                res.add(entry.getKey());
            }
        }
        return res.toArray(new String[res.size()]);
    }

}
