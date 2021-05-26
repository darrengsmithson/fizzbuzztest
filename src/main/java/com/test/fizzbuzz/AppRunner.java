package com.test.fizzbuzz;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class AppRunner implements CommandLineRunner {

    /**
     *
     * @param args
     * Accepts 3 arguments from the command line to be given
     * to FizzBuzzChecker class to print output to the terminal
     *
     * Returns zero output if 3 parameters arent given or the
     * parameters are not numbers
     */
    @Override
    public void run(String... args) {
        if(args.length!=3) {
            return;
        }

        FizzBuzzChecker checker = new FizzBuzzChecker();
        List<String> argList = Arrays.asList(args);
        try {
            int fizzNumber = Integer.parseInt(argList.get(0));
            int buzzNumber = Integer.parseInt(argList.get(1));
            int lines = Integer.parseInt(argList.get(2));

            checker.replaceNumbers(fizzNumber, buzzNumber, lines);

        } catch (NumberFormatException nfe) {
            return;
        }

    }
}
