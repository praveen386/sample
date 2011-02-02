public class SumOfEvenNumberOfFibonacciNumbersFrom {

    int FirstNumber;
    int SecondNumber;

  public SumOfEvenNumbersOfFibonacciNumbersStartFrom(int FirstNumber, int SecondNumber){

      this.FirstNumber = FirstNumber;
      this.SecondNumber = SecondNumber;

    }

    public int sumOfEvenNumbersOfFibonacciNumbersUpto(int fibonacciTermsLimt){

        int sumOfEvenNumbersOfFibonaccicSeries= 0;

        if(FirstNumber%2 == 0){
           sumOfEvenNumbersOfFibonaccicSeries+= FirstNumber;
        }

        int Temp;

        while(SecondNumber <= fibonacciTermsUpTo){

            if(SecondNumber%2 == 0){
              sumOfEvenNumbersOfFibonaccicSeries+= SecondNumber;
            }

            Temp = FirstNumber;
            FirstNumber = SecondNumber;
            SecondNumber += Temp;
        }

        return sumOfEvenNumbersOfFibonaccicSeries;

    }
