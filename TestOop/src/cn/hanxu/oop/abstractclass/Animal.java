package cn.hanxu.oop.abstractclass;
/*
 * 继承
 * 
 * 
 * */
public abstract class Animal {
	public abstract void run();  //只声明，抽象方法 包含了抽象方法的类 一定是抽象类
	public static void breath(){
		System.out.println("呼吸");
	}
	

}

class Cat extends Animal {

	@Override  //注解
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("猫步小跑");
		
	}
	
}

class Dog extends Animal{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("狗跑");
		
	}
	
}
	
	
	
	
	