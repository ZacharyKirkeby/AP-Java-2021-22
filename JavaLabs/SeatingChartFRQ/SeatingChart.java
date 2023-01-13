import java.util.List;


public class SeatingChart
{

	private Student[][] seats;
	

	public SeatingChart(List<Student> studentList, int rows, int cols)
	{ 
    Student[][] seats2 = new Student[rows][cols];
    int index = 0;
    for(int col = 0; col < cols; col++){
        
      for(int row = 0; row < rows; row++){
        
        if(/*row * col > index && */index >= studentList.size()){
           seats2[row][col] = null;
        }else
          seats2[row][col] = studentList.get(index);
        index++;
        }
      
    
   }
    this.seats = seats2;
    
    /* to be implemented in part (a) */ 
			
	
	}
	
	
	public int removeAbsentStudents(int allowedAbsences)
	{ 
    int removed = 0;
    for(int row = 0; row < seats.length; row++){
     for(int col = 0; col < seats[0].length; col++){
        if(seats[row][col] == null){
          col++;
        }else
          if(seats[row][col].getAbsenceCount() > allowedAbsences){
          seats[row][col] = null;
          removed++;
        }
     }
    }
		/* to be implemented in part (b) */ 
		return removed;
	}

	
	public void printSeatingChart()
	{
		for(int r=0; r < seats.length; r++)
		{
			for(int c=0; c < seats[r].length; c++)
			{
				if( seats[r][c] != null )
					System.out.print( seats[r][c].getName() + seats[r][c].getAbsenceCount() + "\t\t");
				else
					System.out.print( "null" + "\t\t");
			}
			System.out.println();
		}
	}
	
	public String getSeatInfo(int r,int c)
	{
		if( seats[r][c] != null )
			return seats[r][c].getName() + seats[r][c].getAbsenceCount();
		else
			return null;
	}
}