package basiccodingproblems;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str    = "malayalam";
       String revStr = "";
       System.out.println("Is the string blank ? -> "+revStr.isBlank());
       for(int i = str.length()-1;i>=0;i--) 
    	   revStr = revStr + str.charAt(i);
       System.out.println(" Reverse of "+str+" is = "+revStr);   
       if(revStr.equals(str))
    	  System.out.println("Entered String are palindrome");
       
	}

}
