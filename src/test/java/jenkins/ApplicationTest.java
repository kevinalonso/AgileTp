package jenkins;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;

public class ApplicationTest {
	
	@Test
	public void testAdd() {
		int i = 1;
		int j = 2;
		
		int k = Application.add(i,j);
		
		Assert.assertEquals("Add not good",k,3);
		
	}
}
