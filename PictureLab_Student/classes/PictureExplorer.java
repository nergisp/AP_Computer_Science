

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.*;
import javax.swing.border.*;

public class PictureExplorer implements MouseMotionListener, ActionListener, MouseListener
	{

	private int rowIndex = 0; 
	private int colIndex = 0;
	
	private JFrame pictureFrame;
	private JScrollPane scrollPane;

	private JLabel colLabel;
	private JButton colPrevButton;
	private JButton rowPrevButton;
	private JButton colNextButton;
	private JButton rowNextButton;
	private JLabel rowLabel;
	private JTextField colValue;
	private JTextField rowValue;
	private JLabel rValue;
	private JLabel gValue;
	private JLabel bValue;
	private JLabel colorLabel;
	private JPanel colorPanel;

	private JMenuBar menuBar;
	private JMenu zoomMenu;
	private JMenuItem twentyFive;
	private JMenuItem fifty;
	private JMenuItem seventyFive;
	private JMenuItem hundred;
	private JMenuItem hundredFifty;
	private JMenuItem twoHundred;
	private JMenuItem fiveHundred;
	
	private DigitalPicture picture;
	private ImageIcon scrollImageIcon;
	private ImageDisplay imageDisplay;
	private double zoomFactor;
	private int numberBase=0;
	
	public PictureExplorer(DigitalPicture picture)
	{
		this.picture=picture;
		zoomFactor=1;
		createWindow();
	}

	public void changeToBaseOne()
	{
		numberBase=1;
	}

	public void setTitle(String title)
	{
		pictureFrame.setTitle(title);
	}

	private void createAndInitPictureFrame()
	{
		pictureFrame = new JFrame(); // create the JFrame
		pictureFrame.setResizable(true);  // allow the user to resize it
		pictureFrame.getContentPane().setLayout(new BorderLayout()); // use border layout
		pictureFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // when close stop
		pictureFrame.setTitle(picture.getTitle());
		PictureExplorerFocusTraversalPolicy newPolicy = new PictureExplorerFocusTraversalPolicy();
		pictureFrame.setFocusTraversalPolicy(newPolicy);
		
	}

	private void setUpMenuBar()
	{

		menuBar = new JMenuBar();
		zoomMenu = new JMenu("Zoom");
		twentyFive = new JMenuItem("25%");
		fifty = new JMenuItem("50%");
		seventyFive = new JMenuItem("75%");
		hundred = new JMenuItem("100%");
		hundred.setEnabled(false);
		hundredFifty = new JMenuItem("150%");
		twoHundred = new JMenuItem("200%");
		fiveHundred = new JMenuItem("500%");
		
		twentyFive.addActionListener(this);
		fifty.addActionListener(this);
		seventyFive.addActionListener(this);
		hundred.addActionListener(this);
		hundredFifty.addActionListener(this);
		twoHundred.addActionListener(this);
		fiveHundred.addActionListener(this);
		
		zoomMenu.add(twentyFive);
		zoomMenu.add(fifty);
		zoomMenu.add(seventyFive);
		zoomMenu.add(hundred);
		zoomMenu.add(hundredFifty);
		zoomMenu.add(twoHundred);
		zoomMenu.add(fiveHundred);
		menuBar.add(zoomMenu);
		
		pictureFrame.setJMenuBar(menuBar);
	}
	
	private void createAndInitScrollingImage()
	{
		scrollPane = new JScrollPane();
		
		BufferedImage bimg = picture.getBufferedImage();
		imageDisplay = new ImageDisplay(bimg);
		imageDisplay.addMouseMotionListener(this);
		imageDisplay.addMouseListener(this);
		imageDisplay.setToolTipText("Click a mouse button on a pixel to see the pixel information");
		scrollPane.setViewportView(imageDisplay);
		pictureFrame.getContentPane().add(scrollPane, BorderLayout.CENTER);
	}
	
	private void createWindow()
	{

		createAndInitPictureFrame();

		setUpMenuBar();

		createInfoPanel();

		createAndInitScrollingImage();

		pictureFrame.pack();
		pictureFrame.setVisible(true);
	}

	private void setUpNextAndPreviousButtons()
	{

		Icon prevIcon = new ImageIcon(DigitalPicture.class.getResource("leftArrow.gif"), 
																	"previous index");
		Icon nextIcon = new ImageIcon(DigitalPicture.class.getResource("rightArrow.gif"), 
																	"next index");

		colPrevButton = new JButton(prevIcon);
		colNextButton = new JButton(nextIcon);
		rowPrevButton = new JButton(prevIcon);
		rowNextButton = new JButton(nextIcon);
		

		colNextButton.setToolTipText("Click to go to the next column value");
		colPrevButton.setToolTipText("Click to go to the previous column value");
		rowNextButton.setToolTipText("Click to go to the next row value");
		rowPrevButton.setToolTipText("Click to go to the previous row value");
		

		int prevWidth = prevIcon.getIconWidth() + 2;
		int nextWidth = nextIcon.getIconWidth() + 2;
		int prevHeight = prevIcon.getIconHeight() + 2;
		int nextHeight = nextIcon.getIconHeight() + 2;
		Dimension prevDimension = new Dimension(prevWidth,prevHeight);
		Dimension nextDimension = new Dimension(nextWidth, nextHeight);
		colPrevButton.setPreferredSize(prevDimension);
		rowPrevButton.setPreferredSize(prevDimension);
		colNextButton.setPreferredSize(nextDimension);
		rowNextButton.setPreferredSize(nextDimension);

		colPrevButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				colIndex--;
				if (colIndex < 0)
					colIndex = 0;
				displayPixelInformation(colIndex,rowIndex);
			}
		});
		
		rowPrevButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				rowIndex--;
				if (rowIndex < 0)
					rowIndex = 0;
				displayPixelInformation(colIndex,rowIndex);
			}
		});

		colNextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				colIndex++;
				if (colIndex >= picture.getWidth())
					colIndex = picture.getWidth() - 1;
				displayPixelInformation(colIndex,rowIndex);
			}
		});
		
		rowNextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				rowIndex++;
				if (rowIndex >= picture.getHeight())
					rowIndex = picture.getHeight() - 1;
				displayPixelInformation(colIndex,rowIndex);
			}
		});
	}
	
	public JPanel createLocationPanel(Font labelFont) {

		JPanel locationPanel = new JPanel();
		locationPanel.setLayout(new FlowLayout());
		Box hBox = Box.createHorizontalBox();
		
		rowLabel = new JLabel("Row:");
		colLabel = new JLabel("Column:");

		colValue = new JTextField(Integer.toString(colIndex + numberBase),6);
		colValue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayPixelInformation(colValue.getText(),rowValue.getText());
			}
		});
		rowValue = new JTextField(Integer.toString(rowIndex + numberBase),6);
		rowValue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayPixelInformation(colValue.getText(),rowValue.getText());
			}
		});

		setUpNextAndPreviousButtons();
		
		colLabel.setFont(labelFont);
		rowLabel.setFont(labelFont);
		colValue.setFont(labelFont);
		rowValue.setFont(labelFont);
		
		hBox.add(Box.createHorizontalGlue());
		hBox.add(rowLabel);
		hBox.add(rowPrevButton);
		hBox.add(rowValue);
		hBox.add(rowNextButton);
		hBox.add(Box.createHorizontalStrut(10));
		hBox.add(colLabel);
		hBox.add(colPrevButton);
		hBox.add(colValue);
		hBox.add(colNextButton);
		locationPanel.add(hBox);
		hBox.add(Box.createHorizontalGlue());
		
		return locationPanel;
	}
	
	private JPanel createColorInfoPanel(Font labelFont)
	{

		JPanel colorInfoPanel = new JPanel();
		colorInfoPanel.setLayout(new FlowLayout());
		

		Pixel pixel = new Pixel(picture,colIndex,rowIndex);
		

		rValue = new JLabel("R: " + pixel.getRed());
		gValue = new JLabel("G: " + pixel.getGreen());
		bValue = new JLabel("B: " + pixel.getBlue());
		

		colorLabel = new JLabel("Color at location: ");
		colorPanel = new JPanel();
		colorPanel.setBorder(new LineBorder(Color.black,1));
		
		colorPanel.setBackground(pixel.getColor());
		

		rValue.setFont(labelFont);
		gValue.setFont(labelFont);
		bValue.setFont(labelFont);
		colorLabel.setFont(labelFont);
		colorPanel.setPreferredSize(new Dimension(25,25));
		

		colorInfoPanel.add(rValue);
		colorInfoPanel.add(gValue);
		colorInfoPanel.add(bValue);
		colorInfoPanel.add(colorLabel);
		colorInfoPanel.add(colorPanel);
		
		return colorInfoPanel; 
	}
	
	private void createInfoPanel()
	{

		JPanel infoPanel = new JPanel();
		infoPanel.setLayout(new BorderLayout());

		Font largerFont = new Font(infoPanel.getFont().getName(),
															 infoPanel.getFont().getStyle(),14);
		
		JPanel locationPanel = createLocationPanel(largerFont);
		
		JPanel colorInfoPanel = createColorInfoPanel(largerFont);
		
		infoPanel.add(BorderLayout.NORTH,locationPanel);
		infoPanel.add(BorderLayout.SOUTH,colorInfoPanel); 

		pictureFrame.getContentPane().add(BorderLayout.NORTH,infoPanel);
	} 
	
	public void checkScroll()
	{

		int xPos = (int) (colIndex * zoomFactor); 
		int yPos = (int) (rowIndex * zoomFactor); 
		
		if (zoomFactor > 1) {
			
			JViewport viewport = scrollPane.getViewport();
			Rectangle rect = viewport.getViewRect();
			int rectMinX = (int) rect.getX();
			int rectWidth = (int) rect.getWidth();
			int rectMaxX = rectMinX + rectWidth - 1;
			int rectMinY = (int) rect.getY();
			int rectHeight = (int) rect.getHeight();
			int rectMaxY = rectMinY + rectHeight - 1;
			
			int macolIndexX = (int) (picture.getWidth() * zoomFactor) - rectWidth - 1;
			int macolIndexY = (int) (picture.getHeight() * zoomFactor) - rectHeight - 1;
			
			int viewX = xPos - (int) (rectWidth / 2);
			int viewY = yPos - (int) (rectHeight / 2);
			
			if (viewX < 0)
				viewX = 0;
			else if (viewX > macolIndexX)
				viewX = macolIndexX;
			if (viewY < 0)
				viewY = 0;
			else if (viewY > macolIndexY)
				viewY = macolIndexY;
			

			viewport.scrollRectToVisible(new Rectangle(viewX,viewY,rectWidth,rectHeight));
		}
	}
	
	public void zoom(double factor)
	{
		zoomFactor = factor;
		
		int width = (int) (picture.getWidth()*zoomFactor);
		int height = (int) (picture.getHeight()*zoomFactor);
		BufferedImage bimg = picture.getBufferedImage();
		
		imageDisplay.setImage(bimg.getScaledInstance(width, height, Image.SCALE_DEFAULT));
		imageDisplay.setCurrentX((int) (colIndex * zoomFactor));
		imageDisplay.setCurrentY((int) (rowIndex * zoomFactor));
		imageDisplay.revalidate();
		checkScroll();
	}
	
	public void repaint()
	{
		pictureFrame.repaint();
	}
	
	public void mouseDragged(MouseEvent e)
	{
		displayPixelInformation(e);
	}
	
	private boolean isLocationInPicture(int column, int row)
	{
		boolean result = false; // the default is false
		if (column >= 0 && column < picture.getWidth() &&
				row >= 0 && row < picture.getHeight())
			result = true;
		
		return result;
	}
	
	public void displayPixelInformation(String xString, String yString)
	{
		int x = -1;
		int y = -1;
		try {
			x = Integer.parseInt(xString);
			x = x - numberBase;
			y = Integer.parseInt(yString);
			y = y - numberBase;
		} catch (Exception ex) {
		}
		
		if (x >= 0 && y >= 0) {
			displayPixelInformation(x,y);
		}
	}
	
	private void displayPixelInformation(int pictureX, int pictureY)
	{

		if (isLocationInPicture(pictureX, pictureY))
		{

			colIndex = pictureX;
			rowIndex = pictureY;
			

			Pixel pixel = new Pixel(picture,colIndex,rowIndex);
			
			colValue.setText(Integer.toString(colIndex  + numberBase));
			rowValue.setText(Integer.toString(rowIndex + numberBase));
			rValue.setText("R: " + pixel.getRed());
			gValue.setText("G: " + pixel.getGreen());
			bValue.setText("B: " + pixel.getBlue());
			colorPanel.setBackground(new Color(pixel.getRed(), pixel.getGreen(), pixel.getBlue()));
			
		} 
		else
		{
			clearInformation();
		}
		
		imageDisplay.setCurrentX((int) (colIndex * zoomFactor));
		imageDisplay.setCurrentY((int) (rowIndex * zoomFactor));
	}
	
	private void displayPixelInformation(MouseEvent e)
	{
		
		int cursorX = e.getX();
		int cursorY = e.getY();
		
		int pictureX = (int) (cursorX / zoomFactor + numberBase);
		int pictureY = (int) (cursorY / zoomFactor + numberBase);
		
		displayPixelInformation(pictureX,pictureY);
		
	}
	
	private void clearInformation()
	{
		colValue.setText("N/A");
		rowValue.setText("N/A");
		rValue.setText("R: N/A");
		gValue.setText("G: N/A");
		bValue.setText("B: N/A");
		colorPanel.setBackground(Color.black);
		colIndex = -1;
		rowIndex = -1;
	}
	
	public void mouseMoved(MouseEvent e)
	{}
	
	public void mouseClicked(MouseEvent e)
	{
		displayPixelInformation(e);
	}
	
	public void mousePressed(MouseEvent e)
	{
		displayPixelInformation(e);
	}
	
	public void mouseReleased(MouseEvent e)
	{
	}
	
	public void mouseEntered(MouseEvent e)
	{
	}
	
	public void mouseExited(MouseEvent e)
	{
	}
	
	private void enableZoomItems()
	{
		twentyFive.setEnabled(true);
		fifty.setEnabled(true);
		seventyFive.setEnabled(true);
		hundred.setEnabled(true);
		hundredFifty.setEnabled(true);
		twoHundred.setEnabled(true);
		fiveHundred.setEnabled(true);
	}
	
	public void actionPerformed(ActionEvent a)
	{
		
		if(a.getActionCommand().equals("Update"))
		{
			this.repaint();
		}
		
		if(a.getActionCommand().equals("25%"))
		{
			this.zoom(.25);
			enableZoomItems();
			twentyFive.setEnabled(false);
		}
		
		if(a.getActionCommand().equals("50%"))
		{
			this.zoom(.50);
			enableZoomItems();
			fifty.setEnabled(false);
		}
		
		if(a.getActionCommand().equals("75%"))
		{
			this.zoom(.75);
			enableZoomItems();
			seventyFive.setEnabled(false);
		}
		
		if(a.getActionCommand().equals("100%"))
		{
			this.zoom(1.0);
			enableZoomItems();
			hundred.setEnabled(false);
		}
		
		if(a.getActionCommand().equals("150%"))
		{
			this.zoom(1.5);
			enableZoomItems();
			hundredFifty.setEnabled(false);
		}
		
		if(a.getActionCommand().equals("200%"))
		{
			this.zoom(2.0);
			enableZoomItems();
			twoHundred.setEnabled(false);
		}
		
		if(a.getActionCommand().equals("500%"))
		{
			this.zoom(5.0);
			enableZoomItems();
			fiveHundred.setEnabled(false);
		}
	}
	
	
	
	private class PictureExplorerFocusTraversalPolicy
		extends FocusTraversalPolicy {
		
		public Component getComponentAfter(Container focusCycleRoot, Component aComponent) {
			if (aComponent.equals(colValue))
				return rowValue;
			else 
				return colValue;
		}
		
		public Component getComponentBefore(Container focusCycleRoot, Component aComponent) {
			if (aComponent.equals(colValue))
				return rowValue;
			else 
				return colValue;
		}
		
		public Component getDefaultComponent(Container focusCycleRoot) {
			return colValue;
		}
		
		public Component getLastComponent(Container focusCycleRoot) {
			return rowValue;
		}
		
		public Component getFirstComponent(Container focusCycleRoot) {
			return colValue;
		}
	}
	
	public static void main( String args[])
	{
		Picture pix = new Picture("seagull.jpg");
		pix.explore();
	}
	
}
