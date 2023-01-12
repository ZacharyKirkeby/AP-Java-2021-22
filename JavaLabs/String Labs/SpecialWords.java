import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;



class Main {
  public static void main(String[] args) {
  ArrayList<String> allTheWords = importFile("en.txt");
 System.out.print(abecedarian(allTheWords));
 //the above works, just laggy because prints a few thousand words, hence its commented out so i dont crash my computer
  specialScore("abcdefgqqqqqqq");
System.out.print(anagram(allTheWords));
 System.out.print(doubleOons(allTheWords));
System.out.print(compoundWords(allTheWords));

    
  }
/* importing the whole bunch of words
*/
 public static ArrayList<String> importFile(String fileName){
    ArrayList<String> words = new ArrayList<>();
    try {
      File myObj = new File(fileName);
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        words.add(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    return words;
 }

public static boolean isAbe(String word){

  for(int i = 0; i < word.length()-1; i++){
    word = word.toLowerCase();
    if(word.charAt(i) > word.charAt(i+1)){
     return false;
    }
  }
  return true;
}
public static ArrayList<String> abecedarian(ArrayList<String> allTheWords){
ArrayList<String> abe = new ArrayList<>();
for(String words:allTheWords){
  if(isAbe(words) == true){
    abe.add(words);
  }
}
  return abe;
}

public static ArrayList<String> specialWords(ArrayList<String> allTheWords){
  ArrayList<String> special = new ArrayList<>();
  for(String words:allTheWords){
  if(isAbe(words) == true){
    special.add(words);
  }
}
  return special;
}

public static ArrayList<String> compoundWords(ArrayList<String> allTheWords){
  ArrayList<String> comp = new ArrayList<>();
  for(int k = 0; k < allTheWords.size(); k++){
    String compound = allTheWords.get(k);
    for(int i = 0; i < allTheWords.size(); i++){
      if(allTheWords.get(i).indexOf(compound) >= 0){
        comp.add(allTheWords.get(i));
      }
    }
  }
  return comp;
}




public static void specialScore(String s){
  String temp = " ";
for(int i = 0; i < s.length()-1; i++){
    s = s.toLowerCase();
    if(s.charAt(i) < s.charAt(i+1)){
     temp = temp + s.charAt(i);
    }
  }
 int specialness = temp.length()-1;
  String word = s;
  System.out.println(word + ": " + specialness);
  
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

 public static boolean isAnagram(String s, String s2){
    //ArrayList<String> anagram = new ArrayList<>();
   // for(int k = 0; k < allTheWords.size()-1; k++){
    int[] result1 = histogram(s);
    int[] result2 = histogram(s2);   
    for (int i=0;i<25;i++){
       if (result1[i] != result2[i]){
        return false;
       }
 }
  return true;

 }

public static ArrayList<String> anagram(ArrayList<String> words){
  ArrayList<String> anagram = new ArrayList<>();
  for(int k = 0; k < words.size()-1; k++){
    if(isAnagram(words.get(k), words.get(k+1)) == true){
      anagram.add(words.get(k));
      anagram.add(words.get(k+1));
    }

  }


return anagram;
}


public static boolean dooblean(String s) {
	if (s.length() == 0) {
         return false;}
      for (int count:histogram(s)){
         if (count != 0 && count != 2){
            return false;
         }
      }
      return true;
   }
	
	public static ArrayList<String> doubleOons(ArrayList<String> words){
  ArrayList<String> doubleoons = new ArrayList<>();
  for(int k = 0; k < words.size()-1; k++){
    if(dooblean(words.get(k)) == true){
      doubleoons.add(words.get(k));
    }
  }

	return doubleoons;
}
}
