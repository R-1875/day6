package errorhandling;

public class ExceptionExample {

	//public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		public static void main(String[] args){
		
		System.out.println("good morning");
		
		
		
		//Thread.currentThread().sleep(2000);
		
		try {
			Thread.currentThread().sleep(2000);
			
			
			
			Thread.currentThread().interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("good evening");

	}

}
