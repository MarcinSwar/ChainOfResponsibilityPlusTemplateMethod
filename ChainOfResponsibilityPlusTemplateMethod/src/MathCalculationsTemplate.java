
public abstract class MathCalculationsTemplate {
	
	MathCalculationsTemplate nextChain;
	Numbers request;
	int firstNumber;
	int secondNumber;
	String operator;
	Integer result;
	
	public void setNextChain(MathCalculationsTemplate nextChain) {
		this.nextChain = nextChain;
	}
	
	public final void calculate(Numbers request) {
		this.request = request;
		takeFirstNumber(request);
		takeSecondNumber(request);
		takeOperator(request);
		doCalculations();
		presentResult();
	}
	
	private void takeFirstNumber(Numbers request) {
		firstNumber = request.getNumberOne();
	}
	
	private void takeSecondNumber(Numbers request) {
		secondNumber = request.getNumberTwo();
	}
	
	private void takeOperator(Numbers request) {
		operator = request.getCalculationWanted();
	}
	
	public abstract void doCalculations();
	
	private void presentResult() {
		if (result!= null) System.out.println(firstNumber + " " + operator +" " + secondNumber + " = " + result );
		result = null;
//		if (operator.equals("+")) result = firstNumber + secondNumber;
//		else if (operator.equals("-")) result = firstNumber - secondNumber;
//		else if (operator.equals("*")) result = firstNumber * secondNumber;
//		else if (operator.equals("/")) result = firstNumber / secondNumber;
//		else if (nextChain == null) System.out.println("Applies only for +, -, /, *");
	}
	
	

}
