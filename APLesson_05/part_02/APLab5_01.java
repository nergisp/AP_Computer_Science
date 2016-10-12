import java.util.Scanner;

public class APLab5_01 {
	
	static double value;
	
	public static void main(String[]args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter science grade: ");
		String science = kb.nextLine();
		
		System.out.println("Enter math grade: ");
		String math = kb.nextLine();

		System.out.println("Enter compsci grade: ");
		String compsci = kb.nextLine();

		System.out.println("Enter pe grade: ");
		String pe = kb.nextLine();

		System.out.println("Enter english grade: ");
		String english = kb.nextLine();

		System.out.println("Enter music grade: ");
		String music = kb.nextLine();

		System.out.println("Enter history grade: ");
		String history = kb.nextLine();

		double gPoint= calcPoint(science) + calcPoint(math) + calcPoint(compsci) + 
					   calcPoint(pe) + calcPoint(english) + calcPoint(music) + calcPoint(history);
		double gpa = gPoint/7;
		
		System.out.printf("Your unweighted GPA is %1.1f", gpa);
		
	}
	
	public static double calcPoint(String grade) {
		
		if (grade.equals("A"))
			value = 4.0;
			
		if (grade.equals("B"))
			value = 3.0;
			
		if (grade.equals("C"))
			value = 2.0;
		
		if (grade.equals("D"))
			value = 1.0;
		
		if (grade.equals("F"))
			value = 0.0;
		return value;
	}
	
}