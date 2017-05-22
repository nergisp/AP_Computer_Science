import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import java.awt.*;
import java.io.*;
import java.awt.geom.*;

public class SimplePicture implements DigitalPicture
{
	private String fileName;
	private String title;
	private BufferedImage bufferedImage;
	private PictureFrame pictureFrame;
	private String extension;

	public SimplePicture() 
	{
		this(200,100);
	}
	
	public SimplePicture(String fileName)
	{
		
			load(fileName);
	
	}
	
	public  SimplePicture(int width, int height)
	{
			bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			title = "None";
			fileName = "None";
			extension = "jpg";
			setAllPixelsToAColor(Color.white);
	}

	public  SimplePicture(int width, int height, Color theColor)
	{
		this(width,height);
		setAllPixelsToAColor(theColor);
	}

	public SimplePicture(SimplePicture copyPicture)
	{
		if (copyPicture.fileName != null)
		{
			this.fileName = new String(copyPicture.fileName);
			this.extension = copyPicture.extension;
		}
		if (copyPicture.title != null)
		{	
			this.title = new String(copyPicture.title);
		}
		if (copyPicture.bufferedImage != null)
		{
			this.bufferedImage = new BufferedImage(copyPicture.getWidth(),																																									copyPicture.getHeight(), BufferedImage.TYPE_INT_RGB);
			this.copyPicture(copyPicture);
			}
	}
	
	public SimplePicture(BufferedImage image)
	{
		this.bufferedImage = image;
		title = "None";
		fileName = "None";
		extension = "jpg";
	}
	
	public String getExtension()
	{
		return extension;
	}

	
	public void copyPicture(SimplePicture sourcePicture)
	{
		Pixel sourcePixel = null;
		Pixel targetPixel = null;

		for (int sourceX = 0, targetX = 0; sourceX < sourcePicture.getWidth() && targetX < this.getWidth(); sourceX++, targetX++)
		{
			for (int sourceY = 0, targetY = 0; sourceY < sourcePicture.getHeight() && targetY < this.getHeight(); sourceY++, targetY++)
				{
						sourcePixel = sourcePicture.getPixel(sourceX,sourceY);
						targetPixel = this.getPixel(targetX,targetY);
						targetPixel.setColor(sourcePixel.getColor());
				}
		}
			
	}
	
	public void setAllPixelsToAColor(Color color)
	{
		for (int x = 0; x < this.getWidth(); x++)
		{
			for (int y = 0; y < this.getHeight(); y++)
			{
				getPixel(x,y).setColor(color);
			}
		}
	}
	
	public BufferedImage getBufferedImage() 
	{
		return bufferedImage;
	}
	
	public Graphics getGraphics()
	{
		return bufferedImage.getGraphics();
	}
	
	public Graphics2D createGraphics()
	{
		return bufferedImage.createGraphics();
	}
	
	public String getFileName() { return fileName; }
	
	public void setFileName(String name)
	{
		fileName = name;
	}
	
	public String getTitle() 
	{ return title; }
	
	public void setTitle(String title) 
	{
		this.title = title;
		if (pictureFrame != null);
		{
			pictureFrame.setTitle(title);
		}
	}
	
	public int getWidth() { return bufferedImage.getWidth(); }
	
	public int getHeight() { return bufferedImage.getHeight(); }
	
	public PictureFrame getPictureFrame() { return pictureFrame; }
	
	public void setPictureFrame(PictureFrame pictureFrame)
	{
		this.pictureFrame = pictureFrame;
	}
	
	public Image getImage()
	{
		return bufferedImage;
	}
	
	public int getBasicPixel(int x, int y)
	{
		return bufferedImage.getRGB(x,y);
	}
				
	public void setBasicPixel(int x, int y, int rgb)
	{
		bufferedImage.setRGB(x,y,rgb);
	}
		
	public Pixel getPixel(int x, int y)
	{
		Pixel pixel = new Pixel(this,x,y);
		return pixel;
	}
	
	public Pixel[] getPixels()
	{
		int width = getWidth();
		int height = getHeight();
		Pixel[] pixelArray = new Pixel[width * height];
			
		for (int row = 0; row < height; row++) 
		{	
			for (int col = 0; col < width; col++) 
			{
				pixelArray[row * width + col] = new Pixel(this,col,row);
			}
		}
		return pixelArray;
	}
	
	public Pixel[][] getPixels2D()
	{
		int width = getWidth();
		int height = getHeight();
		Pixel[][] pixelArray = new Pixel[height][width];
		
		for (int row = 0; row < height; row++) 
		{
			for (int col = 0; col < width; col++)
			{
				pixelArray[row][col] = new Pixel(this,col,row);
			}
		}	
		return pixelArray;
	}
	
	public void load(Image image)
	{
		Graphics2D graphics2d = bufferedImage.createGraphics();
		graphics2d.drawImage(image,0,0,null);
		show();
	}
	
	public void show()
	{
		if (pictureFrame != null)
		{
			pictureFrame.updateImageAndShowIt();
		}	
		else
		{
			pictureFrame = new PictureFrame(this);
		}
	}
	
	public void hide()
	{
		if (pictureFrame != null)
		{
			pictureFrame.setVisible(false);
		}
	}
	
	public void setVisible(boolean flag)
	{
		if (flag)
		{	
			this.show();
		}
		else
		{
			this.hide();
		} 
	}

	public void explore()
	{
		new PictureExplorer(new SimplePicture(this));
	}
	
	public void repaint()
	{
		if (pictureFrame != null)
		{
			pictureFrame.repaint();
		}	
		else
		{
			pictureFrame = new PictureFrame(this);
		}
	
	}
	
