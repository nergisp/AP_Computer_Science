import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List;

public class Picture extends SimplePicture
{
	public Picture()
	{
		super();
	}

	public Picture(String fileName)
	{

		super(fileName);
	}

	public Picture(int height, int width)
	{

		super(width, height);
	}

	public Picture(Picture copyPicture)
	{

		super(copyPicture);
	}

	public Picture(BufferedImage image)
	{
		super(image);
	}

	public String toString()
	{
		String output = "Picture, filename " + getFileName() + " height " + getHeight() + " width " + getWidth();
		return output;

	}

	public void zeroBlue()
	{
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels)
		{
			for (Pixel pixelObj : rowArray)
			{
				pixelObj.setBlue(0);
			}
		}
	}

	public void keepOnlyBlue()
	{
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels)
		{
			for (Pixel pixelObj : rowArray)
			{
				pixelObj.setRed(0);
				pixelObj.setGreen(0);
			}
		}
	}

	public void negate()
	{
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels)
		{
			for (Pixel pixelObj : rowArray)
			{
				pixelObj.setBlue(255 - pixelObj.getBlue());
				pixelObj.setRed(255 - pixelObj.getRed());
				pixelObj.setGreen(255 - pixelObj.getGreen());
			}
		}
	}

	public void grayscale()
	{
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels)
		{
			for (Pixel pixelObj : rowArray)
			{
				int ave = (pixelObj.getBlue() + pixelObj.getRed() + pixelObj.getGreen())
						/ 3;
				pixelObj.setBlue(ave);
				pixelObj.setRed(ave);
				pixelObj.setGreen(ave);
			}
		}
	}

	public void increaseContrast()
	{
		Pixel[][] pixels = this.getPixels2D();
		long total = 0;
		int num = 0;
		for (Pixel[] rowArray : pixels)
		{
			for (Pixel pixelObj : rowArray)
			{
				int ave = (pixelObj.getBlue() + pixelObj.getRed() + pixelObj.getGreen())
						/ 3;
				total += ave;
				num++;
			}
		}
		int ave = (int) (total /= num);
		for (Pixel[] rowArray : pixels)
		{
			for (Pixel pixelObj : rowArray)
			{
				pixelObj.setBlue(2 * (pixelObj.getBlue() - ave));
				pixelObj.setRed(2 * (pixelObj.getRed() - ave));
				pixelObj.setGreen(2 * (pixelObj.getGreen() - ave));
			}
		}
	}

	public void fixUnderwater()
	{
		increaseContrast();
	}

	public void mirrorVertical()
	{
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++)
		{
			for (int col = 0; col < width / 2; col++)
			{
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	public void mirrorVerticalRightToLeft()
	{
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++)
		{
			for (int col = 0; col < width / 2; col++)
			{
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				leftPixel.setColor(rightPixel.getColor());
			}
		}
	}

	public void mirrorHorizontal()
	{
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel botPixel = null;
		int height = pixels.length;
		for (int row = 0; row < height / 2; row++)
		{
			for (int col = 0; col < pixels[0].length; col++)
			{
				topPixel = pixels[row][col];
				botPixel = pixels[height - row - 1][col];
				botPixel.setColor(topPixel.getColor());
			}
		}
	}

	public void mirrorHorizontalBotToTop()
	{
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel botPixel = null;
		int height = pixels.length;
		for (int row = 0; row < height / 2; row++)
		{
			for (int col = 0; col < pixels[0].length; col++)
			{
				topPixel = pixels[row][col];
				botPixel = pixels[height - row - 1][col];
				topPixel.setColor(botPixel.getColor());
			}
		}
	}

	public void mirrorDiagonal()
	{
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel botPixel = null;
		for (int row = 0; row < pixels[0].length && row < pixels.length; row++)
		{
			for (int col = row + 1; col < pixels[0].length
					&& col < pixels.length; col++)
			{
				topPixel = pixels[row][col];
				botPixel = pixels[col][row];
				topPixel.setColor(botPixel.getColor());
			}
		}
	}

	public void mirrorTemple()
	{
		mirrorPartial(27, 97, 13, 276, 276, false);
	}

	public void mirrorTempleOld()
	{
		int mirrorPoint = 276;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int count = 0;
		Pixel[][] pixels = this.getPixels2D();

		for (int row = 27; row < 97; row++)
		{

			for (int col = 13; col < mirrorPoint; col++)
			{

				leftPixel = pixels[row][col];
				rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
				count++;
			}
		}
		System.out.println("There were " + count + " iterations.");
	}

	public void mirrorArms()
	{
		mirrorPartial(166, 195, 97, 292, 195, true);
	}

	public void mirrorGull()
	{
		mirrorPartial(230, 335, 230, 356, 356, false);
	}

	public void mirrorPartial(int rowStart, int rowEnd, int colStart, int colEnd,
			int mirrorPoint, boolean mirrorVertically)
	{
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] pixels = this.getPixels2D();

		for (int row = rowStart; row < rowEnd; row++)
		{
			for (int col = colStart; col < colEnd; col++)
			{
				fromPixel = pixels[row][col];
				if (mirrorVertically)
				{
					toPixel = pixels[mirrorPoint - row + mirrorPoint][col];

				} else
				{
					toPixel = pixels[row][mirrorPoint - col + mirrorPoint];
				}
				toPixel.setColor(fromPixel.getColor());
			}
		}
	}

	public void copy(Picture fromPic, int startRow, int startCol)
	{
		copyPartial(fromPic, startRow, startCol, -1, -1, -1, -1);
	}

	public void copyPartial(Picture fromPic, int startRow, int startCol,
			int fromRowStart, int fromColStart, int fromRowEnd, int fromColEnd)
	{
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		if (fromRowStart < 0 || fromRowStart > fromPixels.length) {
			fromRowStart = 0;
		}
		if (fromColStart < 0 || fromColStart > fromPixels[0].length) {
			fromColStart = 0;
		}
		if (fromRowEnd < 0 || fromRowEnd > fromPixels.length) {
			fromRowEnd = fromPixels.length;
		}
		if (fromColEnd < 0 || fromColEnd > fromPixels[0].length) {
			fromColEnd = fromPixels[0].length;
		}
		for (int fromRow = fromRowStart, toRow = startRow; fromRow < fromRowEnd
				&& toRow < toPixels.length; fromRow++, toRow++)
		{
			for (int fromCol = fromColStart, toCol = startCol; fromCol < fromColEnd
					&& toCol < toPixels[0].length; fromCol++, toCol++)
			{
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}
	}
	
	public void createCollage()
	{
		Picture flower1 = new Picture("flower1.jpg");
		Picture flower2 = new Picture("flower2.jpg");
		this.copy(flower1, 0, 0);
		this.copy(flower2, 100, 0);
		this.copy(flower1, 200, 0);
		Picture flowerNoBlue = new Picture(flower2);
		flowerNoBlue.zeroBlue();
		this.copy(flowerNoBlue, 300, 0);
		this.copy(flower1, 400, 0);
		this.copy(flower2, 500, 0);
		this.mirrorVertical();
		this.write("collage.jpg");
	}

	public void myCollage()
	{
		Picture robot = new Picture("robot.jpg");
			Picture swan = new Picture("swan.jpg");
		Picture kitten = new Picture("kitten2.jpg");

			this.copy(robot, 0, 0);
			robot.mirrorDiagonal();
			this.copy(robot, 100, 0);
			swan.zeroBlue();
			this.copyPartial(swan, 200, 0, 65, 308, 120, 400);
			kitten.grayscale();
			this.copyPartial(kitten, 300, 0, 78, 107, 202, 352);
			this.mirrorVertical();
	}
	
	public void edgeDetection(int edgeDist)
	{
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		Color rightColor = null;
		for (int row = 0; row < pixels.length; row++)
		{
			for (int col = 0; col < pixels[0].length - 1; col++)
			{
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][col + 1];
				rightColor = rightPixel.getColor();
				if (leftPixel.colorDistance(rightColor) > edgeDist)
					leftPixel.setColor(Color.BLACK);
				else
					leftPixel.setColor(Color.WHITE);
			}
		}
	}

	public void edgeDetection2(int edgeDist)
	{
		Pixel leftPixel = null;
		Pixel nextPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		Color nextColor = null;
		for (int row = 0; row < pixels.length; row++)
		{
			for (int col = 0; col < pixels[0].length; col++)
			{
				if (col < pixels[0].length - 1) {
					leftPixel = pixels[row][col];
					nextPixel = pixels[row][col + 1];
					nextColor = nextPixel.getColor();
					if (leftPixel.colorDistance(nextColor) > edgeDist) {
						leftPixel.setColor(Color.BLACK);
						continue;
					}
				}
				if (row < pixels.length - 1) {
					nextPixel = pixels[row+1][col];
					nextColor = nextPixel.getColor();
					if (leftPixel.colorDistance(nextColor) > edgeDist) {
						leftPixel.setColor(Color.BLACK);
						continue;
					}
				}
				leftPixel.setColor(Color.WHITE);
			}
		}
	}

	public static void main(String[] args)
	{
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}

}
