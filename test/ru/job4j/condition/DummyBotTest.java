package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DummyBotTest {

    @Test
    public void whenQuestoinHi() {
        assertThat(DummyBot.answer("Привет, Бот."), is("Привет, умник."));
    }
    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    @Test
    public void whenByBot() {
        assertThat(DummyBot.answer("Пока"), is("До скорой встречи."));
    }
    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    @Test
    public void whenQuestionUnknow() {
        assertThat(DummyBot.answer("bgfdfgdf"), is("Это ставит меня в тупик, Задайте другой вопрос"));
    }
}