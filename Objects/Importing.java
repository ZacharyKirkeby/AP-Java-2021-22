import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;

class Main {
  
  public static void main(String[] args) {
    
    ArrayList<String> commonWords = importFile("1-1000.txt");
    System.out.println(commonWords.size());
    System.out.println(tenWords(commonWords));
    ArrayList<String> words =tenWords(commonWords);


    sortByLength(words);
    sortByLength(commonWords);
  
    // you now have 1000 words to play with
  }


  /*
  * Create an arrayList of 10 RANDOM words from the commonWords list.
  */
  public static ArrayList<String> tenWords(ArrayList<String> commonWords){
    ArrayList<String> words = new ArrayList<>();
    for (int i = 0; i < 10; i++){
      words.add(commonWords.get((int)(Math.random()*1000+1)));
    }


    return words;
  }

/*
* sort the arraylist of 10 words by length, shortest first
* then try it with the big arrayList
*/
public static void sortByLength(ArrayList<String> words){
  String longest = " ";
  for (int i = 0; i < words.size(); i++){
    if (words.get(i).length() > longest.length()){
      longest = words.get(i);
    }
  }
  for (int a = longest.length(); a>0; a-- ){
    for (int i = words.size()-1; i > 0; i--){
      if (words.get(i).length() == longest.length()-a){
        System.out.print(words.get(i) + ", ");
      }
    }
  }
      
   
    
  }
  



  /*
  * Sort the arrayList of words
  * word.compareTo(otherword) is what you'll need
  */
  public static void sortWords(ArrayList<String> words){
String longest = " ";
  for (int i = 0; i < words.size(); i++){
    if (words.get(i).length() > longest.length()){
      longest = words.get(i);
    }
  }
  for (int a = longest.length(); a>0; a-- ){
    for (int i = words.size()-1; i > 0; i--){
      if (words.get(i).length() == longest.length()-a){
        System.out.print(words.get(i) + ", ");
      }
    }
  }

  }






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
}