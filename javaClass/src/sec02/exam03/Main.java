package sec02.exam03;

public class Main {

	public static void main(String[] args) {
		Car car = new Car();
		
		//10번 실행
		for(int i=0;i<10;i++) {
			int res = car.run();
			if(res >0) {
				car.changeTire(res);
			}
		}
		

	}

}
