package cn.hanxu.oop.encapsulation01;

public class test01 {
	private String str;
	public/*private*/ void print(){  //public protected 
		String str;
		System.out.println("test01.print()");
	}
	

}

class test001 extends test01 {
	public void pp(){
		super.print();
	}
}
