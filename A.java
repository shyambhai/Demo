interface inter{
	 void m1();
}
class Test implements inter{
	public void m1(){
	System.out.println("A method is called ...");
	}
}

public class A{
	public static void main(String args[]){
	
	Test t = new Test();
	t.m1();	
	}
}