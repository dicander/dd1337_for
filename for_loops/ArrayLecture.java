package lecture;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLecture {
	/**
	 * Runs some example codes for Arrays.
	 */
	public static void arrayListExample() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for( int i = 0; i < 10; ++i ) {
			numbers.add(i);
		}
		for(int i = 0; i < numbers.size() ; ++i) {
			System.out.println(numbers.get(i));
		}
		Iterator it = numbers.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

	/**
	 * Some simple examples of arrays in java.
	 */
	public static void simpleFor() {
		int[] primes = {2,3,5,7,11,13,17,19};
		int sum = 0; //Ska någonting ut. Deklarera OCH initialisera
		myLoop: for(int i=0; i<primes.length; ++i) {
			sum = 0;
			if(primes[i] == 13) {
				System.out.println("I will not print the number: ");
			}
			System.out.println(primes[i]);
			sum+=primes[i];
		}
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		//for(String argument: args) {
		//	System.out.println(argument);
		//}
		simpleFor();
		//arrayListExample();
	}
	//public static void main(String[] args) {
	//	simpleFor();
		//arrayListExample();
	//}
}
