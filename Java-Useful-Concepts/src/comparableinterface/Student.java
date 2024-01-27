package comparableinterface;

import java.util.Arrays;

public class Student implements Comparable<Student>{

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
		Arrays.sort(studentObj);
		System.out.println("Descending Order Age Sorted :"+Arrays.toString(studentObj));
		
	}
	
	@Override
	public int compareTo(Student student) {
		// TODO Auto-generated method stub
		//System.out.println(" "+student.studentAge+" "+this.studentAge+" ");
		return Integer.compare(student.studentAge, this.studentAge);
	}
	
	/*
	
	@Override
	public int compareTo(Student student) {
		if(this.studentAge == student.studentAge)
			return 0;
		else if(this.studentAge < student.studentAge)
			return 1;
		else 
			return -1;
	}
	
	*/
	
	
	
	
	
}
