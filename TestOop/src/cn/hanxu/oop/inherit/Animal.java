package cn.hanxu.oop.inherit;
/*
 * 
 * 
 * ���Լ̳�
 * */
public class Animal {
	String eye;
	
	public void run(){
		System.out.println("���ܣ�");
	}
	
	public void eat(){
		System.out.println("�Գ�");
	}
	
	public Animal(){
		super();
		System.out.println("��һ�������");
	}

}

class Mammal extends Animal{		
	
	
	public void viviparity(){
		this.run();
		System.out.println("̥��");
	}
	
}

class reptile{
	String eye;
	
	public void run(){
		System.out.println("���ܣ�");
	}
	
	public void eat(){
		System.out.println("�Գ�");
	}
	
	public void oviparity(){
		System.out.println("����");
	}	
	
}

class bird{
	String eye;
	
	public void run(){ //��Ҫ��д
		System.out.println("�ɰ���");//���า�Ǹ���
	}
	
	public void eat(){
		System.out.println("�Գ�");
	}
	
	public void oviparity(){
		System.out.println("����");
	}
}

class bird1 extends Animal{
	
	    public void run(){ //��Ҫ��д
		System.out.println("���Ƿɵ�bird1");//���า�Ǹ���
	    }	
}
