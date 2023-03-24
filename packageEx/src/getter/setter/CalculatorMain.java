package getter.setter;

public class CalculatorMain {

	public static void main(String[] args) {
		//static오로 선언했을때 사용방법
		double res = 10*10*Calculator.pi;
		int plus = Calculator.plus(5, 5);
		int minus = Calculator.minus(5, 5);
System.out.println(" 합은:"+plus);
	}

}

