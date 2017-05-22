public class PictureTester
{

	public static void testZeroBlue()
	{
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}

	public static void testKeepOnlyBlue()
	{
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.keepOnlyBlue();
		beach.explore();
	}

	public static void testNegate()
	{
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.negate();
		beach.explore();
	}

	public static void testGrayscale()
	{
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.grayscale();
		beach.explore();
	}

	public static void testFixUnderwater()
	{
		Picture beach = new Picture("water.jpg");
		beach.explore();
		beach.fixUnderwater();
		beach.explore();
	}

	public static void testMirrorVertical()
	{
		Picture caterpillar = new Picture("caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorVertical();
		caterpillar.explore();
	}
	
	public static void testMirrorVerticalRightToLeft()
	{
		Picture caterpillar = new Picture("caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorVerticalRightToLeft();
		caterpillar.explore();
	}

	public static void testMirrorHorizontal()
	{
		Picture caterpillar = new Picture("caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorHorizontal();
		caterpillar.explore();
	}

	public static void testMirrorHorizontalBotToTop()
	{
		Picture caterpillar = new Picture("caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorHorizontalBotToTop();
		caterpillar.explore();
	}

	public static void testMirrorDiagonal()
	{
		Picture caterpillar = new Picture("beach.jpg");
		caterpillar.explore();
		caterpillar.mirrorDiagonal();
		caterpillar.explore();
	}

	public static void testMirrorTemple()
	{
		Picture temple = new Picture("temple.jpg");
		temple.explore();
		temple.mirrorTemple();
		temple.explore();
	}
	
	public static void testMirrorArms()
	{
		Picture temple = new Picture("snowman.jpg");
		temple.explore();
		temple.mirrorArms();
		temple.explore();
	}
	
	public static void testMirrorGull()
	{
		Picture temple = new Picture("seagull.jpg");
		temple.explore();
		temple.mirrorGull();
		temple.explore();
	}
	
	public static void testCollage()
	{
		Picture canvas = new Picture("640x480.jpg");
		canvas.createCollage();
		canvas.explore();
	}
	
	public static void testMyCollage()
	{
		Picture canvas = new Picture("640x480.jpg");
		canvas.myCollage();
		canvas.explore();
	}

	public static void testEdgeDetection()
	{
		Picture swan = new Picture("swan.jpg");
		swan.edgeDetection(10);
		swan.explore();
	}
	
	public static void testEdgeDetection2()
	{
		Picture swan = new Picture("swan.jpg");
		swan.edgeDetection(10);
		swan.explore();
		Picture swan2 = new Picture("swan.jpg");
		swan2.edgeDetection2(10);
		swan2.explore();
	}

 public static void main(String[] args)
	{

		//testZeroBlue();
		//testKeepOnlyBlue();
		//testKeepOnlyRed();
		//testKeepOnlyGreen();
		//testNegate();
		//testGrayscale();
		//templestFixUnderwater();
		//testMirrorVertical();
		//testMirrorVerticalRightToLeft();
		//testMirrorHorizontal();
		//testMirrorHorizontalBotToTop();
		//testMirrorDiagonal();
		//testMirrorTemple();
		//testMirrorArms();
		//testMirrorGull();
		//testMirrorDiagonal();
		//testCollage();
		//testMyCollage();
		//testCopy();
		//testEdgeDetection();
		//testEdgeDetection2();
		//testChromakey();
		//testEncodeAndDecode();
		//testGetCountRedOverValue(250);
		//testSetRedToHalfValueInTopHalf();
		//testClearBlueOverValue(200);
		//testGetAverageForColumn(0);
	}
}
