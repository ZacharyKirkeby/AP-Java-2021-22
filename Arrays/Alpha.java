import java.util.ArrayList;

public class Alpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
	
	public static String removeSpace(String word) {
		String a = "";
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) != ' ') {
				a = a + word.charAt(i);
			}
		}
		return a;
	}
	
	
	
	public static ArrayList<String>  createString (int a, String word){
		int k = 0;
		word = removeSpace(word);
		ArrayList<String> al = new ArrayList();
		for(int i = a; i < word.length(); i+= a) {
			al.add(word.substring(k,i));
			k+= a;
	
			
		}
		return al;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
