package jenkins;
import org.joda.time.DateTime;

/**
 * My main class.
 * @author kevin-pc.
 */
public class Application{

	/**
	 * Entry point of application.
	 * @param args argument from CLI.
	 */
	public static void main(String[] args){
		System.out.println("Hello world");
		DateTime date =  new DateTime().now();
		System.out.println(date);
	}
	
	/**
	 * Resolve addition.
	 * @param i first integer.
	 * @param j second integer.
	 * @return result of addition.
	 */
	public static int add(int i, int j) {
		return i + j;
	}
}