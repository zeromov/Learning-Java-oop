package cn.hanxu.oop;
import java.util.Scanner;
/**
 * ����һ����()point ���û�����ʾ��ά�ռ��еĵ㣨����������
 * Ҫ�� ����
 * �������ɾ����ض�����ĵ����
 * �ṩ����������������ķ���
 * �ṩ���Լ���õ����������ƽ���ķ��� 
 * 
 * @author Hanxu
 *
 */
//����  ��TestPoint�ĳɽṹ�����ͣ�ʹ�ô�����p.x���ܸ�ֵ��������why?
public class TestPoint {

    int x,y,z;
	
	/*
	public  TestPoint(double x,double y,double z){
		System.out.println("���ɵ�����Ϊ"+"("+x+","+y+","+z+")");
	}
	*/
	
	public static void main(String[] args){
	    Scanner s = new Scanner(System.in);
		//TestPoint p = new TestPoint();
		System.out.println("������x");
		int x = s.nextInt();
		System.out.println("������y");
		int y = s.nextInt();
		System.out.println("������z");
		int z = s.nextInt();
	
		System.out.println("���ɵ�����Ϊ"+"("+x+","+y+","+z+")");
		
		
	}
	

	
}
