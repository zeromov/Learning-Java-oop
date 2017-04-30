package cn.hanxu.oop.callback;

import java.awt.Frame;

public class PaintFrame {
	public static void drawFrame(MyFrame f){
		System.out.println("�����߳�");
		System.out.println("����ѭ��");
		System.out.println("�鿴��Ϣջ");
		
		
		//������
		f.paint();//ÿ�λ����ڷ�ʽ����һ��
		
		
		System.out.println("�������棬����Ч��");
	}

	public static void main(String[] args){
		drawFrame(new GameFrame01());
	}
	
	
}


class GameFrame01 extends MyFrame{
	public void paint(){
		System.out.println("GameFrame01.paint()");
		System.out.println("������");
	}
}

class GameFrame02 extends MyFrame{
	public void paint(){
		System.out.println("GameFrame02.paint()");
		System.out.println("������");
	}
}