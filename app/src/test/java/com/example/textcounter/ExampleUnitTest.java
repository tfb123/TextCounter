package com.example.textcounter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void Test01GetCharsCount() {
        String input = "null";
        String expectedValue = "4";
        String inputValue = MainActivity.getCharsCount(input);
        assertEquals(expectedValue, inputValue);
    }

    @Test
    public void Test02GetCharsCount() {
        String input = "";
        String expectedValue = "0";
        String inputValue = MainActivity.getCharsCount(input);
        assertEquals(expectedValue, inputValue);
    }

    @Test
    public void Test03GetCharsCount() {
        String input = "!#$%&'()*+,-./:;<=>?@[]^_`{|}~";
        String expectedValue = "30";
        String inputValue = MainActivity.getCharsCount(input);
        assertEquals(expectedValue, inputValue);
    }


    @Test
    public void Test04GetCharsCount() {
        String input = "!#$%&'()*+,-./:;<=>?@[]^_`{|}~";
        String expectedValue = "30";
        String inputValue = MainActivity.getCharsCount(input);
        assertEquals(expectedValue, inputValue);
    }

    @Test
    public void Test05GetCharsCount() {
        String input = "! # $ % & ' ( ) * + , - . / : ; < = > ? @ [ ] ^ _ ` { | } ~";
        String expectedValue = "59";
        String inputValue = MainActivity.getCharsCount(input);
        assertEquals(expectedValue, inputValue);
    }
}