package cn.hanxu.oop;
/**
 * 测试面向对象
 * @author Hanxu
 * 
 */
public class Student {  //学生类

	//静态的数据
	String name;
	int id; //学号
	int age;
	String gender;
	int weight;
	
	Computer computer;
	
	//动态的行为
	public void study(){
		System.out.println(name+"在学习");
	}
	public void sayHello(String sname){
		System.out.println(name+"向"+sname+"说：你好");
	}

}

/*name
 * id
 * age
 * gender
 * weight
 * study（）
 * sayHello（）
 */
