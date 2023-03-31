package sec01.exam02;

public class StudentExample {
	public StudentExample() {};

	public static void main(String[] args) {
		
//		People p = new People("시스타","123456");
		Student s =new Student("홍길동","123456-1234567",1);
		System.out.println("학생정보----");
		System.out.println(s.name);
		System.out.println(s.ssn);
		System.out.println(s.studentNo);
		
		System.out.println("s.toString()----");
		System.out.println(s.toString());

		
	}

}
