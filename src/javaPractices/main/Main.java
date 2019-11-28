/**
 * 
 */
package javaPractices.main;

import javaPractices.lambdaexpressions.LE001;
import javaPractices.lambdaexpressions.LE002_FunctionInterface;

/**
 * @author Syed Yaseen Uddin
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("--**Lambda Expression**--");
		final LE001 le001 = new LE001("Y","A","S","E","E", "N");
		le001.threadSort();
		
		System.out.println("--Functional Interface--");
		LE002_FunctionInterface le2 = new LE002_FunctionInterface();
		System.out.println("Addtion : " + le2.add.operation(5, 10));
		System.out.println("Subtraction : " + le2.sub.operation(5, 10));
		System.out.println("Multiplication : " + le2.mul.operation(5, 10));
		System.out.println("Division : " + le2.div.operation(5, 10));

	}

}
