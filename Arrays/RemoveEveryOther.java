import java.util.ArrayList;

class Main
{
	public static void main(String[] args)
	{
	ArrayList<String> words = new ArrayList<>();
  words.add("hi");
  words.add("yo");
  words.add("sup");
  words.add("yolo");
  words.add("boop");	
  removeEveryOther(words);
	}
	//create your method below
	public static void removeEveryOther(ArrayList<String> words){
    for (int i = 0; i < words.size(); i++ ){
      words.remove(i);
    }
    System.out.println(words);
  }
}