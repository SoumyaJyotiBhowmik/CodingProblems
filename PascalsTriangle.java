package programs;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {
		generate(5);

	}
	
	//O(n^2) time , and O(n^2) space
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        for(int i=0;i<numRows;i++){
           List<Integer> vals = new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                vals.add(getVal(i,j));
            }
            res.add(vals);
        }
        return res;
       
        
    }
    private static int getVal(int row, int col){
        if(col == 0) return 1;
        int res = 1;
        for(int i=0;i<col;i++){
            res *= (row-i);
            res /= (i+1);  
        }
        return res;
    }
    //O(n^2) but less complex
    public static List<List<Integer>> pascal(int rows) {
    	
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	List<Integer> prev = null;
    	for(int i=0;i<rows;i++) {
    		List<Integer> row = new ArrayList<Integer>();
    		for(int j=0;j<=i;j++) {
    			if(j==0 || j==i) {
    				row.add(1);	
    			}else {
    				row.add(prev.get(j-1) + prev.get(j));
    			}
    		}
    		prev = row;
    		res.add(row);
    	}
    	return res;
    }

}
