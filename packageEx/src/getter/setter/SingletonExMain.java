package getter.setter;

public class SingletonExMain {

	public static void main(String[] args) {
		//new연산자로 접근불가하기 때문에(접근제한자private)
		//메소드로 접근
		SingletonEx ex = SingletonEx.getInstance();  
		SingletonEx ex1 = SingletonEx.getInstance();
		SingletonEx ex2 = SingletonEx.getInstance();
		SingletonEx ex3 = SingletonEx.getInstance();
		SingletonEx ex4 = SingletonEx.getInstance();
		
		//같은 주소를 갖고 있는지 확인
		if(ex==ex1) {
			System.out.println("같은 객체입니다.");
			
		}else {
			
			System.out.println("다른 객체입니다.");
		}


	}

}
