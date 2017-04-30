package cn.hanxu.oop.inherit;
/*
 * 
 * 
 * 测试继承
 * */
public class Animal {
	String eye;
	
	public void run(){
		System.out.println("跑跑！");
	}
	
	public void eat(){
		System.out.println("吃吃");
	}
	
	public Animal(){
		super();
		System.out.println("建一个鸟对象");
	}

}

class Mammal extends Animal{		
	
	
	public void viviparity(){
		this.run();
		System.out.println("胎生");
	}
	
}

class reptile{
	String eye;
	
	public void run(){
		System.out.println("跑跑！");
	}
	
	public void eat(){
		System.out.println("吃吃");
	}
	
	public void oviparity(){
		System.out.println("卵生");
	}	
	
}

class bird{
	String eye;
	
	public void run(){ //需要重写
		System.out.println("飞啊飞");//子类覆盖父类
	}
	
	public void eat(){
		System.out.println("吃吃");
	}
	
	public void oviparity(){
		System.out.println("卵生");
	}
}

class bird1 extends Animal{
	
	    public void run(){ //需要重写
		System.out.println("我是飞的bird1");//子类覆盖父类
	    }	
}
