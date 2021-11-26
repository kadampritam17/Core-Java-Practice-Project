package Inheritance;

public class Developer extends Employee {

	private int linestOfCode;

	
	public Developer(String name, int age, String gender, int empId, long bankAccountNo, String role, int basicSalary,
			int linestOfCode) {
		super(name, age, gender, empId, bankAccountNo, role, basicSalary);
		this.linestOfCode = linestOfCode;
	}

	
	public int getLinestOfCode() {
		return linestOfCode;
	}
	

	public void setLinestOfCode(int linestOfCode) {
		this.linestOfCode = linestOfCode;
	}


	@Override
	public String toString() {
		return "Developer  \n~~~~~~~~~~~~~~~~~~~~~~\n" + super.toString() + ",\nLinestOfCode : " + linestOfCode  ;
	}


	@Override
	public float calculateSalary(int basicSalary) {
		System.out.println("Developer : CalculateSalary");
		float a = (float) (this.getBasicSalary() + 0.25*this.getBasicSalary()); 
		float b = 8000;
		float c = (2*this.linestOfCode);
		return (a + b + c);
	}
	
	
	public void doWork()
	{
		System.out.println("Developer Work");
	}
	
}
