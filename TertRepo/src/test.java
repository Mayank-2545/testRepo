// This is abstract class
abstract class B{
	abstract void showAllInfo();
	abstract void showAllConfigs();
}
//This is Interface class
interface C{
	public void showDetails();
	public void viewDetails();
}
//In this class Both above classes are implemented
class A extends B implements C {
	static int rollno = 1213045;
	static String name="Code Bashers";
	
	static int add(int a , int b) {
		return a +b;
	}
	
	static int add(int a , int b , int c) {
		return a +b+c;	
	}
	
	@Override
	void showAllInfo() {
		System.out.println("This is ShowAllInfo Method");
	}

	@Override
	void showAllConfigs() {
		System.out.println("This is ShowAllConfigs Method");
	}	
	
	@Override
	public void showDetails() {
		System.out.println("This is showDetails Method");
	}
	@Override
	public void viewDetails() {
		System.out.println("This is viewDetails Method");
	}
	
}

public class test{
	public static void main(String[] args) {
		//Object creation
		A a = new A();
		System.out.println("Hello World ");
		System.out.println(A.rollno);
		System.out.println(A.name);
		System.out.println(A.add(10,20));
		System.out.println(A.add(10, 20, 30));
		a.showAllInfo();
		a.showAllConfigs();
		a.showDetails();
		a.viewDetails();
	}
}

