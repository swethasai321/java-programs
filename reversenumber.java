package programreverse;


public class reversenumber {
public static void main(String[] args) {
	int number=89687,reverse=0;
	
	while(number!= 0)
	{
		int remainder = number % 10;
		reverse = reverse*10 + remainder;
		number = number/10;
		
	}
	System.out.println("The reverse value of given value is" +reverse);
}

}
