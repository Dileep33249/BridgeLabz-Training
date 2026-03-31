package annotation;
class LegacyAPI{
	@Deprecated
	void oldMethod() {
		System.out.println("old Feature");
	}
	void newFeature() {
		System.out.print("New feature");
	}
}
public class DeprecatedUse {
   
	public static void main(String [] args) {
		 LegacyAPI obj =new LegacyAPI();
	obj.oldMethod();
	obj.newFeature();
	}
}
