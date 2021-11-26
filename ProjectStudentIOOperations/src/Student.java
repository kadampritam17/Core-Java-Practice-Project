import java.io.Serializable;
import java.util.Arrays;

public class Student implements Serializable {

	private String name;
	private int age;
	private int[] marks;
	
	
	public Student() {
		super();
		this.name = "";
		this.age = 0;
		this.marks = new int[5];
	}
	public Student(String name, int age, int[] marks) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	
	
	public Student(String name2, int age2) {
		super();
		this.name = name2;
		this.age = age2;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getAge() {
		return age;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public int[] getMarks() {
		return marks;
	}
	
	
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", marks=" + Arrays.toString(marks) + "]";
	}
	
	
}
