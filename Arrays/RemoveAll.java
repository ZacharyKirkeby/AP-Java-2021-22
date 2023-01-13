import java.util.ArrayList;

class Main
{
	public static void main(String[] args)
	{
		String targ = "Apple";
    ArrayList<String> words = new ArrayList<>();
    words.add("apple");
    words.add("Apple");
    words.add("pineapple");
    removeAll(words,targ);
	}
	//create your method below
	public static void removeAll(ArrayList<String> wordList, String targetWord){
    for (int i = 0; i < wordList.size(); i++){
      if(wordList.get(i) == targetWord){
        wordList.remove(i);
      }
    }
    System.out.println(wordList);
  }
}