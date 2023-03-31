package sec02.exam04;

public class Application {
	public static void main(String[] args) {
	  Driver driver = new Driver();
	  
	  //차량이 운행합니다
	  driver.drive(new Vehicle());
	  
	  //버스가 vehicle을 상속받아 구현되었으므로 
	  //vehicle이 자동 형변환 될 수 있더
	  //부모의 메서드가 오버라이딩(재작성)된 경우 
	  //자식 메서드를 호출한다
	  //매개값으로 어떤 자식 객체가 제공되는가에 따라 메소드 실행 결과가 다양해짐
	  driver.drive(new Bus());
	  
	  //vehicle타입을 상속받아서 구현된 크래스만 형변환이 가능
	  
}
}
