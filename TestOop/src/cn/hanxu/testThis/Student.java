package cn.hanxu.testThis;

public class Student {
	String name;
	int id;
	
	public Student(String name,int id){
		this();//����λ�ڵ�һ��ͨ��this���������������췽��
		this.name = name;
		this.id = id ;
	}
	
	public Student(){
		System.out.println("����һ������");
	}
	
	public void setName(String name){
		this.name  = name;
	}
	
	//��̬�����ﲻ��ʹ�÷Ǿ�̬����
	public void study(){//static ������û�ж�������this
		this.name = "����";//��ǰ���������
		System.out.println(this);
	}
	

}
