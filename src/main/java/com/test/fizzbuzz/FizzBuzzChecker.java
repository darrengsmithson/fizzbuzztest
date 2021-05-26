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

        IntStream.rangeClosed(1, lines).forEach(
                    line -> {
                        if ( criteriaCheck(line, fizz) && criteriaCheck(line, buzz) ) {
                            System.out.println(FizzBuzz.FizzBuzz);
                        }else if( criteriaCheck(line, fizz) ) {
                            System.out.println(FizzBuzz.Fizz);
                        }else if( criteriaCheck(line, buzz) ) {
                            System.out.println(FizzBuzz.Buzz);
                        }else {
                            System.out.println(line);
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

    private boolean charCheck(int currentNumber, int criteria) {
        String strNumber = Integer.toString(currentNumber, 10);
        char chCriteria = Character.forDigit(criteria, 10);
        //If String representation of int currentNumber contains char version
        //of criteria return true
        return strNumber.indexOf(chCriteria) != -1;

    }
}
