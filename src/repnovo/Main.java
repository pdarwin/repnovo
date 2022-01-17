package repnovo;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!!!!!");

		System.out.println(soma(1, 1));
		System.out.println(multiply(3, 3));
		System.out.println(operacaoComplexa (3,3));
	}

	public static int soma(int aNum1, int aNum2) {
		return aNum1 + aNum2;
	}

	public static int sub(int aNum1, int aNum2) {
		return aNum1 - aNum2;
	}

	public static int multiply(int int1, int int2) {
		int a = int1 * int2;
		return a;

	}
	
	
	public static int operacaoComplexa (int aNum1, int aNum2)
	{
		return soma (multiply (aNum1, aNum2), sub (aNum1, aNum2));
	}
	
	public static int operacaoComplexa1 (int aNum1, int aNum2) {
		int result = soma(aNum1, aNum2) * sub(aNum1, aNum2);
		System.out.println(result);
		return result;
	}

}
