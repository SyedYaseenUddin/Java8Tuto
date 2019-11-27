/**
 * 
 */
package javaPractices.lambdaexpressions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Syed Yaseen Uddin
 *
 */
public class LE001 {
	private Comparator<String> nameSort = null;
	private Comparator<String> nameRevSort = null;
	private List<String> list = null;
	private String[] elements; 

	public LE001(final String... elements) {
		this.elements = elements;
		this.list = Arrays.asList(this.elements);
		this.nameSort = (p1, p2) -> p1.compareTo(p2); // compare method is used
														// under lambda
														// expression.
		
		this.nameRevSort = (p1, p2) -> p2.compareTo(p1); // compare method is used under lambda  expression.
		
	}

	private void message(int num) {
		for (int i = 0; i <= this.list.size(); i++) {
			if (num == 1) {
			this.list.sort(this.nameRevSort);
			} else {
			this.list.sort(this.nameSort);
			}
			final String value = Arrays.stream(this.elements).collect(Collectors.joining());
			System.out.println(num + ": < - > :" + value);
		}
	}

	public void threadSort() {
		Thread t1 = new Thread(() -> this.message(1));
		Thread t2 = new Thread(() -> this.message(2));
		t1.start();
		t2.start();
		
	}

	public void normalSort() {
		System.out.println("Before Sorting...");
		this.list.forEach(ele -> System.out.print(ele + "\t")); // Consumer
																// interface's
																// accept method
																// is used under
																// lambda
																// expression.
		this.list.sort(this.nameSort);
		System.out.println("\nAfter Sorting...");
		this.list.forEach(ele -> System.out.print(ele + "\t")); // Consumer
																// interface's
																// accept method
																// is used under
																// lambda
																// expression.
		System.out.println("\n");
	}
}
