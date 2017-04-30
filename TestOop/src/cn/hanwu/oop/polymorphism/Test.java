package cn.hanwu.oop.polymorphism;

public class Test {
	
	
	
	/*
	public static void testAnimalVoice(Cat c){
		c.voice();
	}
	
	
	
	public static void testAnimalVoice(Dog c){
		c.voice();
	}
	
	public static void testAnimalVoice(Pig c){
		c.voice();
	}
	*/
	
	public static void testAnimalVoice(Animal c){
		c.voice();   //类中加其他动物
		if(c instanceof Dog){
			((Dog)c).seeDoor();
		}
	}
	
	public static void main(String[] args){
		Cat c = new Cat();//运行时类型  由运行时具体情况决定
        Animal a = new Pig();
        Animal b = new Dog();
        Animal d = new tiger();
		testAnimalVoice(c);
		testAnimalVoice(b);
		testAnimalVoice(a);
		testAnimalVoice(d);
		
    // 	b.seeDoor();//编译器只认main 里面的类型
		Dog b1 = (Dog)b;//只能转同类型
		b1.seeDoor();
	}

}
