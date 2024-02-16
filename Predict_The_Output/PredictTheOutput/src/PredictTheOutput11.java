
interface C{
	
	default void m1() {
		System.out.println("Interace A default method");
	}
	
}

interface D{
	
	default void m1() {
		System.out.println("Interface B default method");
	}
	
}

public class PredictTheOutput11 implements C,D{

	@Override
	public void m1() {
		
	}

}
