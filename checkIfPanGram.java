package programs;

public class checkIfPanGram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean checkIfPangram(String sentence) {
        int [] alphas = new int[26];
        for(char ch: sentence.toCharArray()){
            alphas[ch-97] = 1;
        } 
        for(int val : alphas){
            if (val == 0){
                return false;
            }
        }
        return true;
    }

}
