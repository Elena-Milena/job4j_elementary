package ru.job4j.condition;

public class Cinema {
/*
    public static void access (int age) {
        System.out.println("The age of the customer is: " + age);
        if (age > 16) {
            System.out.println("Welcome to cinema");
        } else {
            System.out.println("It is not for you");
        }
    }
    public static void main(String [] args) {
        access(21);
        access(16);
    } */
    @SuppressWarnings("checkstyle:MethodParamPad")
    public static void permission (boolean allowByParent, boolean hasMoney) {
    if (allowByParent && hasMoney) {
        System.out.println("Я могу пойти в кино");
    } else {
        System.out.println("Я не могу пойти");
    }
    }
    public static void main(String[] args) {
        Cinema.permission(true, true);
        Cinema.permission(true, false);
        Cinema.permission(false, true);
        Cinema.permission(false, false);
    }
}

