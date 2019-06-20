import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Child extends OverridingDemo {
	final int id;
	Child(int id){
		this.id = id;
	}
 public void parentExMthod() {
	 System.out.println("child");
//	 System.out.println(ResourceBundle.getBundle("a", Locale.FRANCE));
	 
 }
 public static void main(String[] args) {
	Child obj = new Child(10);
		System.out.println(null instanceof Child);
	try {
		obj.parentExMthod();
	}
	catch(ArithmeticException e) {
		
	}
}
}
