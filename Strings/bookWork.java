package Ch9;

public class bookWork {

	public static void main(String[] args) {
		printArray(histogram("Atlas Shrugged is a boring and horrible book due to the sheer degree of boredom it inflicts upon someone."));
		//System.out.println(dooblean("ardvark"));
		//System.out.println(canSpell("apple","ardvarkaresocialconstructionsusingppploansinordertomakebirds"));
		//System.out.println(isAnagram("pots","stop"));
		System.out.println(isAbec("abcdefg"));
		//System.out.println(first("apple"));
		//System.out.println(rest("apple"));
	//	System.out.println(middle("apple"));
	//	System.out.println(length("apple"));
	//	printString("apple");
		//printBackward("apples");
	//	reverseString("apple");
	//	System.out.println(isPalindrome("apple"));
		System.out.println('A' + 25);
		
		
	}

	
public static int[] histogram(String s) {
	int[] h  = new int[26];
	s = s.toUpperCase();
	for (int i = 0; i < s.length(); i++) {
		if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' ) {
			h[s.charAt(i)-'A']++;
		}
	}
	
	
	
	
	return h;
 }
	
public static void printArray(int[] nums) {
	System.out.print("{");
	for (int i = 0; i < nums.length; i++) {
		System.out.print(nums[i]+",");
	}
	System.out.println("}");
}  
	
public static boolean dooblean(String s) {
	int[] histo = histogram(s);
		for(int i : histo) {
			if (i != 0 || i != 2) {
				return false;
				
			}
			
	}
	return true;
	
	
	
	
}

	

public static boolean canSpell(String word, String libchar){
    int[] wordReq = histogram(word);
    int[] libCap = histogram(libchar);
    for (int i=0;i<26;i++){
       if (wordReq[i] > libCap[i]){
          return false;
       }
    }
    return true;
 }


public static boolean isAnagram(String str1, String str2){
    int[] result1 = histogram(str1);
    int[] result2 = histogram(str2);
    if (result1[25] != 0 || result2[25] != 0) {
       return false;}
    for (int i=0;i<25;i++){
       if (result1[i] != result2[i]){
          return false;
       }
    }
    return true;
 }


public static boolean isAbec(String str){
    String converted = str.toUpperCase();
    for (int i = 0;i<converted.length() - 1;i++){
       char c = converted.charAt(i);
       if (c >= 'Z' - 25 && c <= 'A' + 25){
          if (c > converted.charAt(i+1)){
             return false;
          } 
       } 
       else {
          return false;
       }
    }
    return true;
 }

		public static char first(String s) {
    return s.charAt(0);
}


		public static String rest(String s) {
    return s.substring(1);
}

public static String middle(String s) {
    return s.substring(1, s.length() - 1);
}

public static int length(String s) {
    return s.length();
}
public static void printString(String str){
    if (length(str) != 0){
       System.out.println(first(str));
       printString(rest(str));
    }
 }
public static void printBackward(String str){
    if (length(str) != 0){
       printBackward(rest(str));
       System.out.println(first(str));
    }
 }
public static String reverseString(String str){
    if (length(str) != 0){
       return reverseString(rest(str)) + first(str);
    }
    return "";
 }

public static boolean isPalindrome(String str){
    int length = length(str);
    if (length == 1){
       return true;
    } 
    else if (length == 2){
       return first(str) == first(rest(str));
    } 
    else {
       return first(str) == first(reverseString(rest(str))) && isPalindrome(middle(str));
    }
 }



}
