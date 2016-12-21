package dkalymbaev.triangle;

/**
* This class returns the largest number.
*/

public class Max {
	/**
	* Method calculates maximal value of two digits.
	* @param first is the first digit.
	* @param second is the second digit.
	* @param return returns result.
	*/
	public int max(int first, int second) {
		return first > second ? first : second;
	}
	/**
	* Method calculates the maximal value of three digits.
	* @param first is the first digit.
	* @param second is the second digit.
	* @param third is the third digit.
	* @param return returns result.
	*/
	public int max(int first, int second, int third) {
		return max(max(first, second), third);
	}
}