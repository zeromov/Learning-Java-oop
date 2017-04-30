package cn.hanxu.oop.testInterface;

public interface Flyable {
	int MAX_SPEED = 110000;
	int MIN_SPEED = 1;
	void fly();//该方法必然抽象

}


interface Attack{
	void attack();
	
}

class Plane implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("飞机依靠发动机飞");
		
	}
	
}

class Man implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("跳起来  飞");
	}
	
}

class Stone implements Flyable,Attack{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
		System.out.println("被人扔出去   飞");
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("打人");
		
	}
	
	
}