import java.util.ArrayList;
public class Satellite2
{
    public static void main(String[]args) 
	{
        ArrayList<Location> locate = new ArrayList<>();

		double[] honLoc = {5, 6};
		double[] home = {0, 0};
		
        locate.add(new Honda2(honLoc));
        locate.add(new Toyota2("8, 9"));
        locate.add(new GMC2(3, 8));
        
        String printout = "==========================\n" + "Starting locations: ";
        
		for(Location2 l : locate) 
		{
            printout += "\nLocation for " + l.getID() + ": " + getLocation(l.getLoc());
        }        
		
        printout += "\n\nDistance from home...";
        
		for(Location2 l : locate) 
		{
            printout += "\nDistance for " + l.getID() + ": "  + getDistance(l.getLoc(), home);
        }
		
		printout += "\n\n==========================\n";
		
		for(Location2 l : locate) 
		{
            double one = Math.random() * 99 + 1;
			double two = Math.random() * 99 + 1;
			l.move(one, two);
			
            printout += "\n\nAfter " + l.getID() + " moved (" + one + ", " + two + ")"
            + "\nNew location: " + "(" + one + ", " + two + ")" + "\n";
        }
		
        printout += "\n\nDistance from home...";
        
		for(Location2 l : locate) 
		{
            printout += "\nDistance for " + l.getID() + ": " + getDistance(l.getLoc(), home);
        }
		
		printout += "\n\n==========================\n";
		
        System.out.println(printout);
    }
	
    public static String getDistance(double[] car, double[] home) 
	{
        return String.format("(%.2f)", Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2))));
    }
	
    public static String getLocation(double[] Loc) 
	{
        return String.format("(%.2f, %.2f)", Loc[0], Loc[1]);
    }
}
