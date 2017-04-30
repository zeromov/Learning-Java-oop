package cn.hanwu.oop.polymorphism;

public class Animal {
	String str;
	public void voice(){
		
		System.out.println("普通动物叫声");
	}


}

class Cat extends Animal{

   public void voice(){	
		System.out.println("喵喵");
  }
}

class Dog extends Animal{

	   public void voice(){	
			System.out.println("汪汪");
	  }
	   
	   public void seeDoor(){	
			System.out.println("看门");
	  }
	   
	   
	   
	   
	}

class Pig extends Animal{

	   public void voice(){	
			System.out.println("哼哼");
	  }
	}


class tiger extends Animal{

	   public void voice(){	
			System.out.println("老虎");
	  }
	}

