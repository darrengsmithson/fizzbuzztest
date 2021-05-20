package com.test.fizzbuzz;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class AppRunner implements CommandLineRunner {

    @Override
    public void run(String... args) {
        if(args.length!=3) {
            return;
        }
        FizzBuzzChecker checker = new FizzBuzzChecker();
        List<String> argList = Arrays.stream(args).sequential().collect(Collectors.toList());
        int arg1 = Integer.parseInt(argList.get(0));
        int arg2 = Integer.parseInt(argList.get(1));
        int arg3 = Integer.parseInt(argList.get(2));
        checker.replaceNumbers(arg1, arg2, arg3);
    }
}
