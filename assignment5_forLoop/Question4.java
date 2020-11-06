package assignment5_forLoop;

public class Question4 {

	public static void main(String[] args) {
		
/* Write a while loop that lets the user enter a number. 
 * The number should be multiplied by 10, and the result 
 * stored in the variable product. The loop should iterate as 
 * long as product contains a value less than 100.*/
		
		int num = 10;
		int i = 1;
		
		//for( int i=1; i<=100;i++) {
			
			//System.out.println((num*i));
			
		//}
		
		while(i<=10) {
			
		System.out.println(num + "*" + i + "= " + (num*i));	
			
		 i++;
		}

	}

}
