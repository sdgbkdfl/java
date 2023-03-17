package ifelse;

public class Rotto {

	public static void main(String[] args) {
		//1부터 45까지의 수 중에서 무작위로 5개 숫자 출력
		//카운트 : 숫자 출력시 1씩 증가
		
		int i =0;
		while(true) {
			
			int num = (int)(Math.random()*45 + 1);
			System.out.print(num+ "  ");
			
			i++
			;
			if(i==5) {
				break;
			}
		}

	}

}
