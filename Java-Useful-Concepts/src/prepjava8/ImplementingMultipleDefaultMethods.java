package prepjava8;

interface A{
	default void method1() {
		System.out.println("Method1");
	}
}

interface B{
	default void method1() {
		System.out.println("Method1");
	}
}

public class ImplementingMultipleDefaultMethods implements A,B{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//You need to provide implementtaion and overide any default method otherwise it will throw compile time exception.

}
