package exercises.beginner.operators;

public class Results {

	public int physicsScore;
	public int chemistryScore;
	public int biologyScore;
	
	public int totalScore = physicsScore+chemistryScore+biologyScore;
	public int percentage = (int) Math.round(totalScore/4.5);
	
	public void displayResults() {
		printHeader();
		
		System.out.println("Physics: " + physicsScore);
		System.out.println("Chemistry: " + chemistryScore);
		System.out.println("Biology: " + biologyScore);
		
		System.out.println("\nTotal Score: " + totalScore +"/450");
		System.out.println(displayPercentage());
	}
	
	/**
	 * Returns the total score of all exams as a percentage from 1 to 100.
	 * 
	 * @return String
	 */
	public String displayPercentage() {
		return percentage + "%";
	}
	
	private static void printHeader() {
		String header = "\n# EXAM SCORES #\n";
		String breaker = "#".repeat(header.length());
		System.out.println(breaker + header + breaker);
	}
}
