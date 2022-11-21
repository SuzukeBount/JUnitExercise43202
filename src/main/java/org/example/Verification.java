package org.example;

public class Verification {

    public boolean isPrime(int number) {
        boolean flag = false;
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return false;
    }


    public boolean isEven(int number) {
        return ((number % 2) != 0);
    }

    public boolean isMultiple(int number, int divisor){
        return ((number % divisor) == 0);
    }
}
