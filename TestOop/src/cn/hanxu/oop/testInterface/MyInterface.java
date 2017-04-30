package cn.hanxu.oop.testInterface;
/*
 * 
 * 接口
 * 
 * */
public interface MyInterface {  //定义接口
	//接口中只有常量 和 抽象方法
	/*public static final 接口中常量定义时，写或不写都是这样*/String MAX_GREAD = "BOSS";
	int MAX_SPEED = 120;
	
	public void test01();
	public int test02(int a,int b);

}
