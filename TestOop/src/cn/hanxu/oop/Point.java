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

public class Point {
	int x,y,z;
	double x_input,y_input,z_input;
// ͨ�����췽����ʼ�����������	
	public Point(int _x,int _y,int _z){
		x = _x;
		y = _y;
		z = _z;		
	}
//��������
	public void setPosition(){
		Scanner s = new Scanner(System.in);
		System.out.println("������X��ֵ");
		x_input=s.nextDouble();
		System.out.println("������Y��ֵ");
		y_input=s.nextDouble();
		System.out.println("������Z��ֵ");
		z_input=s.nextDouble();
		
		System.out.println("���������Ϊ"+"("+x_input+","+y_input+","+z_input+")");
		
		
	}
	//������������ƽ��
	public void calDistance(Point p1,Point p2){
		double distance = (p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p1.y-p2.y)+(p1.z-p2.z)*(p1.z-p2.z);
		System.out.println("("+p1.x+","+p1.y+","+p1.z+")��("+p2.x+","+p2.y+","+p2.z+")"+"����֮������ƽ����Ϊ"+distance);
		
	}
	public static void main(String[] args){
		
		Point p = new Point(1,2,3);
		System.out.println("�����ж������ɵ�����Ϊ"+"("+p.x+","+p.y+","+p.z+")");
		Point q = new Point(2,3,4);
		q.setPosition();
	    Point p11 = new Point(2,3,4);
	    Point p12 = new Point(3,4,5);		
	    q.calDistance(p11,p12);
		
	}

}
