package repnovo;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Hello World!!!!!");
		
		System.out.println(soma (1,1));
		System.out.println(mult (3,3));
	}
	
	public static int soma (int aNum1, int aNum2)
	{
		return aNum1 + aNum2;
	}

	public static int sub (int aNum1, int aNum2)
	{
		return aNum1 - aNum2;
	}
	
	public static int mult (int aNum1, int aNum2)
	{
		return aNum1 * aNum2;
	}
	
}
