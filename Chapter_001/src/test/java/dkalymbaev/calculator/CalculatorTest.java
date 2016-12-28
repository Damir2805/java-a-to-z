package dkalymbaev.calculator;

import org.junit.Test;

import static java.lang.Math.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static java.lang.Math.pow;

/**
* Created by Damir Kalymbaev.
*/
public class CalculatorTest {
	/**
	* Testing a sum.
	*/
	@Test
	public void whenSumCalculated() {
		Calculator calculator = new Calculator();
		final double one = 5;
		final double two = 2;
		final double three = 7;
		calculator.add(one, two);
		double result = calculator.getResult();
		assertThat(result, is(three));
	}
	/**
	* Testing a substraction.
	*/
	@Test
	public void whenSubstractionCalculated() {
		Calculator calculator = new Calculator();
		final double one = 5;
		final double two = 2;
		final double three = 3;
		calculator.substract(one, two);
		double result = calculator.getResult();
		assertThat(result, is(three));
	}
	/**
	* Testing a multiplication.
	*/
	@Test
	public void whenMultiplicationCalculated() {
		Calculator calculator = new Calculator();
		final double one = 5;
		final double two = 2;
		final double three = 10;
		calculator.multiple(one, two);
		double result = calculator.getResult();
		assertThat(result, is(three));
	}
	/**
	* Testing a division.
	*/
	@Test
	public void whenDivisionCalculated() {
		Calculator calculator = new Calculator();
		final double one = 6;
		final double two = 2;
		final double three = 3;
		calculator.div(one, two);
		double result = calculator.getResult();
		assertThat(result, is(three));
	}
	/**
	* Testing an expansion.
	*/
	@Test
	public void whenExpandIsCalculated() {
		Calculator calculator = new Calculator();
		final double one = 6;
		final double two = 2;
		calculator.expand(one, two);
		double result = calculator.getResult();
		assertThat(result, is(36.0));
	}
	/**
	* Testing a getting result.
	*/
	@Test
		public void whenGetResultWorksThenReturnItValue() {
		Calculator calculator = new Calculator();
		final double expected = 0.0;
		assertThat(calculator.getResult(), is(expected));
    }
}