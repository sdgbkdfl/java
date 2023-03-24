package getter.setter;

import java.util.Calendar;

public class PersonMain {

	public static void main(String[] args) {
		Person p = new Person("12345", "홍삼마");
			//상수 필드의 값을 변경할 수 없다
//오류발생			p.nation ="한국";
			p.name = "홍삼마";
			
		System.out.println("파이값 :"+Person.PI);
		System.out.println("지구의 반지름 :"+Person.EARTH_RADIUS+"km");
//=====================================================================
		//new를 사용하지 않고 생성
		
		Calendar cal = Calendar.getInstance();
		
		//현재 일자를 출력
		int day = cal.get(Calendar.DATE);
		int day1 =cal.get(5);
		System.out.println(cal.get(Calendar.YEAR)+"년");
		System.out.println(cal.get(Calendar.DATE)+"일");
		System.out.println(cal.get(Calendar.HOUR)+"시");
		System.out.println(cal.get(Calendar.MINUTE)+"분");
		System.out.println(cal.get(Calendar.SECOND)+"초");
		
	}

}
