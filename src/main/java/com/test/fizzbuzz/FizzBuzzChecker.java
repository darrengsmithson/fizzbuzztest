package com.test.fizzbuzz;

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
        for(int lineNumber=0; lineNumber<=lines; lineNumber++) {
            if (criteriaCheck(lineNumber, fizz) && criteriaCheck(lineNumber, buzz)) {
                System.out.println(FizzBuzz.FizzBuzz);
            }else if(criteriaCheck(lineNumber, fizz)) {
                System.out.println(FizzBuzz.Fizz);
            }else if(criteriaCheck(lineNumber, buzz)) {
                System.out.println(FizzBuzz.Buzz);
            }else {
                System.out.println(lineNumber);
            }
        }
    }

    /**
     *
     * @param currentNumber
     * @param criteria
     * @return true if number is divisible by or present in
     * the criteria number
     */
    public boolean criteriaCheck(int currentNumber, int criteria) {
        if(currentNumber<criteria) {
            return false;
        }

        //If current number is divisible by criteria return true
        if(currentNumber%criteria==0) {
            return true;
        }

        //If current number contains criteria return true
        return charCheck(currentNumber, criteria);
    }

    private boolean charCheck(int a, int b) {
        String stra = Integer.toString(a, 10);
        char charb = Character.forDigit(b, 10);

        return stra.indexOf(charb)!=-1;

    }
}
