
public class Main {

	public static void main(String[] args) {
		MathCalculationsTemplate chain1 = new AddNumbers();
		MathCalculationsTemplate chain2 = new SubtractNumbers();
		MathCalculationsTemplate chain3 = new MultiplyNumbers();
		MathCalculationsTemplate chain4 = new DivideNumbers();
		
		chain1.setNextChain(chain2);
		chain2.setNextChain(chain3);
		chain3.setNextChain(chain4);
		
		Numbers request = new Numbers(10, 5, "/");
		Numbers request1 = new Numbers(10, 5, "*");
		Numbers request2 = new Numbers(10, 5, "+");
		Numbers request3 = new Numbers(10, 5, "-");
		Numbers request4 = new Numbers(10, 5, "m");
		
		chain1.calculate(request);
		chain1.calculate(request1);
		chain1.calculate(request2);
		chain1.calculate(request3);
		chain1.calculate(request4);


	}

}
