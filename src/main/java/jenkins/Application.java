package jenkins;
import org.joda.time.DateTime;

/**
 * My main class.
 * @author kevin-pc.
 */
public final class Application {

	private Application() {
		super();
	}
	
	/**
	 * Entry point of application.
	 * @param args argument from CLI.
	 */
	public static void main(String[] args) {
		System.out.println("Hello world");
		final DateTime date =  new DateTime().now();
		System.out.println(date);
	}
	
	/**
	 * Resolve addition.
	 * @param firstValue first integer.
	 * @param secondValue second integer.
	 * @return result of addition.
	 */
	public static int add(int firstValue, int secondValue) {
		return firstValue + secondValue;
	}
}