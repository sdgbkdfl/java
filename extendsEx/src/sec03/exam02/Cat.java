package sec03.exam02;

public class Cat extends Animal {
	public Cat() {
		this.kind = "포유류";
	}
	//오버라이딩 

	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		super.breathe();
	}

	@Override
	public void print(Animal animal) {
		// TODO Auto-generated method stub
		super.print(animal);
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}
}
