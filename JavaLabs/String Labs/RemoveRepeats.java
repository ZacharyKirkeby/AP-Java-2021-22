// Read the instructions page under Lesson.

class Main {
  public static void main(String[] args) {
   // System.out.println("Hello world!");
    System.out.println(removeRepeats("Goodbye bye bye world world world"));
  }
  public static String removeRepeats(String phrase){
    phrase = phrase + " ";
    String newPhrase = "";
    String lower = phrase.toLowerCase();
    String temp = lower.substring(0,phrase.indexOf(" "));
    newPhrase = phrase.substring(0,phrase.indexOf(" "));
    while(lower.length()>0 && phrase.indexOf(" ") != -1){
      if(!(lower.substring(0,phrase.indexOf(" ")).equals(temp))){
        temp = lower.substring(0,phrase.indexOf(" "));
        newPhrase = newPhrase + " " + phrase.substring(0,phrase.indexOf(" "));
      }
      lower = lower.substring(phrase.indexOf(" ")+1);
      phrase = phrase.substring(phrase.indexOf(" ")+1);
    }
    return newPhrase;
  }

  

}
