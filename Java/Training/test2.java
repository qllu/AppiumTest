import java.security.AlgorithmParameterGenerator;

import org.omg.CORBA.PUBLIC_MEMBER;


public class test2 {
	String name;
	String sex;
	int age;
	
	public String eat(String food){
		return "我在吃"+food;		
	}
	
	public void tea(){
		System.out.println("我在喝茶...");
	}	
	
	public static void main(String[] args){
		
		String str = new test2().eat("苹果");
		System.out.println(str);
		new test2().tea();
	
	}	
}
