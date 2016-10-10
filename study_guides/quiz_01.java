import java.util.Scanner;

public class quiz_01
{
	public static void main(String[]args)
	
	{
		System.out.println("question 1");
		int num = 45;
		System.out.printf("Iron has %d kinds of weapons in his suit.", num);
		
		System.out.println("\n question 2");
		String pres= "Abraham Lincoln";
		String quote = "Whatever you are, be a good one.";
		
		System.out.println(pres + " once said, " + "\"" + quote + "\"");
		
		System.out.println("\n question 3");
		int h = 45;
		int w = 64;
		
		int area = h*w;
		System.out.println("The area of your rectangle is..."+area);
		
		System.out.println("\n question 4 -> because nextInt is used, and the user inputed a string so the Scanner won't read it");
		
		System.out.println("\n question 5 -> b");
		
		System.out.println("\n question 6 -> b");
		
		System.out.println("\n question 7 -> add \\ before the quotations because they are special characters");
		
		System.out.println("\n question 8");
		System.out.println("This one goes on top \n This one goes on bottom");
		
		System.out.println("\n question 9");
		System.out.println(" a \t b \t c \n d \t e \t f \n g \t h \t i");
		
		System.out.println("\n question 10");
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your Math grade: ");
		int math = kb.nextInt();
		System.out.println("Please enter your Science grade: ");
		int science = kb.nextInt();
		System.out.println("Please enter your English grade: ");
		int english = kb.nextInt();
		System.out.println("Please enter your History grade: ");
		int history = kb.nextInt();
		System.out.println("Please enter your COMPSCI grade: ");
		int compsci = kb.nextInt();
		
		float gpa = ((math + science + english + history + compsci)/500);
		System.out.println(gpa);
		
		
		
	}
}