package point.of.sale;

public class StrangeMath {
	
	public static Double strangeFunction(Double value1, Double value2) {
		
		if (value1 > value2) {
			return Double.NaN; 
		}
		
		if (value1 < 0 || value2 < 0) {
			return Double.NaN;
		}
			
		Double value3 = (value1/value2)*100; 
		
		if (value3 < 25) {
			return value3 + 10;
		}
		
		return value3;
	}
}

