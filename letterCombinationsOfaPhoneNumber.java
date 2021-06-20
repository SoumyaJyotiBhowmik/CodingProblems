package programs;

import java.util.List;
import java.util.LinkedList;

public class letterCombinationsOfaPhoneNumber {

	public static void main(String[] args) {
		System.out.println("The combinations are : "+letterCombinations("23"));

	}
		
	 public static List<String> letterCombinations(String digits) {
         LinkedList<String> result = new LinkedList<String>();
       
        if(digits == "" || digits == null || digits.length() == 0){
            return result;
        }
         result.add("");
     
        String[] mapper = new String[]{
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"  
        };
        
        for(int i = 0 ;i < digits.length();i++){
          int number = Character.getNumericValue(digits.charAt(i));
            while(result.peek().length() == i){
                String top = result.remove();
                for(char ch : mapper[number].toCharArray()){
                    result.add(top + ch);
                }
            }
        }
        return result;
    }

}
