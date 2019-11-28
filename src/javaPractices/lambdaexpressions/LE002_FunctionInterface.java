/**
 * 
 */
package javaPractices.lambdaexpressions;

/**
 * @author Syed Yaseen Uddin
 *
 */
public class LE002_FunctionInterface {
	
	public Arthmetic2Value add = (a,b) ->  a + b;
	public Arthmetic2Value sub = (a,b) ->  a - b;
	public Arthmetic2Value mul = (a,b) ->  a * b;
	public Arthmetic2Value div = (a,b) ->  a / b;
}
