package stringPractice;

public class ThursdayFriday {

	public static void main(String[] args) {
		String[] words = {"hello", "its", "me", "My", "little", "love" , "I", "see",  "your", "eyes", "widen", "like" ,"an", "ocean","when","you" ,"look" ,"at" ,"me" ,"so","full", "of","my", "emotions"};
		shortest(words);
		System.out.println(wordScore("hello"));
		System.out.println(longestWordScore(words));

	}

	public static String shortest(String[] words) {
		String shortWord = words[0];
		
		for(String word:words) {
			if (shortWord.length() > word.length() ) {
				shortWord = word;
			}
		}
		
		
		
		
		
		System.out.println(shortWord);
		return shortWord;
	}

	public static int wordScore(String s) {
		int score = 0;
		s = s.toLowerCase();
		for(int i = 0; i < s.length(); i++) {
			score += s.charAt(i);
		}
		
		
		return score;
	}
	
	
	
	
	public static String longestWordScore(String[] words) {
		String largest = words[0];
		for(String word:words) {
			if (largest.length() < word.length() ) {
				largest = word;
			}		
	}
		int a = 0;
		for(int i = 0; i < largest.length(); i++) {
			a += largest.charAt(i);
		
		}
		System.out.println(a);
		return largest;
	
	
	
	
	
}
}

