import java.security.AlgorithmParameterGenerator;

import org.omg.CORBA.PUBLIC_MEMBER;


public class test2 {
	String name;
	String sex;
	int age;
	
	public String eat(String food){
		return "���ڳ�"+food;		
	}
	
	public void tea(){
		System.out.println("���ںȲ�...");
	}	
	
	public static void main(String[] args){
		
		String str = new test2().eat("ƻ��");
		System.out.println(str);
		new test2().tea();
	
	}	
}
