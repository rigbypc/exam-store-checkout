package point.of.sale.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import point.of.sale.StrangeMath;

import java.util.concurrent.ThreadLocalRandom;

class StrangeMathTest {

		@Test
		void basicTest() {
			
			Double random = ThreadLocalRandom.current().nextDouble(0, 101);
			
			assertEquals((random/100)*100, StrangeMath.strangeFunction(random, 100.0), 0.001);
		}
}