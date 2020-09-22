package assignment3_arithmeticOperatos;

public class Question6 {

	public static void main(String[] args) {
	
/* Scientists estimate that roughly 10 grams of caffeine consumed 
   at one time is a lethal overdose.
   Write a program with a variable that holds the number of 
   milligrams of caffeine in a drink and outputs how many drinks 
   it takes to kill a person.
      Sample Output
      Number of milligrams in drink: 500
      It would take about 20 drinks for a lethal overdose*/
		
		int grams=10, milligrams, drinks;
		
		milligrams= grams*50;
		
		drinks=milligrams/25;
		
		System.out.println("Number of milligrams in drink: " + milligrams);
		
		System.out.println("It would take about " + drinks + " for a lethal overdose");

	}

}
