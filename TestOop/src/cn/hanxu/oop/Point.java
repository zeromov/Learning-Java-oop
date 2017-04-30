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

public class Point {
	int x,y,z;
	double x_input,y_input,z_input;
// 通过构造方法初始化对象的属性	
	public Point(int _x,int _y,int _z){
		x = _x;
		y = _y;
		z = _z;		
	}
//设置坐标
	public void setPosition(){
		Scanner s = new Scanner(System.in);
		System.out.println("请输入X的值");
		x_input=s.nextDouble();
		System.out.println("请输入Y的值");
		y_input=s.nextDouble();
		System.out.println("请输入Z的值");
		z_input=s.nextDouble();
		
		System.out.println("输入的坐标为"+"("+x_input+","+y_input+","+z_input+")");
		
		
	}
	//计算两点距离的平方
	public void calDistance(Point p1,Point p2){
		double distance = (p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p1.y-p2.y)+(p1.z-p2.z)*(p1.z-p2.z);
		System.out.println("("+p1.x+","+p1.y+","+p1.z+")和("+p2.x+","+p2.y+","+p2.z+")"+"两点之间距离的平方和为"+distance);
		
	}
	public static void main(String[] args){
		
		Point p = new Point(1,2,3);
		System.out.println("程序中定义生成的坐标为"+"("+p.x+","+p.y+","+p.z+")");
		Point q = new Point(2,3,4);
		q.setPosition();
	    Point p11 = new Point(2,3,4);
	    Point p12 = new Point(3,4,5);		
	    q.calDistance(p11,p12);
		
	}

}
