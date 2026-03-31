package Reflextion;
import java.lang.reflect.*;
class DemoNew{
	int a;
	public void soundMethod() {
		System.out.print("Sound method");
	}
	DemoNew(int a){
		this.a=a;
	}
	
}
public class GetClassName {
	
	public static void main(String [] args) {
	DemoNew obj = new DemoNew(10);
	Class<?> cl=obj.getClass();
	
	System.out.println("class name is:"+cl.getName());
	
	Field[] arr=cl.getDeclaredFields();
	
	for(Field f: arr) {
		System.out.println(f.getName());
	}
	Method [] methods=cl.getDeclaredMethods();
	
	for(Method m:methods) {
		System.out.print(m.getName());
	}
	}

}
