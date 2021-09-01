package programs;

public class maximumNumberOfBalloons {

	public static void main(String[] args) {
		System.out.println(maxNumberOfBalloonsEasy("baloonsdsadasdbewewaasloondasdsabaldssadoon"));
		System.out.println(maxNumberOfBalloons("baloonsdsadasdbewewaasloondasdsabaldssadoon"));

	}
	 public static int maxNumberOfBalloonsEasy(String text) {
		 int[] chars = new int[26]; //count all letters
	        for (char c : text.toCharArray()) {
	            chars[c - 'a']++;
	        }
	        int min = chars[1];//for b
	        min = Math.min(min, chars[0]);//for a
	        min = Math.min(min, chars[11] / 2);// for l /2 
	        min = Math.min(min, chars[14] / 2);//similarly for o/2
	        min = Math.min(min, chars[13]);//for n
	        return min;        
	    }

	
	 public static int maxNumberOfBalloons(String text) {
	       String ref = "balloon";
	        int[] charArray = new int[26];
	        for(char ch : text.toCharArray()){
	            ++charArray[ch-'a'];
	        }
	        boolean match = true;
	        int count = 0;
	        while(charArray[ref.charAt(0)-'a'] != 0){
	            for(char ch : ref.toCharArray()){
	                if(charArray[ch-'a'] == 0){
	                    match = false;
	                    break;
	                }else{
	                    --charArray[ch-'a'];
	                }
	            }
	            if(match){
	                count++;
	            }
	            match = true;
	        }
	        return count;
	    }

}
