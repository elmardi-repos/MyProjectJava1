package org.example;

public class Main {

    private int denominator;
    public void setDenominator(int denominator) throws Exception{
        if (denominator == 0)
            throw new Exception("denominator cannot be 0");
        this.denominator = denominator;
    }

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.setDenominator(2);
        System.out.println("Denominator set to: " + main.denominator);

    }
}