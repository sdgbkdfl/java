package com.jungang;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		/*
		 * 3명의 학생 정보를 기록할 수 있게 객체 배열을 할당
		 * 데이터를 참고하여 3명의 학생 객체 생성
		 * 반복문을 통해 출력
		 */
		// 배열 선언 : 같은 타입의 데이터를 여러개 보관
		// 타입 []변수명 =new 타입[길이];

		Student[] students = new Student[3];
		
		//학생 객체 생성 후 배열에 담기 
		 
		  students[0] = new Student("홍길동", 20, 178.2, 70.0,1,"정보시스템공학과");
	      students[1] = new Student("김말똥", 21, 187.3,80.0,2, "경영학과");
	      students[2] = new Student("강개순", 23,167.0,45.0,4, "정보통신공학과");
	    
	      //향상된 for문
	      for(Student stu: students) {
	    	  System.out.println(stu.information());
		      System.out.println();	

	}
	      /*
	       * 최대 10명의 사원정보를 기록할 객체 배얄 생성
	       * 키보드로 사원정보를 입력받거록 구현
	       */
	      Employee[] empArry = new Employee[10];
	      Scanner scan = new Scanner(System.in);
	      
	      int index =0;
	      while(true) {
	    	  System.out.println("이름: ");
	    	  String name = scan.next();
	    	  System.out.println("나이: ");
	    	  int age = scan.nextInt();
	    	  System.out.println("신장: ");
	    	  double height = scan.nextDouble();
	    	  System.out.println("몸무게: ");
	    	  double weight = scan.nextDouble();
	    	  System.out.println("급여: ");
	    	  int salary = scan.nextInt();
	    	  System.out.println("부서: ");
	    	  String dept = scan.next();
	    	  
	    	  
	    	  
	    	  //매개변수 생성자를 이용하여 필드를 초기화
	    	  Employee emp = new Employee(name, age, height, weight, salary, dept );
	    	  empArry[index] = emp;
	    	 //사원 입력후 다음번 방 이동
	    	  index++;
	    	  System.out.println(emp.information());
	    	  
	    	  //반복문 탈출
	    	  System.out.println("종료하시려면 Y를 입력해주세요");
	    	  String next = scan.next();
	    	  if(next.equals("Y")||index ==10) {
	    		  break;
	    	  }
	      }
	      
	      for(Employee e : empArry) {
	    	  //null체크
	    	  //배열이 초기화될 때 null값으로 초기화
	    	  //e. <-주소접근 연산자인 .이용 경우 null은 주소 가지고 있지 않으므로 오류 발생
	    	  if(e==null) {
	    		  break;
	    	  }
	    	  System.out.println(e.information());
	      }
	      
	      
	      

	      
	
	}

}