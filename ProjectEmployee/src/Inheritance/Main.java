package Inheritance;

public class Main {

	public static void main(String[] args) {
		
		Employee manager = new Manager("Pritam", 24, "Female", 101, 200005858, "Manager", 26000, 40);
		System.out.println("\n" + manager);
		manager.paySalary();
		manager.doWork();
		System.out.println("--------------------------------------------------------------------------");
		
		
		Employee developer = new Developer("Pratham", 21, "Male", 102, 300007575, "Developer", 15000, 60000);
		System.out.println("\n" + developer);
		developer.paySalary();
		developer.doWork();
		System.out.println("--------------------------------------------------------------------------");
		
		
		Employee qualityAssurance = new QualityAssurance("Priya", 25, "Female", 222, 400002659, "QualityAssurance", 20000, 30000);
		System.out.println("\n" + qualityAssurance);
		qualityAssurance.paySalary();
		qualityAssurance.doWork();
		System.out.println("--------------------------------------------------------------------------");
		

	}

}
