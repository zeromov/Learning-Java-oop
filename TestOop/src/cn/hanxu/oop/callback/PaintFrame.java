package cn.hanxu.oop.callback;

import java.awt.Frame;

public class PaintFrame {
	public static void drawFrame(MyFrame f){
		System.out.println("启动线程");
		System.out.println("增加循环");
		System.out.println("查看消息栈");
		
		
		//画窗口
		f.paint();//每次画窗口方式都不一样
		
		
		System.out.println("启动缓存，增加效率");
	}

	public static void main(String[] args){
		drawFrame(new GameFrame01());
	}
	
	
}


class GameFrame01 extends MyFrame{
	public void paint(){
		System.out.println("GameFrame01.paint()");
		System.out.println("画窗口");
	}
}

class GameFrame02 extends MyFrame{
	public void paint(){
		System.out.println("GameFrame02.paint()");
		System.out.println("画窗口");
	}
}