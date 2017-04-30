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
		c.voice();   //���м���������
		if(c instanceof Dog){
			((Dog)c).seeDoor();
		}
	}
	
	public static void main(String[] args){
		Cat c = new Cat();//����ʱ����  ������ʱ�����������
        Animal a = new Pig();
        Animal b = new Dog();
        Animal d = new tiger();
		testAnimalVoice(c);
		testAnimalVoice(b);
		testAnimalVoice(a);
		testAnimalVoice(d);
		
    // 	b.seeDoor();//������ֻ��main ���������
		Dog b1 = (Dog)b;//ֻ��תͬ����
		b1.seeDoor();
	}

}
