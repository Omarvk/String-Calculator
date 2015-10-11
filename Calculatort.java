Public class Calcus{
	private int sum;
	Public int add(String numbers){
		
		if(numbers.equals("")){
			return sum;
		}
		sum += Integer.parseInt(numbers);
		return sum;
	};
}