package cn.hanxu.oop.abstractclass;
/*
 * �̳�
 * 
 * 
 * */
public abstract class Animal {
	public abstract void run();  //ֻ���������󷽷� �����˳��󷽷����� һ���ǳ�����
	public static void breath(){
		System.out.println("����");
	}
	

}

class Cat extends Animal {

	@Override  //ע��
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("è��С��");
		
	}
	
}

class Dog extends Animal{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("����");
		
	}
	
}
	
	
	
	
	