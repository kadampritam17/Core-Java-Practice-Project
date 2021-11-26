import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		StudenIOOperation studenIOOperation = new StudenIOOperation();
		List<Student> students = null;


		//populate Students From file
		try {
			students = StudenIOOperation.readFromFile();

		} catch (StudentDbFileNotFound e) {
			students = new ArrayList<>();
		}

		boolean check = true;
		while(check)
		{
			menu();
			System.out.println("Enter Choice :");
			int ch = scanner.nextInt();
			switch(ch)
			{
			case 0 : //0.to see all  previous records
				showAllStudent(students);
				break;
			case 1 : //Add Student (UserInput: name,age,marks)
				addStudent(students ,scanner);
				break;

			case 2 : //Add student without marks (UserInput: name,age)
				addStudentWithoutMarks(students,  scanner);
				break;

			case 3 : // Search Student by name(usrinput:name)
				searchStudent(students, scanner);
				break;

			case 4 : //Remove Student (usrinput:name)
				removeStudent(students, scanner);
				break;

			case 5 : //Remove All Student 
				removeAllStudent(students, scanner);
				break;

			case 6 : //Exit without save
				System.out.println("Exit Without Saved...!!!");
				check = false;
				break;

			case 7 : //Exit with save  (Save all Student in file)
				StudenIOOperation.writeToFile(students);
				System.out.println("File Saved Successfully...!!!");
				check = false;
				break;
				
				default : System.out.println("Plz Enter Valid Choice...!!!");
				break;
			}
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}

	}

	private static void showAllStudent(List<Student> students) {
		for(Iterator<Student> iterator = students.iterator(); iterator.hasNext();)
			System.out.println(iterator.next());
//		
		
//		for(Student s: students)
//			System.out.println(s);
		
//		for(int i=0; i<students.size(); i++)
//			System.out.println(students.get(i));
		
//		students.stream().forEach((s)->{System.out.println(s);});
		
	}

	private static void removeAllStudent(List<Student> students, Scanner scanner) {
		students.removeAll(students);
		System.out.println("Removed All Students Successfully...!!!");
	}

	private static void removeStudent(List<Student> students, Scanner scanner) {
		scanner.nextLine();  //to clear buffer
		System.out.println("Enter Name to Remove : ");
		String name=scanner.nextLine();

		for(Iterator<Student> iterator = students.iterator(); iterator.hasNext();)  //iterator.hasNext();-->>provides boolean value so it is condition
		{
			String removedStudentName = iterator.next().getName();
			if(name.equalsIgnoreCase(removedStudentName))   //iterator.next()-->>provides here whole object
			{
				iterator.remove();
				System.out.println("Removed Student " + removedStudentName  + " Successfully...!!!");
			}
		}
	}

	private static void searchStudent(List<Student> students, Scanner scanner) {
		scanner.nextLine(); //to clear buffer
		System.out.println("Enter Name to Search");
		String name=scanner.nextLine();

		for(Iterator<Student> iterator = students.iterator(); iterator.hasNext();)
			if(name.equalsIgnoreCase(iterator.next().getName()))   //iterator.next()-->>provides here whole object
				System.out.println(iterator.next());
	}

	private static void addStudent(List<Student> students, Scanner scanner) {
		scanner.nextLine();
		System.out.println("Enter name : ");
		String name = scanner.nextLine();
		System.out.println("Enter age : ");
		int age = scanner.nextInt();
		System.out.println("Enter marks : ");
		int[] marks = new int[3];
		for(int i=0; i<marks.length; i++)
		{
			marks[i] = scanner.nextInt();
		}

		Student student = new Student(name, age, marks);
		students.add(student);
	}

	private static void addStudentWithoutMarks(List<Student> students, Scanner scanner) {
		scanner.nextLine();
		System.out.println("Enter name : ");
		String name = scanner.nextLine();
		System.out.println("Enter age : ");
		int age = scanner.nextInt();

		Student student = new Student(name, age);
		students.add(student);
	}

	private static void menu() {
		System.out.println(	"0. Show All student\n" + 
				"1. Add Student (UserInput: name,age,marks)\n" + 
				"2. Add student without marks (UserInput: name,age)\n" + 
				"3. Search Student by name(usrinput:name)\n" + 
				"4. Remove Student (usrinput:name)\n" +
				"5. Remove All Student\n" +
				"6. Exit without save\n" +
				"7. Exit with save  (Save all Student in file)\n");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

}
