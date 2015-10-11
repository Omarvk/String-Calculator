Public class Calcus{
	private int sum;
	Public int add(String numbers){
		
		if(numbers.equals("")){
			return sum;
		}
		
		return fixstring(numbers);
		
	};
	
	private int fixstring(String input){
		input = input.replace("\\n" , ",");
		String[] numbers = input.split(",");
		int i = 0;
		
		while(i != numbers.length){
			isNumber(number[i].trim()){
				sum += Integer.parseInt(numbers[i].trim());
			}
			i++;
		}
		return sum;
	}
	
	private  Boolean isNumber(String numbers){
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