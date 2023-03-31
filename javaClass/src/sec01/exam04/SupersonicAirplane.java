package sec01.exam04;

public class SupersonicAirplane extends Airplane {
	
	//상수는 정의 후 값을 변경할 수 없다
public static final int NORMAL = 1;	
public static final int SUPERSONIC = 2;	


 public int flyMode;
 
	 public SupersonicAirplane(int flymode) {
		 if(flyMode ==NORMAL&& flyMode ==SUPERSONIC) {
			 this.flyMode=flymode;
		 }else {
			 flyMode = NORMAL;
		 }
	 }
		 
		 public void fly() {
			 //부모가 가진 메서드를 자식 클래스에서 재정의
			 //super.메소드명();			
			 if(flyMode == SUPERSONIC) {
				 System.out.println("초음속 비행");
			 }else {				 
				 //부모가 가지고 있는 fly메소드를 호출
				 //super 이용해서 접근
				 super.fly();
				 
			 }
	 }
		 public void booster() {  // 자식 객체만 가지고 있는 메소드
			 System.out.println("부스터작동");
		 }
 }

