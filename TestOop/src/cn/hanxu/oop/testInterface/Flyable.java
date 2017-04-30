package cn.hanxu.oop.testInterface;

public interface Flyable {
	int MAX_SPEED = 110000;
	int MIN_SPEED = 1;
	void fly();//�÷�����Ȼ����

}


interface Attack{
	void attack();
	
}

class Plane implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("�ɻ�������������");
		
	}
	
}

class Man implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("������  ��");
	}
	
}

class Stone implements Flyable,Attack{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
		System.out.println("�����ӳ�ȥ   ��");
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("����");
		
	}
	
	
}