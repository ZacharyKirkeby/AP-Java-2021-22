public class Crossword
{

 private Square[][] puzzle;
 
 

 public Crossword(boolean[][] blackSquares)
 { 
   /* to be implemented in part (b) */ 
   puzzle = new Square[blackSquares.length][blackSquares[0].length];
  int count = 1;
  for(int r = 0; r < puzzle.length; r++){
    for(int c = 0; c < puzzle[0].length; c++){
      if(toBeLabeled(r, c, blackSquares) == true){
        puzzle[r][c] = new Square(false, count);
        count++;
      }else
        puzzle[r][c] = new Square(blackSquares[r][c], 0);
    }
  }
 }
 
 
 
 private boolean toBeLabeled(int r, int c, boolean[][] blackSquares){ 
   /* to be implemented in part (a) */ 

  if(blackSquares[r][c] == false){
    return(r == 0 || blackSquares[r - 1][c] == true|| c == 0 || blackSquares[r][c - 1]== true);
 }else
    return false;
 }
 

 public String getPuzzle()
 {
	 String str = "";
	 for(int r=0; r<puzzle.length; r++)
	 {
		 for(int c=0; c<puzzle[r].length; c++)
		 {
			 if( puzzle[r][c].isBlack() )
			 {
				 str += "XX";
			 }
			 else
			 {
				 if(puzzle[r][c].getNum() > 0 )
				 {
					if(puzzle[r][c].getNum() < 10)
					{
						str += "0";
					}
					str += puzzle[r][c].getNum();
				 }
				 else
				 {
					str += "__";
				 }
			 }
		 }
		 str += "\n";
	 }
	 return str;
 }
}