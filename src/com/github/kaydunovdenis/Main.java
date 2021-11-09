package com.github.kaydunovdenis;

import javax.script.ScriptException;

public class Main {

    public static void main(String[] args) throws ScriptException {

        //1 Написать программу для вывода серии чисел Фибоначчи
        new Fibonacci().printNMembersSequenceFibonacci(10);

        //2 Написать программу для вычисления выражения в строке.
        args = new String[]{""};
        args[0] = "3 + 45.7 - (12 + 5.6 * -7)";
        System.out.println(new Calculator().evaluate(args[0]));

        //3
    }
}
