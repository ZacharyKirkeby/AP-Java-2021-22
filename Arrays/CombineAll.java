import java.util.ArrayList;

class Main
{
	public static void main(String[] args)
	{
		ArrayList<String> word = new ArrayList<>();
    ArrayList<String> words2 = new ArrayList<>();
    word.add("a");
    word.add("b");
    words2.add("c");
    words2.add("d");
    //combineAll(word, words2);
    System.out.println(combineAll(word, words2));
	}
	public static ArrayList<String> combineAll(ArrayList<String> wordList1, ArrayList<String> worldList2){
    ArrayList<String> comb = new ArrayList<>();
    for(int i = 0; i < wordList1.size(); i++){
      comb.add(wordList1.get(i));
    }
    for(int i = 0; i < worldList2.size(); i++){
      comb.add(worldList2.get(i));
    }

    return comb;
  }
	
}