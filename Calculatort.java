Public class Calcus{

	Public int add(String numbers){
		
		if(numbers.equals("")){
			return 0;;
		}
		try {
			return fixstring(numbers);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return 0;
		
	};
	
	private int fixstring(String input){

		int sum = 0;
		String negative = "";
		if(input.contains("//") && input.contains("\\n")){
			String delimiter = Character.toString(input.charAt(2)).trim();
			input = input.replace(delimiter, ",");
		}
		input = input.replace("\\n" , ",");
		String[] numbers = input.split(",");
		int i = 0;
		while(i != numbers.length){
			isNumber(number[i].trim()){
				if(Integer.parseInt(numbers[i]) < 0){
					negative += numbers[i]+",";
				}else{
					sum += Integer.parseInt(numbers[i].trim());
				}
			}
			i++;
		}
		if(!negative.equals("")){
			throw new Exception("Negatives not allowed: "+negative);
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