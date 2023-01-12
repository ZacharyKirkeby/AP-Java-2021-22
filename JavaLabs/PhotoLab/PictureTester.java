package classes;
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  
  public static void testKeepOnlyBlue() {
	  Picture gull = new Picture("seagull.jpg");
	  gull.explore();
	  gull.keepOnlyBlue();
	  gull.explore();
  }
  
  public static void testNegate() {
	  Picture gull = new Picture("seagull.jpg");
	  gull.explore();
	  gull.negate();
	  gull.explore();
  }
  public static void testGrayscale() {
	  Picture gull = new Picture("seagull.jpg");
	  gull.explore();
	  gull.greyscale();
	  gull.explore();
  }
  public static void testFixUnderwater() {
	  Picture water = new Picture("water.jpg");
	  water.explore();
	  water.fixUnderwater();
	  water.explore();
  }
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  
  public static void testmirrorHorizontal() {
	  Picture gull = new Picture("seagull.jpg");
	  gull.explore();
	  gull.mirrorHorizontal();
	  gull.explore();
  }
  
  public static void testmirrorHorizontalBotToTop() {
	  Picture gull = new Picture("seagull.jpg");
	  gull.explore();
	  gull.mirrorHorizontalBotToTop();
	  gull.explore();
  }
  
  public static void testmirrorDiagnol() {
	  Picture gull = new Picture("seagull.jpg");
	  gull.explore();
	  gull.mirrorDiagonal();
	  gull.explore();
  }
  
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("beach.jpg");
  //  swan.explore();
    swan.edgeDetection2(35);
    swan.explore();
  }
  
  public static void testGreen() {
	  Picture zach = new Picture("zach2.jpg");
	  Picture background = new Picture("java3.jpg");
	  zach.explore();
	  zach.photoshop(background);
	  zach.explore();
  }
  //486 x 648
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
	  testGreen();
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
   // testZeroBlue();
  //  testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
   // testNegate();
   // testGrayscale();
  //  testFixUnderwater();
    //testMirrorVertical();
	// testmirrorHorizontal();
	// testmirrorHorizontalBotToTop();
	//  testmirrorDiagnol();
	//  testMirrorVerticalRightToLeft();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
   // testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}