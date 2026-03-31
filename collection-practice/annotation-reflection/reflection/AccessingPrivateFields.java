package Reflextion;
class Demo{
	private int a;
	Demo(int a){
		this.a=a;
	}
}
public class AccessingPrivateFields {
    
	Demo obj=new Demo(10);
	
	Class <?> cl=obj.getClass();
	
	
}
