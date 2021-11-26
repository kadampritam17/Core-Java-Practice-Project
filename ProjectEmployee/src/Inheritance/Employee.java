package Inheritance;

public abstract  class Employee extends Person {


	private int empId;
	private long bankAccountNo;
	private String role;
	private int basicSalary;



	public Employee(String name, int age, String gender, int empId, long bankAccountNo, String role, int basicSalary) {
		super(name, age, gender);
		this.empId = empId;
		this.bankAccountNo = bankAccountNo;
		this.role = role;
		this.basicSalary = basicSalary;
	}



	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	public long getBankAccountNo() {
		return bankAccountNo;
	}



	public void setBankAccountNo(long bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	public int getBasicSalary() {
		return basicSalary;
	}



	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}



	@Override
	public String toString() {
		return super.toString() + ",\nEmp ID : " + empId + ",\nBank Account No : " + bankAccountNo + ",\nrole : " + role + ",\nbasicSalary : "
				+ basicSalary ;
	}

	//abstract method
	public abstract float calculateSalary(int basicSalary);

	//final method
	public final void paySalary()
	{
		System.out.println(calculateSalary(basicSalary));
	}

	//public method
	public void doWork()
	{
		System.out.println("No Work");
	}

}
