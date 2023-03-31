package sec01.exam02;

//자식클래스에서 부모 클래스를 정의한다
public class Student extends People {
	
//	public Student(String name, String ssn) {
//		super(name, ssn);
		
//	}
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		//부모생성자 호출
		super(name,ssn);
		this.studentNo = studentNo;
		
//		@Override String toString() {
//			return name+"/"+ssn+"/"+studentNo;
		
	}
			
		
		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			return super.equals(obj);
		}
	}
	
