package stringPractice;

public class TuesdayUnFun {

	public static String backwards(String s) {
		String b =" ";
		for (int i = s.length()-1;i >= 0; i--) {
			b += s.charAt(i);
		}
		return b;
	}
	
	public static String noVowels(String s) {
		String b = " ";
		for (int i = 0; i < s.length(); i++) {
			if (!(s.charAt(i) == 'a')||(s.charAt(i) == 'e')||(s.charAt(i) == 'i')||(s.charAt(i) == 'o')||(s.charAt(i) == 'u')) {
				b += s.charAt(i);
			}
		}
		return b;
	}
	
	
	public static int countVowels(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) == 'a')||(s.charAt(i) == 'e')||(s.charAt(i) == 'i')||(s.charAt(i) == 'o')||(s.charAt(i) == 'u')) {
				count++;
			}
		}
		
		return count;
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println(backwards("zachary") + " = yrahcaz");
		System.out.println(noVowels("zachary")+ " = zchry");
		System.out.println(countVowels("zachary") + " = 2");
	}
	
}
