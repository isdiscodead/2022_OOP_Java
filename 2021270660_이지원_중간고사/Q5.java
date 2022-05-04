

/**
 * 2022 OOP Midterm Exam Q5
 * Program that uses Student Class
 * @author 이지원 2021270660
 * @since 2022-05-02
 */

public class Q5 {
	
	final static int SIZE = 1000;
	public static void main(String[] args) {
		// 1000개의 학생 객체 생성
		Student[] students = new Student[SIZE];
		
		for ( int i=0 ; i<1000; i++ ) {
			students[i] = new Student();
			// 랜덤은 어떻게 하지 ...
			students[i].setStudentName("student" + i);
			students[i].setStudentID("20220502" + i);
		}
		
		// 최고 GPA인 학생 찾기
		int maxIdx = 0;
		for ( int i=0 ; i<students.length ; i++ ) {
			if ( students[maxIdx].getStudentGPA() < students[i].getStudentGPA() ) {
				maxIdx = i;
			}
		}
		
		// output
		System.out.println("The best student : " + students[maxIdx].studentName + 
				" " + students[maxIdx].getStudentID() + " " + students[maxIdx].getStudentSex() +
				" " + students[maxIdx].getStudentGPA());
	}

}
