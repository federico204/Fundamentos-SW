package FizzBuzz;



public class FizzBuzz {

    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 100;
    public static final int FIZZ_NUMBER = 3;
    public static final int BUZZ_NUMBER = 5;
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String calculate(int number){

        if (number < MIN_VALUE || number > MAX_VALUE){
            throw new IllegalArgumentException("El número debe estar entre " + MIN_VALUE + " y " + MAX_VALUE);
        }
        String result = "";

        if (number % FIZZ_NUMBER == 0) {
            result += FIZZ;
        }
        if (number % BUZZ_NUMBER == 0) {
            result += BUZZ;
        }

        if (result.isEmpty()) {
            return Integer.toString(number);
        }

        return result;
    }
}
