package Inheritance;

public class Manager extends Employee {

	
	private int maxTeamSize;

	
	public Manager(String name, int age, String gender, int empId, long bankAccountNo, String role, int basicSalary,
			int maxTeamSize) {
		super(name, age, gender, empId, bankAccountNo, role, basicSalary);
		this.maxTeamSize = maxTeamSize;
	}
	

	public int getMaxTeamSize() {
		return maxTeamSize;
	}
	

	public void setMaxTeamSize(int maxTeamSize) {
		this.maxTeamSize = maxTeamSize;
	}

	
	@Override
	public String toString() {
		return "Manager  \n~~~~~~~~~~~~~~~~~~~~~~\n " + super.toString() + ",\nMax Team Size : " + maxTeamSize  ;
	}


	@Override
	public float calculateSalary(int basicSalary) {
		System.out.println("Manager : CalculateSalary");
		float a = (float) (this.getBasicSalary() + 0.5*this.getBasicSalary()); 
		float b = 10000;
		return a+b;
	}
	
	
	public void doWork()
	{
		System.out.println("Manager Work");
	}
	
}
