package calc;

public class Calc {
	public static void main(String[] args) {
		System.out.println("객체 생성");
		
		Calc calc = new Calc(); //객체 생성
		calc.execute();  // 실행
		
	}
	public void execute() {
		double result = avg(7,10);	//result에 평균값입력(실행)	
		System.out.println("실행결과:"+result);
	}

	private double avg(int i, int j) {
		System.out.println("avg시작");
		int sum = plus(i,j); 
		System.out.println("avg실행");
		return sum/2.0; //실수로 구하고자하여 2,0으로 나눠줌
	}

	private int plus(int i, int j) {
		
		return i+j;
	}


 }
