package com.github.kaydunovdenis;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * @author Kaydunov Denis
 * 08.11.2021
 */
public class Fibonacci {

    /**
     * Positive sequence
     * 0 - first member sequence
     * 1 - second member sequence
     * F{n}=F{n-1}+F{n-2}
     * etc.
     * <p>
     * Negative sequence
     * 0 - first member sequence
     * -1 - second member negative sequence
     * F{n}=F{n+2}-F{n+1}
     * etc.
     *
     * @param count - number member of sequence Fibonacci
     */
    public void printNMembersSequenceFibonacci(int count) {
        if (count > 0) {
            System.out.println(getNMembersPositiveSequenceFibonacci(count));
        } else System.out.println(getNMembersNegativeSequenceFibonacci(count));
    }

    public ArrayList<BigInteger> getNMembersPositiveSequenceFibonacci(int count) {
        ArrayList<BigInteger> sequenceFibonacci = new ArrayList<>();
        BigInteger var1 = BigInteger.ZERO;
        BigInteger var2 = BigInteger.ONE;
        BigInteger sum;
        for (int i = 1; i <= count; ++i) {
            sequenceFibonacci.add(var1);
            sum = var1.add(var2);
            var1 = var2;
            var2 = sum;
        }
        return sequenceFibonacci;
    }

    public ArrayList<BigInteger> getNMembersNegativeSequenceFibonacci(int count) {
        ArrayList<BigInteger> sequenceFibonacci = new ArrayList<>();
        getNMembersPositiveSequenceFibonacci(count)
                .forEach(member -> sequenceFibonacci.add(member.multiply(BigInteger.valueOf(-1))));
        return sequenceFibonacci;
    }
}
