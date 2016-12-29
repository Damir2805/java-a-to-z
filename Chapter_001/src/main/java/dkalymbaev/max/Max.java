package dkalymbaev.max;

/**
* This class returns the largest number.
*/

public class Max {
	/**
	* Method calculates maximal value of two digits.
	* @param first is the first digit.
	* @param second is the second digit.
	 */
	public int max(int first, int second) {
		return first > second ? first : second;
	}
	/**
	* Method calculates the maximal value of three digits.
	* @param first is the first digit.
	* @param second is the second digit.
	* @param third is the third digit.
	 */
	public int max(int first, int second, int third) {
		return max(max(first, second), third);
	}
}