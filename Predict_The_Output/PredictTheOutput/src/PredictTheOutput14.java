
public class PredictTheOutput14 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		long x          = -129;
        Long longValue  = Long.valueOf(x);
        Long longValue1 = Long.valueOf(x);
        if(longValue == longValue1)
        	System.out.println("Both are same Objects");
        else
        	System.out.println("Both Objects are Different");
	}

}
