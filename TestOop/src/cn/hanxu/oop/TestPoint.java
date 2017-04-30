package cn.hanxu.oop;
import java.util.Scanner;
/**
 * 定义一个点()point 类用户来表示三维空间中的点（有三个坐标
 * 要求 如下
 * 可以生成具有特定坐标的点对象
 * 提供可以设置三个坐标的方法
 * 提供可以计算该点距另外点距离平方的方法 
 * 
 * @author Hanxu
 *
 */
//疑问  把TestPoint改成结构体类型，使用创建的p.x不能赋值？？？？why?
public class TestPoint {

    int x,y,z;
	
	/*
	public  TestPoint(double x,double y,double z){
		System.out.println("生成的坐标为"+"("+x+","+y+","+z+")");
	}
	*/
	
	public static void main(String[] args){
	    Scanner s = new Scanner(System.in);
		//TestPoint p = new TestPoint();
		System.out.println("请输入x");
		int x = s.nextInt();
		System.out.println("请输入y");
		int y = s.nextInt();
		System.out.println("请输入z");
		int z = s.nextInt();
	
		System.out.println("生成的坐标为"+"("+x+","+y+","+z+")");
		
		
	}
	

	
}