	public void loadOrFail(String fileName) throws IOException
	{
		this.fileName = fileName;
			
		int posDot = fileName.indexOf('.');
		if (posDot >= 0)
		{
			this.extension = fileName.substring(posDot + 1);
		}
		if (title == null)
		{
			title = fileName;
		}

		File file = new File(this.fileName);

		if (!file.canRead()) 
		{
			file = new File(FileChooser.getMediaPath(this.fileName));
			if (!file.canRead())
			{
				throw new IOException(this.fileName + " could not be opened. Check that you specified the path");
			}
		}
			
		bufferedImage = ImageIO.read(file);
	}

	public boolean load(String fileName)
	{
		try
		{
				this.loadOrFail(fileName);
				return true;

		}
		catch (Exception ex)
		{
			System.out.println("There was an error trying to open " + fileName);
			bufferedImage = new BufferedImage(600,200,
			BufferedImage.TYPE_INT_RGB);
			addMessage("Couldn't load " + fileName,5,100);
			return false;
		}
									
	}

	public boolean loadImage(String fileName)
	{
		return load(fileName);
	}
	
	public void addMessage(String message, int xPos, int yPos)
	{
		Graphics2D graphics2d = bufferedImage.createGraphics();
		graphics2d.setPaint(Color.white);	
		graphics2d.setFont(new Font("Helvetica",Font.BOLD,16));
		graphics2d.drawString(message,xPos,yPos);
			
	}
	
	public void drawString(String text, int xPos, int yPos)
	{
		addMessage(text,xPos,yPos);
	}
	
		public Picture scale(double rFactor, double cFactor)
		{
			AffineTransform scaleTransform = new AffineTransform();
			scaleTransform.scale(cFactor,rFactor);
			Picture result = new Picture((int) (getHeight() * rFactor), (int) (getWidth() * cFactor));
			Graphics graphics = result.getGraphics();
			Graphics2D g2 = (Graphics2D) graphics;	
			g2.drawImage(this.getImage(),scaleTransform,null);
			return result;
		}
		
		public Picture getPictureWithWidth(int width)
		{
			double xFactor = (double) width / this.getWidth();
			Picture result = scale(xFactor,xFactor);
			return result;
		}
		
		public Picture getPictureWithHeight(int height)
		{
			double yFactor = (double) height / this.getHeight();
			Picture result = scale(yFactor,yFactor);
			return result;
		}
	
	public boolean loadPictureAndShowIt(String fileName)
	{
		boolean result = true;
		result = load(fileName);	
		show();
		return result;
	}
	
	public void writeOrFail(String fileName) throws IOException
	{
		String extension = this.extension;

		File file = new File(fileName);
		File fileLoc = file.getParentFile();
			
		if (fileLoc == null)
		{
			fileName = FileChooser.getMediaPath(fileName);
			file = new File(fileName);
			fileLoc = file.getParentFile(); 
		}
			
		if (!fileLoc.canWrite()) 
		{
			throw new IOException(fileName + " could not be opened. Check to see if you can write to the directory.");
		}
		int posDot = fileName.indexOf('.');
		if (posDot >= 0)
		{
			extension = fileName.substring(posDot + 1);
		}	
		ImageIO.write(bufferedImage, extension, file);
					
	}

	public boolean write(String fileName)
	{
		try
		{
			this.writeOrFail(fileName);
			return true;
		}
		catch (Exception ex)
		{
			System.out.println("There was an error trying to write " + fileName);
			ex.printStackTrace();
			return false;
		}
									
	}
	
	public static String getMediaPath(String fileName) { return FileChooser.getMediaPath(fileName);}
	
		public Rectangle2D getTransformEnclosingRect(AffineTransform trans)
		{
			int width = getWidth();
			int height = getHeight();
			double maxX = width - 1;
			double maxY = height - 1;
			double minX, minY;
			Point2D.Double p1 = new Point2D.Double(0,0);
			Point2D.Double p2 = new Point2D.Double(maxX,0);
			Point2D.Double p3 = new Point2D.Double(maxX,maxY);
			Point2D.Double p4 = new Point2D.Double(0,maxY);
			Point2D.Double result = new Point2D.Double(0,0);
			Rectangle2D.Double rect = null;
			
			trans.deltaTransform(p1,result);
			minX = result.getX();
			maxX = result.getX();
			minY = result.getY();
			maxY = result.getY();
			trans.deltaTransform(p2,result);
			minX = Math.min(minX,result.getX());
			maxX = Math.max(maxX,result.getX());
			minY = Math.min(minY,result.getY());
			maxY = Math.max(maxY,result.getY());
			trans.deltaTransform(p3,result);
			minX = Math.min(minX,result.getX());
			maxX = Math.max(maxX,result.getX());
			minY = Math.min(minY,result.getY());
			maxY = Math.max(maxY,result.getY());
			trans.deltaTransform(p4,result);
			minX = Math.min(minX,result.getX());
			maxX = Math.max(maxX,result.getX());
			minY = Math.min(minY,result.getY());
			maxY = Math.max(maxY,result.getY());
				
			rect = new Rectangle2D.Double(minX,minY,maxX - minX + 1, maxY - minY + 1);
			return rect;
		}
		
	public Rectangle2D getTranslationEnclosingRect(AffineTransform trans)
	{
		return getTransformEnclosingRect(trans);
	}
	
	public String toString()
	{
		String output = "Simple Picture, filename " + fileName + " height " + getHeight() + " width " + getWidth();
		return output;
	}

}
