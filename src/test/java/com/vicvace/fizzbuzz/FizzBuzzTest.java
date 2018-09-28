package com.vicvace.fizzbuzz;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

@RunWith(DataProviderRunner.class)
public class FizzBuzzTest {

    @DataProvider
    public static Object[][] dataNumberProviderForFizz(){
        return new Object[][]{
                {3, true}, {6, true}, {9, true}, {12, true}, {15, true}, {18, true}
        };
    }

    @DataProvider
    public static Object[][] dataNumberProviderForBuzz(){
        return new Object[][]{
                {5, true}, {10, true}, {15, true}, {20, true}, {25, true}, {30, true}
        };
    }

    @DataProvider
    public static Object[][] dataNumberProviderForFizzBuzz(){
        return new Object[][]{
                {15, true}, {30, true}, {45, true}, {60, true}, {75, true}
        };
    }

    @Test
    public void firstTest() {
        assertTrue(true);
    }

    @Test
    @UseDataProvider("dataNumberProviderForFizz")
    public void itShouldReturnFizzIfDivisibleByThree(final int input, final boolean expected){
        //Arrange Action
        boolean result = FizzBuzz.isFizz(input);
        //Assertion
        assertEquals(expected, result);
    }

    @Test
    @UseDataProvider("dataNumberProviderForBuzz")
    public void itShouldReturnBuzzIfDivisibleByFive(final int input, final boolean expected){
        //Arrange Action
        boolean result = FizzBuzz.isBuzz(input);
        //Assertion
        assertEquals(expected, result);
    }

    @Test
    @UseDataProvider("dataNumberProviderForFizzBuzz")
    public void itShouldReturnFizzBuzzIfDivisibleByFive(final int input, final boolean expected){
        //Arrange Action
        boolean result = FizzBuzz.isFizzBuzz(input);
        //Assertion
        assertEquals(expected, result);
    }
}
