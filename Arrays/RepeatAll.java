import java.util.ArrayList;

class Main
{
	public static void main(String[] args)
	{
		ArrayList<Boolean> stats = new ArrayList<>();
    stats.add(true);
    stats.add(false);
    stats.add(true);
	}
	//create your method below
	public static void repeatAl(ArrayList<Boolean> stats){
    int origi = stats.size();
    for(int i = 0; i < origi; i++){
      stats.add(stats.get(i));
    }

  }
}