package errorhandling;


import java.util.Scanner;




public class ExceptionTest {

	//public static void main(String[] args) throws ArithematicException {
		// TODO Auto-generated method stub
	public static void main(String[] args){
		
		Scanner s=new Scanner(System.in);
		
		int numerator=10;
		int denominator=0;
		
		int quotient=0;
		
		//try{
		quotient = (numerator/denominator);
		
		
		
		//System.out.println("result"+quotient);
		
	//} //} //
		
		//catch(ArithmeticException e) { 
            //System.out.println ("enter non zero number"); 
            
            denominator=s.nextInt();
            quotient=(numerator/denominator);
            
       // } 
		
		System.out.println("result"+quotient);

	}

}
