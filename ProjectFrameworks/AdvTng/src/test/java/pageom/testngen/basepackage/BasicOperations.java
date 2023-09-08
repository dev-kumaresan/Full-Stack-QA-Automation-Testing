package pageom.testngen.basepackage;

/**
 * Copyright © 2023 Kumaresan L
 * 
 * @author kumaresan <br>
 *         <h1>- Methods Declarations for basic mathematical programs in java
 */
public interface BasicOperations {
	/**
	 * 
	 * Copyright © 2023 Kumaresan L
	 * 
	 * @author kumaresan
	 * @param number
	 */
	void oddOrEven(int number);

	/**
	 * Copyright © 2023 Kumaresan L
	 * 
	 * @param from
	 * @param to
	 * 
	 */
	void evenNumbersByLimit(int from, int to);

	/**
	 * Copyright © 2023 Kumaresan L
	 * 
	 * @author kumaresan
	 * @param from
	 * @param to
	 *             <h1>Method Declaration for Finding the Odd Numbers by giving
	 *             certain limit</h1>
	 */
	void oddNumbersByLimit(int from, int to);

	/**
	 */
	int factorialOf(int number);

	int evenNumbersCount(int from, int to);

	int oddNumbersCount(int from, int to);

	int sumOfEvenNumbers(int from, int to);

	int sumOfOddNumbers(int from, int to);

	int sumOfNumbers(int from, int to);

	int reverseTheNumber(int number);

	void palindromNumberOrNot(int number);

	void palindromeNumbersByLimit(int from, int to);

	int countOfDigit(int number);

	void amstrongNumberOrNot(int number);

	void amstrongNumbersByLimit(int from, int to);

	int sumOfDigit(long digit);

	void numbersSwap(int firstNumber, int secondNumber);

	void numbersSwapWithoutThirdVariable(int firstNumber, int secondNumber);

}
