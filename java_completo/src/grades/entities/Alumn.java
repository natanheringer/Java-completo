package grades.entities;

public class Alumn {

	
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	
	
	public double finalGrade() {
		
		return grade1 + grade2 + grade3;
		
	}
	
	public String result() {
		
		if (finalGrade() > 60) {
			
			System.out.println("" + name + "'s grades in total: " + finalGrade() + "/100.0");
			System.out.println("Result: Approved");
			
			
		} else {
			
			System.out.println("Result: Failed");
			System.out.println(name + "'s grades in total: " + finalGrade() + "/100.0");
			System.out.printf("Missing %.2f POINTS%n", missingPoints());
			
		}
		return name;
		
	}
	
	public double missingPoints() {
		
		return 60.0 - finalGrade();
		
	}
	
	
}
