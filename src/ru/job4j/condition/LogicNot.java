package ru.job4j.condition;

public class LogicNot {
    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public boolean isPositiv(int num) {
        return num > 0;
    }

    public boolean isNotEven(int num) {
        return !isEven(num);
    }

    public boolean notPositiv(int num) {
        return !isPositiv(num);
    }

    public boolean notEvenAndPositive(int num) {
        return isNotEven(num) && isPositiv(num);
    }

    public boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositiv(num);
    }
    }
