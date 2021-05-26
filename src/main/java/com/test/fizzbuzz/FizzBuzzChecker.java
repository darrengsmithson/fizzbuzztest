package com.test.fizzbuzz;

import java.util.stream.IntStream;

public class FizzBuzzChecker {

    /**
     *
     * @param fizz a number that will be replaced by 'Fizz'
     * @param buzz a number that will be replaced by 'Buzz'
     * @param lines number of lines to be output by the terminal
     *
     * Check each line number of the given lines and call a
     * method that will replace the given parameters with
     * either Fizz, Buzz or FizzBuzz when the are divisible by
     * or present in the line number
     *
     */
    public void replaceNumbers(int fizz, int buzz, int lines) {

        IntStream.rangeClosed(1, lines)
                .forEach(
                    a -> {
                        if ( criteriaCheck(a, fizz) && criteriaCheck(a, buzz) ) {
                            System.out.println(FizzBuzz.FizzBuzz);
                        }else if( criteriaCheck(a, fizz) ) {
                            System.out.println(FizzBuzz.Fizz);
                        }else if( criteriaCheck(a, buzz) ) {
                            System.out.println(FizzBuzz.Buzz);
                        }else {
                            System.out.println(a);
                        }
                    }
                    );
    }

    /**
     *
     * @param currentNumber
     * @param criteria
     * @return true if number is divisible by or present in
     * the criteria number
     */
    public boolean criteriaCheck(int currentNumber, int criteria) {
        if(currentNumber < criteria) {
            return false;
        }

        //If current number is divisible by criteria return true
        if(currentNumber % criteria == 0) {
            return true;
        }

        //If current number contains criteria return true
        return charCheck(currentNumber, criteria);
    }

    private boolean charCheck(int a, int b) {
        String stra = Integer.toString(a, 10);
        char charb = Character.forDigit(b, 10);
        //If String representation of int a doesnt contain char version
        //of int b return false
        return stra.indexOf(charb) != -1;

    }
}
