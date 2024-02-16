
public class PredictTheOutput13{

    int speed;
    
    public PredictTheOutput13() {
    	this.speed = 120;
    	System.exit(2);
    }
    public PredictTheOutput13(int speed) {
    	this();
    	this.speed = speed;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PredictTheOutput13 pto = new PredictTheOutput13(100);
		System.out.println(pto.speed);
	}

}
