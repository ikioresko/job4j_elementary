package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        DummyBot.answer("Привет, Бот.");
        is("Привет, умник.");
    }

    @Test
    public void whenByeBot() {
        DummyBot.answer("Пока.");
        is("До скорой встречи.");
    }

    @Test
    public void whenUnknownBot() {
        DummyBot.answer("Как дела?");
        is("Это ставит меня в тупик. Задайте другой вопрос.");
    }
}