package cn.hanxu.oop.testFinal;

public /*final*/ class Animal { // final修饰类则说明 这个类不能被继承
	String eye;
	
	public /*final*/void run(){ //final 加到方法前面不能用于子类，不能被子类重写
		System.out.println("跑跑");
	}
	
	
}


class Mammal extends Animal{
	public void viviparity(){
		System.out.println("我是胎生");
	}
}

class Bird extends Animal{
	public void run(){
		super.run();
		System.out.println("我是一只小小小小鸟");
		
	}
	
}