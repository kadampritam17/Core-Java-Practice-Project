package Inheritance;

public class QualityAssurance  extends Employee {

	private int noOfTestCases;

	
	public QualityAssurance(String name, int age, String gender, int empId, long bankAccountNo, String role,
			int basicSalary, int noOfTestCases) {
		super(name, age, gender, empId, bankAccountNo, role, basicSalary);
		this.noOfTestCases = noOfTestCases;
	}


	public int getNoOfTestCases() {
		return noOfTestCases;
	}


	public void setNoOfTestCases(int noOfTestCases) {
		this.noOfTestCases = noOfTestCases;
	}


	@Override
	public String toString() {
		return "QualityAssurance \n~~~~~~~~~~~~~~~~~~~~~~\n" + super.toString() + ",\nNo Of TestCases : " + noOfTestCases   ;
	}


	@Override
	public float calculateSalary(int basicSalary) {
		System.out.println("QA : CalculateSalary");
		float a = (float) (this.getBasicSalary() + 0.2*this.getBasicSalary()); 
		float b = 8000;
		float c = (10*this.noOfTestCases);
		return (a + b + c);
	}
	
	
	public void doWork()
	{
		System.out.println("QualityAssurance Work");
	}
	
}
