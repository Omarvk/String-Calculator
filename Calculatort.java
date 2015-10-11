Public class Calcus{
	private int sum;
	Public int add(String numbers){
		
		if(numbers.equals("")){
			return sum;
		}
		numbers = numbers.replace("," , ".");
		
		return (int)(sum += Double.parseDouble(numbers));
		
	};
}