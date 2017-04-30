package cn.hanxu.oop;

public class TestOverload02 {

	public static void main(String[] args){
	     myMath c =new myMath();
		 int sum = c.add(3,4);
		 System.out.println(sum);
		 int sum2 = c.add3(3,4,5);
		 System.out.println(sum2);
		 
		 
	}
}


class myMath{

public int add(int a, int b){
	return a+b;
}

public int add3(int a,int b ,int c){
	return a+ b + c;
}


}