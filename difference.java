public class Differencebetween {

	public int differencebetweenSumOfSquaresandSquareOfSums(int limit){
		int sumOfsquares = 0;
		int squareOfsums = 0;
		int sumOfNumbers = 0;
		int difference = 0;
                int i=0;
	
	while(i<=limit){
		sumOfNumbers += i;
		sumOfsquares +=(i*i);
		i++;
	}
		squareOfsums = sumOfNumbers*sumOfNumbers;
		difference = squareOfsums - sumOfsquares;
		return difference;

 }

}
