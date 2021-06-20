package programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StringCompressionEasy {

	public static void main(String[] args) {
		int a = 1;
		char c=(char)(a+'0');    
		//System.out.println(c); 
	System.out.println(compress(new char[] {'a','a','b','b','c','c','c'}));

	}
	
	public static int compress(char[] chars) {
		int index = 0;int count;int indexAns = 0;
       while(index < chars.length) {
             count=0;
            
            char current = chars[index];
            while( index < chars.length && chars[index] == current ){
                count++;
                index++;
            }
            chars[indexAns++] = current;
            if(count != 1) {
            	for(char ch : Integer.toString(count).toCharArray()) {
            		chars[indexAns++] = ch;
            	}
            }
         
        }
        return indexAns;
    }
}
