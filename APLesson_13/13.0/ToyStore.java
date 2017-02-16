import java.util.ArrayList;
import java.util.Arrays;

public class ToyStore
{
	ArrayList <Toy> toyList;
	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}
	
	public ToyStore(String tl)
	{
		loadToys(tl);
	}
	
	public void loadToys(String ts)
	{
		toyList = new ArrayList<Toy>();
		ArrayList <String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		for(int i = 0; i < toys.size(); i += 2)
		{
			String name = toys.get(i);
			String type = toys.get(i+1);
			Toy x = getThatToy(name);
			if(x == null)
			{
				if(type.equals("Car"))
				{
					toyList.add(new Car(name));
				}
				if(type.equals("AF"))
				{
					toyList.add(new AFigure(name));
				}
			}
			
			else
			{
				x.setCount(x.getCount() + 1);
			}
		}
	}
	
	public Toy getThatToy(String nm)
	{
		for(Toy x : toyList)
		{
			if(x.getName().equals(nm))
				return x;
		}
		
		return null;
	}

	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for(Toy x : toyList)
		{
			if(max < x.getCount())
			{
				max = x.getCount();
				name = x.getName();
			}				
		}
		return name;
	}
	
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		
		for(Toy x : toyList)
		{
			if(x.getType().equals("Car"))
			{
				cars ++;
			}
			
			if(x.getType().equals("Action Figure"))
			{
				figures ++;
			}
		}
		
		if(cars < figures)
		{
			return "Figures";
		}
		if(cars > figures)
		{
			return "Cars";
		}
		else
		{
			return "Equal number of action figures and cars";
		}
	}
	
	public String toString()
	{
		String output = "";
		for (Toy x : toyList)
		{
			output += " " + x;
		}
		
		return "\nToys in inventory...\n" + output + "\n";
	}
}