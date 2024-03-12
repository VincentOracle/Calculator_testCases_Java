package org.example;

public class Calculator {

    public double sum(double[] arr) {
        double sum_ = 0;
        for (int i = 0; i < arr.length; i++) {
            sum_ += arr[i];
        }
        System.out.println("Addition: " + sum_);
        return sum_;
    }

    public double subtract(double[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Input array cannot be empty");
        }
        double diff_ = arr[0];
        for (int i = 1; i < arr.length; i++) {
            diff_ -= arr[i];
        }
        System.out.println("Subtraction: " + diff_);
        return diff_;
    }

    public double multiplication(double[] arr) {
        double pro_ = 1;
        for (int i = 0; i < arr.length; i++) {
            pro_ *= arr[i];
        }
        System.out.println("Product: " + pro_);
        return pro_;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        double div_ = a / b;
        System.out.println("Division of Given Two Numbers is: " + div_);
        return div_;
    }

    public double squareRoot(double radical) {
        if (radical < 0) {
            throw new IllegalArgumentException("Square root of a negative number is not a real number");
        }
        double res = Math.sqrt(radical);
        System.out.println("Square root: " + res);
        return res;
    }

    public double moduloOfTwoNum(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Modulus by zero is undefined");
        }
        double mod = a % b;
        System.out.println("Modulo of 2 numbers: " + mod);
        return mod;
    }

    public double average(double[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Input array cannot be empty");
        }
        double sum_ = 0;
        for (int i = 0; i < arr.length; i++) {
            sum_ += arr[i];
        }
        double average = sum_ / (arr.length);
        System.out.println("Average of numbers: " + average);
        return average;
    }

    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative integers");
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
