/**
 * 2022 OOP Midterm Exam Q5 - Student Class
 * Class that indicates students' informations
 * @author 이지원 2021270660
 * @since 2022-05-02
 */


public class Student {
	/**
	 * 1) data members
	 */
	public String studentName;
	private String studentID;
	private String studentSex;
	private double studentGPA;
	
	public Student(String studentName, String studentID, String studentSex, double studentGPA) {
		this.studentName = studentName;
		this.studentID = studentID;
		this.studentSex = studentSex;
		this.studentGPA = studentGPA;
	}
	
	public Student() {
		this.studentName = "unknown";
		this.studentSex = getRandomSex();
		this.studentGPA = getRandomGPA();
	}
	
	/**
	 * setter of student name
	 * @param name
	 */
	public void setStudentName( String name ){
		this.studentName = name;
	}
	
	/**
	 * getter of student name
	 * @return studentName
	 */
	public String getStudentName() {
		return this.studentName;
	}
	
	
	/**
	 * setter of studentID
	 * @param id
	 */
	public void setStudentID( String id ){
		this.studentID = id;
	}
	
	/**
	 * getter of studentID
	 * @return studentID
	 */
	public String getStudentID() {
		return this.studentID;
	}
	
	
	/**
	 * setter of student sex
	 * @param sex
	 */
	public void setStudentSex( String sex ){
		this.studentSex = sex;
	}
	
	/**
	 * getter of student sex
	 * @return studentSex
	 */
	public String getStudentSex() {
		return this.studentSex;
	}
	
	/**
	 * setter of student GPA
	 * @param gpa
	 */
	public void setStudentGPA( double gpa ){
		this.studentGPA = gpa;
	}
	
	/**
	 * getter of student sex
	 * @return studentSex
	 */
	public double getStudentGPA() {
		return this.studentGPA;
	}
	
	
	public String getRandomSex() {
		int num = (int) (Math.floor(Math.random()) );
		if ( num == 1 ) {
			return "Male";
		} else {
			return "Female";
		}
	}
	
	public double getRandomGPA() {
		double GPA = 0;
		GPA += Math.random();
		GPA += Math.random();
		GPA += Math.random();
		GPA += Math.random();
		GPA += Math.random();
		GPA -= 0.5;
		return GPA;
	}
}
