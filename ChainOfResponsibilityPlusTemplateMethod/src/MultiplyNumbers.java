
public class MultiplyNumbers extends MathCalculationsTemplate {

	@Override
	public void doCalculations() {
		if (operator.equals("*")) { 
			result = firstNumber * secondNumber;
		}
		if(nextChain!= null) {
			nextChain.calculate(request);
		}
	}

}
