package cn.hanxu.oop;
import java.util.Scanner;
/*
 * public class confuseTestPoint {
	public class Point{
		int x,y,z;		
	}
 * �ܽ᣺�ڲ����Ƕ�̬��    ��ͷ�� public class��ͷ����������public static class main ����Java�У����еľ�̬��������ֱ�ӵ��ö�̬������ֻ�н�ĳ���ڲ�������Ϊ��̬�࣬Ȼ������ھ�̬���е��ø���ĳ�Ա�������Ա�����������ڲ��������䶯������£���򵥵Ľ���������ǽ�public
class ��Ϊpublic static class
*/
public class confuseTestPoint {
	public static class Point{
		int x,y,z;		
	}
	
	public static void main(String[] args){
	    Scanner s = new Scanner(System.in);
		Point p = new Point();
		System.out.println("������x");
		 p.x = s.nextInt();
		System.out.println("������y");
		 p.y = s.nextInt();
		System.out.println("������z");
		 p.z = s.nextInt();
	
		System.out.println("���ɵ�����Ϊ"+"("+p.x+","+p.y+","+p.z+")");
	}

}
