package cn.hanxu.testThis;

public class Student {
	String name;
	int id;
	
	public Student(String name,int id){
		this();//必须位于第一句通过this（）调用其他构造方法
		this.name = name;
		this.id = id ;
	}
	
	public Student(){
		System.out.println("构造一个对象");
	}
	
	public void setName(String name){
		this.name  = name;
	}
	
	//静态方法里不能使用非静态变量
	public void study(){//static 方法里没有对象不能用this
		this.name = "张三";//当前调这个对象
		System.out.println(this);
	}
	

}
