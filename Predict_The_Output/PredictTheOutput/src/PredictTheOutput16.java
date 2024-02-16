
interface Car{
	void go();
}

interface Bike {
	void go();
}

class Honda implements Car,Bike{

	public void go() {
		System.out.println("Start your vehicle");
	}
	
}

public class PredictTheOutput16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Honda honda = new Honda();
        honda.go();
	}

}
