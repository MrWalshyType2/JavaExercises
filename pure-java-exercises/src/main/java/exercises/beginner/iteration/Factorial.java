package exercises.beginner.iteration;

public class Factorial {

	public static void main(String[] args) {
		Factorial f = new Factorial();
		System.out.println(f.factorialOf(4)); // 24
		System.out.println(f.factorialOf(5)); // 120
		System.out.println(f.factorialOf(7)); // 5040
		System.out.println(f.factorialOf(13)); // 6227020800
	}
		
	public int factorialOf(int num) {
		throw new RuntimeException("Implement me");
	}

}
