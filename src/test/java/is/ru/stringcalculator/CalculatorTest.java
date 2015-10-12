package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    }

	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoNumbers() {
		assertEquals(3, Calculator.add("1,2"));
	}	

	@Test
    public void testMultipleNumbers(){
    	assertEquals(6, Calculator.add("1,2,3"));
    }
	
	@Test
    public void testMultipleNumbersWithCharacters(){
    	assertEquals(4, Calculator.add("1,b,3"));
    }
	
	@Test
    public void testNewline(){
    	assertEquals(6, Calculator.add("1\n2,3"));
    }
	@Test
    public void testNegative(){
		try{
			Calculator.add("-1,2");
		}catch(Exception e){
			assertEquals("Negatives not allowed: -4,-5", e.getMessage());
		}
		try{
			Calculator.add("2,-4,3,-5");
		}catch(Exception e){
			assertEquals("Negatives not allowed: -4,-5", e.getMessage());
		}
    }
	@Test
    public void testDelimiter(){
    	assertEquals(3, Calculator.add("//;\n1;2"));
    }
	@Test
    public void testToBigNumber(){
    	assertEquals(2, Calculator.add("1001,2"));
    }
	@Test
    public void testDelimiterAnyLength(){
    	assertEquals(6, Calculator.add("//[***]\n1***2***3"));
    }
	@Test
    public void testMultipleDelimiter(){
    	assertEquals(6, Calculator.add("//[*][%]\n1*2%3"));
    }
	@Test
    public void testMultipleDelimiterAnyLength(){
    	assertEquals(6, Calculator.add("//[***][%%%]\n1***2%%%3"));
    }
		@Test
    public void testMultipleDelimiterAnyLength2(){
    	assertEquals(8, Calculator.add("//[***][%%%][###]\n1***2***3###2"));
    }
}