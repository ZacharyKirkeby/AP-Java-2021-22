import java.util.*;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    
    ArrayList<String> comWord = importFile("big.txt");
    ArrayList<String> easy = easy(comWord);
    ArrayList<String> medium = medium(comWord);
    ArrayList<String> hard = hard(comWord);
    
  int diff = 2;
  String ans = which(easy, medium, hard, diff);
    
    Hangman game = new Hangman(5, diff, ans);
   game.play();

//so my +1 is importing the jumbo text file, from a previous project, then splitting it into 3 arraylists by length based on difficulty. Each arraylist represents a difficulty, and difficulty is determined by the length of the word. Then, you get a random word from the difficulty you selected when you play. 


    
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
public static ArrayList<String> medium(ArrayList<String> comWord){
    ArrayList<String> medium = new ArrayList<>();
    for(int i = 0; i < comWord.size()-1; i++){
      if(comWord.get(i).length() > 5 && comWord.get(i).length() <12){
        medium.add(comWord.get(i));
     }
   }
   return medium;
  }

public static ArrayList<String> hard(ArrayList<String> comWord){
    ArrayList<String> hard = new ArrayList<>();
    for(int i = 0; i < comWord.size()-1; i++){
      if(comWord.get(i).length() > 9){
        hard.add(comWord.get(i));
      }
    }
    return hard;
  }

public static ArrayList<String> easy(ArrayList<String> comWord){
    ArrayList<String> easy = new ArrayList<>();
    for(int i = 0; i < comWord.size()-1; i++){
      if(comWord.get(i).length() < 5){
        easy.add(comWord.get(i));
      }
    }
    return easy;
  }


  public static int rand(){
    int ran = (int)Math.random()*100;
    return ran;
  }

  public static String easyR(ArrayList<String> easy,int rand){
    String word = easy.get(rand);
    return word;

  }
  public static String medR(ArrayList<String> easy,int rand){
    String word = easy.get(rand);
    return word;

  }

  public static String hardR(ArrayList<String> hard,int rand){
    String word = hard.get(rand);
    return word;

  }
  
  public static String which(ArrayList<String> easy, ArrayList<String> med, ArrayList<String> hard,int dif){
    String word = " ";
    if(dif == 1){
      word = easyR(easy,rand());
    }else if(dif ==2){
      word = medR(med,rand());
    }else if(dif == 3){
      word = hardR(hard,rand());
    }
    return word;
  }

}
//code is a tad suboptimal but this was the only way that wouldnt error...