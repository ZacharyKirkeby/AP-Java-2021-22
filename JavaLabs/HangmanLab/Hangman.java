import java.util.*;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.util.ArrayList;
public class Hangman
{
  // the secret word
  private String word = " ";
  private int difficulty = 1;
  // a string that shows which letters in word have and have not been guessed yet
  private String hint = " ";
  
  // how many guesses the player has left
  private int numGuessesLeft;
  private ArrayList<String> comWord = importFile("big.txt");
  private ArrayList<String> easy = easy(comWord);
  private ArrayList<String> medium = medium(comWord);
  private ArrayList<String> hard = hard(comWord);



  public Hangman(int numGuesses, int dif, String words)
  {
    
    numGuessesLeft = numGuesses;
    difficulty = dif;
    word = words;
    initHint();
    
  }
  public ArrayList<String> easy(ArrayList<String> word){
    ArrayList<String> easy = new ArrayList<>();
    for(int i = 0; i < comWord.size()-1; i++){
      if(comWord.get(i).length() < 5){
        easy.add(comWord.get(i));
      }
    }
    return easy;
  }

  public ArrayList<String> medium(ArrayList<String> word){
    ArrayList<String> medium = new ArrayList<>();
    for(int i = 0; i < comWord.size()-1; i++){
      if(comWord.get(i).length() > 5 && comWord.get(i).length() <12){
        medium.add(comWord.get(i));
     }
   }
   return medium;
  }

  public ArrayList<String> hard(ArrayList<String> word){
    ArrayList<String> hard = new ArrayList<>();
    for(int i = 0; i < comWord.size()-1; i++){
      if(comWord.get(i).length() > 12){
        this.hard.add(comWord.get(i));
      }
    }
    return hard;
  }
  
  //make methods for each array list that adds words, .add wont work as object
  
  if(dif == 1){
    this.word = easy.get((int)Math.random()*100);
  }else if(dif == 2){
    this.word = medium.get((int)Math.random()*100);
  }else if(dif == 3){
    this.word = hard.get((int)Math.random()*100);
  }

  
  

public ArrayList<String> importFile(String fileName){
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
*/
  /** Initialize the hint instance variable so that it contains
   *  a ? for each letter in word. If word is "hello" then hint should be "?????"
   */
  public void initHint()
  {
    for(int i = 0; i < this.word.length()-1; i++){
      hint += "?";
    }
  }
  
  /** Checks if word contains letter. If it does, return true; 
   *  otherwise, decrement numGuessesLeft by 1 and return false.
   *  Precondition: letter contains exactly 1 character
   */
  public boolean checkGuess(String letter)
  {
    if(this.word.indexOf(letter) > -1){
      return true;
    }else
      numGuessesLeft--;
      return false;
  }
  
  /** Replace the character in hint at the specified index with letter.
   *  Precondition: letter contains exactly 1 character and 0 <= index < word.length()
   */
  public void replaceHintLetter(int index, String letter)
  {
    this.hint = hint.substring(0,index) + letter + hint.substring((index+1),hint.length());
    
  }
  
  /** Replace each ? in hint with letter at aech index that letter exists in word.
   *  For example, if word is "tomato" then updateHint("o") would change hint to
   *  be "?o???o"
   *  Precondition: letter contains exactly 1 character.
   */
  public void updateHint(String letter)
  {
    for(int i = 0; i < this.word.length(); i ++){
      if(this.word.substring(i,i+1).equals(letter)){
        replaceHintLetter(i,letter);
      }
    }
  }
  
  /** Return true if all the letters of word have been guessed correctly or
   *  if there are no more guesses left; otherwise, return false.
   */
  public boolean isGameOver()
  {
    if(this.hint.indexOf("?") == -1){
      return true;
    }else if(this.numGuessesLeft == 0){
      return true;
    }else
      return false;
  }
  
  /** Ask the user to guess a letter until the game ends.
   *  After the game ends, tell the user if they won or lost.
   */
  public void play()
  {
    Scanner in = new Scanner(System.in);
    while(!isGameOver())
    {
      
      System.out.println("Guesses Left: " + numGuessesLeft);
      System.out.println("Hint: " + hint);
      String guess = in.next(); // read input from user
      //make sure guess has at least 1 character
      if(guess.length() > 0)
      {
        guess = guess.substring(0, 1); // make sure guess contains exactly 1 character
        if(checkGuess(guess))
        {
          updateHint(guess);
        }
      }
      
    }
    
  if(numGuessesLeft <= 0)
    {
      
    System.out.println("You lose...");
    isGameOver();
    }
    else
    {
      System.out.println(hint);
      System.out.println("You win!");
    }
  }
}
