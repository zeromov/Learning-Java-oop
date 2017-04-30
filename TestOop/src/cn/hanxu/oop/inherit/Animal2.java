package cn.hanxu.oop.inherit;
/*
 * 
 * 测试组合
 * 
 * */
public class Animal2 {
	
		
		String eye;
		
		public void run(){
			System.out.println("跑跑！");
		}
		
		public void eat(){
			System.out.println("吃吃");
		}
		
		public Animal2(){
			super();
			System.out.println("建一个鸟对象");
		}
		public static void main(String[] args){
			bird2 b = new bird2();
			b.run();
			b.animal2.eat();
			b.eat(); 
			
		}
	}

	class Mammal2  {		
		Animal2 animal2 = new Animal2();
		
		public void viviparity(){
			//this.run();
			System.out.println("胎生");
		}
		
		
		}


	

	class bird2{
		Animal2 animal2 = new Animal2();
		
		public void run(){ //需要重写
			animal2.run();
			System.out.println("飞啊飞");//子类覆盖父类
		}
		
		public void eat(){
			System.out.println("吃谷子");
		}
		
		public void oviparity(){
			System.out.println("卵生");
			
			
			}
		//public bird2(){
		//	super();
			//System.out.println("建一个鸟对象");
		//}
	}


	



