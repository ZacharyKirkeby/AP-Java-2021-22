package rocketship;

public class Rocketship { 
	public static int Size = 3; //scale factor, base size 3, 100 looks really funny
	public static void main(String[] args) {
		topCone();
		diviLine();
		topCube(); 
		bottomCube();
		diviLine();
		topOfBottomCube();
		botOfBotCube();
		diviLine();
		topCone();
	}

	public static void topCone() {
		
		
		for (int line =1; line <2*Size; line++) {//line<5 ctr line #
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
		for (int lineNum = 1; lineNum <= Size; lineNum++ ){  //to reverse order flip top loop order
			System.out.print("|"); 
			for (int rep =0; rep <2; rep++) {//repetition loop needed for scale, had too few loops orignially, 
				for (int dots = 0; dots < Size - lineNum; dots++) {
					System.out.print(".");
				}
					for (int slashes = 0; slashes < lineNum; slashes++) {
					System.out.print("/\\");
				}
				
					for (int dots = 0; dots < Size-lineNum; dots++) {
					System.out.print(".");
			}
			}
			System.out.println("|");
		}
	
	}
	public static void bottomCube() { //reorder thingies literally just reuse frame, top of first becomes bot of 2nd
		for (int lineNum = Size; lineNum >= 1; lineNum-- ){ //top part, then sepperate reverse? 
			System.out.print("|"); 
			for (int rep =0; rep <2; rep++) {
				for (int dots = 0; dots < Size - lineNum; dots++) {
					System.out.print(".");
				}
					for (int slashes = 0; slashes < lineNum; slashes++) {
					System.out.print("\\/");
				}
				
					for (int dots = 0; dots < Size-lineNum; dots++) {
					System.out.print(".");
			}
			}
			System.out.println("|");
		}
	
	}
		
			
	
	public static void diviLine() { //check with teach on itg8 to cubes or method
	System.out.print("+");
	for (int count = 0; count < 2*Size; count++ ) { //count might have to be longer if scaled - intg8 prob smart
		System.out.print("=*");
	}
	System.out.println("+");	
}
	
	public static void botOfBotCube() {  //maybe insert parameter for linenum - control height - global size
		for (int lineNum = 1; lineNum <= Size; lineNum++ ){  //to reverse order flip top loop order - this is top cube 
			System.out.print("|"); 
			for (int rep =0; rep <2; rep++) {
				for (int dots = 0; dots < Size - lineNum; dots++) {
					System.out.print(".");
				}
					for (int slashes = 0; slashes < lineNum; slashes++) {
					System.out.print("/\\");
				}
				
					for (int dots = 0; dots < Size-lineNum; dots++) {
					System.out.print(".");
			}
			}
			System.out.println("|");
		}
	}		
	public static void topOfBottomCube() { //reorder thingies literally just reuse frame
		for (int lineNum = Size; lineNum >= 1; lineNum-- ){ //top part, - this is top bot code
			System.out.print("|"); 
			for (int rep =0; rep <2; rep++) {
				for (int dots = 0; dots < Size - lineNum; dots++) {
					System.out.print(".");
				}
					for (int slashes = 0; slashes < lineNum; slashes++) {
					System.out.print("\\/");
				}
				
					for (int dots = 0; dots < Size-lineNum; dots++) {
					System.out.print(".");
			}
			}
			System.out.println("|");
		}
	}
	
	//public static void printRocket(int size) {
		//was going to put all methods with parameters in here, so this gets set but ap classroom video mentioned public var so that works 
	//}
	
	
	
	
	
	
	
}




