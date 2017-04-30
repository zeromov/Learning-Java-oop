package cn.hanxu.oop;
import java.util.Scanner;
/*
 * public class confuseTestPoint {
	public class Point{
		int x,y,z;		
	}
 * 总结：内部类是动态的    开头以 public class开头，主程序是public static class main ，在Java中，类中的静态方法不能直接调用动态方法，只有将某个内部类修饰为静态类，然后才能在静态类中调用该类的成员变量与成员方法。所以在不做其他变动的情况下，最简单的解决方法就是将public
class 改为public static class
*/
public class confuseTestPoint {
	public static class Point{
		int x,y,z;		
	}
	
	public static void main(String[] args){
	    Scanner s = new Scanner(System.in);
		Point p = new Point();
		System.out.println("请输入x");
		 p.x = s.nextInt();
		System.out.println("请输入y");
		 p.y = s.nextInt();
		System.out.println("请输入z");
		 p.z = s.nextInt();
	
		System.out.println("生成的坐标为"+"("+p.x+","+p.y+","+p.z+")");
	}

}
