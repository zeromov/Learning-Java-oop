package cn.hanxu.oop.testFinal;

public /*final*/ class Animal { // final��������˵�� ����಻�ܱ��̳�
	String eye;
	
	public /*final*/void run(){ //final �ӵ�����ǰ�治���������࣬���ܱ�������д
		System.out.println("����");
	}
	
	
}


class Mammal extends Animal{
	public void viviparity(){
		System.out.println("����̥��");
	}
}

class Bird extends Animal{
	public void run(){
		super.run();
		System.out.println("����һֻСССС��");
		
	}
	
}