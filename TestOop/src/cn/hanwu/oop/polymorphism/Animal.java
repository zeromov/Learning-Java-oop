package cn.hanwu.oop.polymorphism;

public class Animal {
	String str;
	public void voice(){
		
		System.out.println("��ͨ�������");
	}


}

class Cat extends Animal{

   public void voice(){	
		System.out.println("����");
  }
}

class Dog extends Animal{

	   public void voice(){	
			System.out.println("����");
	  }
	   
	   public void seeDoor(){	
			System.out.println("����");
	  }
	   
	   
	   
	   
	}

class Pig extends Animal{

	   public void voice(){	
			System.out.println("�ߺ�");
	  }
	}


class tiger extends Animal{

	   public void voice(){	
			System.out.println("�ϻ�");
	  }
	}

