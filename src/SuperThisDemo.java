
public class SuperThisDemo {
	public SuperThisDemo() {
		System.out.println("default constructor");
	}
	public SuperThisDemo(String obj) {
		System.out.println("string constr");
	}
	
	public SuperThisDemo(Object o) {
		System.out.println("object const");
	}
	public static void main(String[] args) {
		
		SuperThisDemo demo = new SuperThisDemo(123);
	}
}
