package com.classtEx;

public class ClassEx {
	public static void main(String[] args) {
		//클래스의 정보 가져오기
		//Class clazz = Car.class;
		
		Class clazz; 
		
		try {
			// 해당 경로(패키지 포함한 클래스 이름)에 클래스가 존재할 경우 클래스 반환 
			// 없는 경우 오류 발생↓
			//clazz = Class.forName("com.classtEx.Car1");
			
			// 라이브러리가 잘 로드되었는지 확인할 때 사용
			clazz = Class.forName("com.classtEx.Car");
			
			System.out.println(clazz.getName());
			System.out.println(clazz.getSimpleName());
			System.out.println(clazz.getPackageName());
			
			//클래스 경로를 활용하여 리소스 절대경로 얻어오기
			String path = clazz.getResource("photo1.jpg").getPath();
			System.out.println(path);
					
					
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 정보 얻기 실패");
		}
		
	}

}
