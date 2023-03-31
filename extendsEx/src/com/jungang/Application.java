package com.jungang;

import java.util.Random;

public class Application {

	public static void main(String[] args) {
		Animal[] a =  new Animal[5];
	
		Random rand = new Random();		

	for (int i = 0; i < a.length; i++) {
		
        int randNum = rand.nextInt(2);
        if (randNum == 0) {
           a[i] = new Dog();
    
           a[i].speak();
           
        } else {
            a[i] = new Cat();
            a[i].speak();
            
        }
        }
    }
}
