import java.awt.Image;
import java.awt.image.BufferedImage;

public interface DigitalPicture 
{
	public String getFileName();
	public String getTitle();
	public void setTitle(String title);
	public int getWidth();
	public int getHeight();
	public Image getImage();
	public BufferedImage getBufferedImage();
	public int getBasicPixel(int x, int y);
	public void setBasicPixel(int x, int y, int rgb);
	public Pixel getPixel(int x, int y);
	public Pixel[] getPixels();
	public Pixel[][] getPixels2D();
	public void load(Image image);
	public boolean load(String fileName);
	public void show();
	public void explore();
	public boolean write(String fileName);
}
