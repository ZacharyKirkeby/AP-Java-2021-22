import java.util.Scanner;
class Main {
  public static void main(String[] args){
    Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
    while (!statement.equals("Bye"))
		{
			System.out.println(getRandomResponse());
			statement = in.nextLine();
		}
  }


  public static String getRandomResponse(){
		String[] response = {"As I see it, yes","Ask again later","placeholder a", "placeholer b","typing is a pain","this is an array"};
    final int NUMBER_OF_RESPONSES = response.length;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		return response[whichResponse];
		
	
	}



}