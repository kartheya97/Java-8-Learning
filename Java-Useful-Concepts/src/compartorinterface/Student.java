package compartorinterface;

import java.util.Arrays;
import java.util.Comparator;

public class Student {

	private int studentId;
	private String studentName;
	private int studentAge;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	
	public Student(int studentId, String studentName, int studentAge) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge + "]";
	}

	public static void main(String[] args) {
		
		Student[] studentObj = new Student[4];
		studentObj[0]        = new Student(45,"Sai",21);
		studentObj[1]        = new Student(13,"Sheru" , 26);
		studentObj[2]        = new Student(34,"Raju" , 12);
		studentObj[3]        = new Student(25,"Raj" , 9);
		
		//Returning the list of students based on age in descending order
		Comparator<Student> ageComparator = Comparator.comparingInt(Student::getStudentAge).reversed();
		Arrays.sort(studentObj,ageComparator);
		System.out.println(" Descending Order Age Sorted : "+Arrays.toString(studentObj));
		
		//Returning the list of Students based on StudentId Ascending order.
		Comparator<Student> idComparator = Comparator.comparingInt(Student::getStudentId);
		Arrays.sort(studentObj, idComparator);
		System.out.println(" Ascending Order StudentId Sorted : "+Arrays.toString(studentObj));
		
	}

	
	
	
	
}
