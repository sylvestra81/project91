package sly.com;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class App3Test {
	
	@Test
	
	public void testAddition() {
        App3 calculator = new App3();
        int result = calculator.add(2, 3);
        assertEquals(result, 5, "Expected result is 5");

	}

}
