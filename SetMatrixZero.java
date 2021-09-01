package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMatrixZero {

	public static void main(String[] args) {
		int[][] in = new int[][] {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		setZeroes(in);
		//setZeroes1(in);
		//setZeroes2(in);

	}
	//Brute force
	 public static void setZeroes(int[][] matrix) {
	      
		 int rows = matrix.length;
	        int cols = matrix[0].length;
	        
	        for(int i=0;i<rows;i++){
	            for(int j=0;j<cols;j++){
	                
	                if(matrix[i][j] == 0){
	                    
	                    int index =0;
	                    while(index <rows){
	                       matrix[index][j] = (matrix[index][j] != 0) ? -1 : 0;
	                        index++;
	                        
	                    }
	                    index =0;
	                     while(index <cols){
	                       matrix[i][index] =  (matrix[i][index]  != 0) ? -1 : 0;
	                         index++;
	                    }
	                }
	            }
	        }
	        
	         for(int i=0;i<rows;i++){
	            for(int j=0;j<cols;j++){
	                if(matrix[i][j] == -1){
	                    matrix[i][j] = 0;
	                }
	            }
	             
	         }
	        
	    }
	 //Using auxillary space
	 public static void setZeroes1(int[][] matrix) {
	      
	        int rows = matrix.length;
	        int cols = matrix[0].length;
	        int[] rowArray = new int[rows];
	        int[] colArray = new int[cols];
	        
	        for(int i=0;i<rows;i++){
	            for(int j=0;j<cols;j++){
	                
	                if(matrix[i][j] == 0){
	                    rowArray[i] = colArray[j] = -1;
	                }
	            }
	        }
	        for(int i=0;i<rows;i++){
	            for(int j=0;j<cols;j++){
	                
	                if(rowArray[i] == -1 || colArray[j] == -1){
	                    matrix[i][j] = 0;
	                }
	            }
	        }
	        
	    }
	 //inplace optimal
	 public static void setZeroes2(int[][] matrix) {
	      
	        int rows = matrix.length;
	        int cols = matrix[0].length;
	        boolean isFirstColZero = false;
	        
	        for(int i=0;i<rows;i++){
	            for(int j=0;j<cols;j++){
	                
	                if(matrix[i][j] == 0){
	                    if(j==0){
	                        isFirstColZero = true;
	                    }else{
	                        matrix[0][j] = matrix[i][0] = 0;
	                    }
	                    
	                }
	            }
	        }
	        
	        for(int i=rows-1;i>=0;i--){
	            for(int j=cols-1;j>=0;j--){
	                if(j==0 && isFirstColZero){
	                  matrix[i][j] = 0;  
	                }
	                else if(j != 0 && (matrix[i][0] == 0 || matrix[0][j] == 0)){
	                    matrix[i][j] = 0;
	                }
	            }
	        }
	        
	        
	    }
}
