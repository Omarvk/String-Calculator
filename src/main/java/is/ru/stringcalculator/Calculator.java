package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		try{
			negative(splitNumbers(text));
		}catch(Exception e){
	
		}
		if(text.equals("")){
			return 0;
		}else if(text.contains("//") && text.contains("\n")){
			return delimiter(text);
		}else if (text.contains("\n")){
			return newline(text);
		}
		else if(text.contains(",")){
			return sum(splitNumbers(text));
		}
		else
			return toInt(text);
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers){
	    return numbers.split(",");
	}
      
    private static int sum(String[] numbers){
 	    int total = 0;
        for(String number : numbers){
			if(isNumber(number)){
				if(toBignumber(number)){
					total += toInt(number);
				}
			}
		}
		return total;
    }
	private static boolean toBignumber(String number){
		if(toInt(number) > 1000){
			return false;
		}
		return true;
	}
	private static int delimiter(String numbers){
		String delimiter = "";
		if(numbers.contains("[") && numbers.contains("]")){
			delimiter = Character.toString(numbers.charAt(3)).trim();
		}else{
			delimiter = Character.toString(numbers.charAt(2)).trim();
		}
		
		numbers = numbers.replace(delimiter, ",");
		return newline(numbers);
	}
	private static int newline(String numbers){
		numbers = numbers.replace("\n" , ",");
		return sum(splitNumbers(numbers));
	}
	private static void negative(String[] numbers) throws Exception{
		String negative = "";
	     for(String number : numbers){
				if(isNumber(number)){
					if(toInt(number) < 0){
						negative += number+",";
					}
				}
		}
		if(!negative.equals("")){
			throw new Exception("Negatives not allowed: "+negative);
		}
	}
	private static Boolean isNumber(String numbers){
		try
		{
			int number = Integer.parseInt(numbers);
		}
		catch(NumberFormatException villa)
		{
			return false;
		}
		return true;
	}



}