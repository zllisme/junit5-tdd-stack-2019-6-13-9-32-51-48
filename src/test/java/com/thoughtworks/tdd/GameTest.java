package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    Game game = new Game();

    @Test
    public void should_return_1_when_fizzBuzz_given_1() {
        Assertions.assertEquals("1", game.fizzBuzz(1));
    }

    @Test
    public void should_return_Fizz_when_fizzBuzz_given_3() {
        Assertions.assertEquals("Fizz", game.fizzBuzz(3));
    }

    @Test
    public void should_return_Buzz_when_fizzBuzz_given_5() {
        Assertions.assertEquals("Buzz", game.fizzBuzz(5));
    }

    @Test
    public void should_return_Whizz_when_fizzBuzz_given_7() {
        Assertions.assertEquals("Whizz", game.fizzBuzz(7));
    }

    @Test
    public void should_return_FizzBuzz_when_fizzBuzz_given_15() {
        Assertions.assertEquals("FizzBuzz", game.fizzBuzz(15));
    }

    @Test
    public void should_return_FizzWhizz_when_fizzBuzz_given_21() {
        Assertions.assertEquals("FizzWhizz", game.fizzBuzz(21));
    }

    @Test
    public void should_return_BuzzWhizz_when_fizzBuzz_given_35() {
        Assertions.assertEquals("BuzzWhizz", game.fizzBuzz(35));
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_fizzBuzz_given_105() {
        Assertions.assertEquals("FizzBuzzWhizz", game.fizzBuzz(105));
    }

    @Test
    public void should_return_Fizz_when_fizzBuzz_given_13() {
        Assertions.assertEquals("Fizz", game.fizzBuzz(13));
    }
}
