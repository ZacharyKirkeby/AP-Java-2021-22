package rocketship;

public class TestLaunch {
	public static int Size = 4;
	public static void main(String[] args) {
		diviLine();
		topCube();
		bottomCube();
		diviLine();
		topCone();
	}
	
	
public static void topCone() {
		
		
		for (int line =1; line < 2*Size; line++) {//line<5 ctr line #
			for (int space = 1; space < 2*Size - line; space++) {
				System.out.print(" ");
			}
			for (int leftslash = 0; leftslash < line + 1; leftslash++) {
				System.out.print("/");
			}
			System.out.print("**");
			for (int rightslash = 0; rightslash < line + 1; rightslash++) {
				System.out.print("\\");
			}
			System.out.println();
			}
		}
	
	
	public static void topCube() { 
		for (int lineNum = 1; lineNum <= Size; lineNum++ ){ 
			System.out.print("|"); 
			for (int rep =1; rep <=2; rep++) {
				for (int dots = 1; dots <= Size - lineNum; dots++) {
					System.out.print(".");
				}
					for (int slashes = 1; slashes <= lineNum; slashes++) {
					System.out.print("/\\");
				}
				
					for (int dots = 1; dots <= Size-lineNum; dots++) {
					System.out.print(".");
			}
			}
			System.out.println("|");
		}
	
	}
				
	public static void bottomCube() { //reorder thingies literally just reuse frame, top of first becomes bot of 2nd
		for (int lineNum = Size; lineNum >= 1; lineNum-- ){ //top part, then sepperate reverse? 1st three lines before flip how do i flip this 
			System.out.print("|"); 
			for (int rep =1; rep <=2; rep++) {
				for (int dots = 1; dots <= Size - lineNum; dots++) {
					System.out.print(".");
				}
					for (int slashes = 1; slashes <= lineNum; slashes++) {
					System.out.print("\\/");
				}
				
					for (int dots = 1; dots <= Size-lineNum; dots++) {
					System.out.print(".");
			}
			}
			System.out.println("|");
		}
	
	}
	
	public static void diviLine() { //check with teach on itg8 to cubes or method
		System.out.print("+");
		for (int count = 1; count <= 2*Size; count++ ) { //count might have to be longer if scaled - intg8 prob smart
			System.out.print("=*");
		}
		System.out.println("+");	
	}	
}
