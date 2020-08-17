package ru.job4j.condition;

import org.hamcrest.Matcher;

public class DummyBot {
    public static String answer(String question) {
        String rsl1 = "Это ставит меня в тупик, Задайте другой вопрос";
        if ("Привет, Бот.".equals(question)) {
            rsl1 = "Привет, умник.";
        } else if ("Пока".equals(question)) {
            rsl1 = "До скорой встречи.";
        }
        return rsl1;
    }
    public static void main(String [] args) {
        String rsl1 = DummyBot.answer("bgfdfgdf");
        System.out.println(rsl1);
        rsl1 = DummyBot.answer("Привет, Бот.");
        System.out.println(rsl1);
        rsl1 = DummyBot.answer("Пока");
        System.out.println(rsl1);
    }
}
