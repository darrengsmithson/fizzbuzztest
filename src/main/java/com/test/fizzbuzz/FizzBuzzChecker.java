package com.test.fizzbuzz;

public class FizzBuzzChecker {

    public void replaceNumbers(int fizz, int buzz, int total) {
        for(int a=0; a<=total; a++) {
            if (numberCheck(a, fizz)&&numberCheck(a, buzz)) {
                System.out.println(FizzBuzz.FizzBuzz);
            }else if(numberCheck(a, fizz)) {
                System.out.println(FizzBuzz.Fizz);
            }else if(numberCheck(a, buzz)) {
                System.out.println(FizzBuzz.Buzz);
            }else {
                System.out.println(a);
            }
        }
    }

    public boolean numberCheck(int currentNumber, int textSwap) {
        if(currentNumber<textSwap) {
            return false;
        }

        if(currentNumber%textSwap==0) {
            return true;
        }

        return charCheck(currentNumber, textSwap);
    }

    private boolean charCheck(int a, int b) {
        String stra = Integer.toString(a, 10);
        char charb = Character.forDigit(b, 10);

        return stra.indexOf(charb)!=-1;

    }
}
