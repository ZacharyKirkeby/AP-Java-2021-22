class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    countFlips();
    System.out.println(threeHeads());
    
  }

  	// -----------------------------------------------------------------
	// Flips a coin multiple times and counts the number of heads
	// and tails that result.
	//		Output:
	//			The number flips: 1000
	//			The number of heads: 493
	//			The number of tails: 507
	// -----------------------------------------------------------------
  public static void countFlips(){
    int heads = 0;
    int tails = 0;
    int flips = 1000;
    Coin coin1 = new Coin();

    for(int i = 0; i < 1000; i++){
      coin1.flip();
      if (coin1.isHeads() == true){
        heads++;
      }else
        tails++;

    }
    System.out.println("The number of heads is " + heads);
    System.out.println("The number of tails is " + tails);
    System.out.println("The number of flips is " + flips);
  }

  // -----------------------------------------------------------------
	// Flips two coins until one of them comes up heads three times in a row.
	// -----------------------------------------------------------------
  public static int threeHeads(){
    // Create two separate coin objects
    Coin coin1 = new Coin();
    Coin coin2 = new Coin();
    int attempts = 0;
			// Print the flip results (uses Coin's toString method)
     
     int headStreak = 0;
      while (headStreak != 3){
       coin1.flip();
      if (coin1.isHeads() == true){
        headStreak++;
      }else
        headStreak = 0;
      attempts++;

     }
     int headStreak2 = 0;
     while (headStreak2 != 3){
       coin2.flip();
      if (coin2.isHeads() == true){
        headStreak2++;
      }else
        headStreak2 = 0;
     
    }
		return attempts;

			//stop the flipping once one of the coins gets to heads, 3 times in a row
		
 }
}