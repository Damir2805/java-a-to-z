package dkalymbaev;

/**
* Realise a calculator.
* Supports additional calculation of the previous result.
*/


public class Calculator {
	/**
	*This variable stores the result of the calculation.
	*/
	private double result;
	/**
	*This method calculates the sum of the two arguments.
	*@param first It is first argument.
	*@param second It is second argument.
	*/
	public void add(double first, double second) {
		this.result = first + second;
	}
	/**
	*This method calculates the division of the two arguments.
	*@param first It is first argument.
	*@param second It is second argument.
	*/
	public void div(double first, double second) {
		if (second != 0) {
			this.result = first / second;
		} else {
			throw new ArithmeticException("Could not divide by 0");
		}
	}
	/**
	*This method calculates the multiplication of the two arguments.
	*@param first It is first argument.
	*@param second It is second argument.
	*/
	public void multiple(double first, double second) {
		this.result = first * second;
	}
	/**
	*This method calculates the substractions of the two arguments.
	*@param first It is first argument.
	*@param second It is second argument.
	*/
	public void substract(double first, double second) {
		this.result = first - second;
	}
	/**
	*This method calculates the expand of the two arguments.
	*@param first It is first argument.
	*@param second It is second argument.
	*/
	public void expand(double first, int second) {
		double temp = first;
		for (int index = 0; index != second; ++index) {
			temp = first;
			this.result = temp;
		}
	}
	/**
	*This method returns the result.
	*@return Return of result.
	*/
	public double getResult() {
		return this.result;
	}
}