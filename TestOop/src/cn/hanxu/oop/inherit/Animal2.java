package cn.hanxu.oop.inherit;
/*
 * 
 * �������
 * 
 * */
public class Animal2 {
	
		
		String eye;
		
		public void run(){
			System.out.println("���ܣ�");
		}
		
		public void eat(){
			System.out.println("�Գ�");
		}
		
		public Animal2(){
			super();
			System.out.println("��һ�������");
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
			System.out.println("̥��");
		}
		
		
		}


	

	class bird2{
		Animal2 animal2 = new Animal2();
		
		public void run(){ //��Ҫ��д
			animal2.run();
			System.out.println("�ɰ���");//���า�Ǹ���
		}
		
		public void eat(){
			System.out.println("�Թ���");
		}
		
		public void oviparity(){
			System.out.println("����");
			
			
			}
		//public bird2(){
		//	super();
			//System.out.println("��һ�������");
		//}
	}


	



