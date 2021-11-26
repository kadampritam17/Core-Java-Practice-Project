import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudenIOOperation  {

	//	static List<Student> students = new ArrayList<>();


	public static void writeToFile(List<Student> students ) 
	{

		try {
			OutputStream file = new FileOutputStream("F:\\student.db");
			ObjectOutputStream object = new ObjectOutputStream(file);
			/*
			for(Iterator iterator = students.iterator(); iterator.hasNext();)
			{
				Student student = (Student) iterator.next();
				object.writeObject(student);
				//					System.out.println(iterator.next());				
			}
			 */
			
			for(Iterator<Student> iterator = students.iterator(); iterator.hasNext();)
			{
				object.writeObject(iterator.next());
				//					System.out.println(iterator.next());				
			}
			object.flush();
			object.close();
		}
		catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}


	public static List<Student> readFromFile() throws StudentDbFileNotFound {
		List<Student> students = new ArrayList<Student>();
		InputStream inputStream = null;
		ObjectInputStream objectInput = null;

		try {

			inputStream = new FileInputStream("F:\\student.db");
			objectInput = new ObjectInputStream(inputStream);

			while(inputStream.available() != 0) {
				Student student = (Student)objectInput.readObject();
				students.add(student);
				//				System.out.println(students);
			}
		}
		catch (FileNotFoundException e) {
			//throws StudentDbFileNotFound Exception
			throw new StudentDbFileNotFound();
		}
		catch (IOException | ClassNotFoundException e) {
			System.out.println(e);
		}
		finally
		{
			try {
				if(objectInput!=null)
					objectInput.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return students;
	}


}
