package com.company.Test.IMenuRecursionTest.IMenuRecursionIOTrueTest;

import com.company.IO.IMenuIO.IMenuRecursionIO;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IMenuRecursionIOTrueTest_recursionFunction {

    @Test
    public void IMenuRecursionIOTrueTest_recursionFunction()  {
        assertEquals("2 2 2 2 2",
                IMenuRecursionIO.recursionFunction(32,3).trim().replaceAll("[\\s]{2,}"," "));
    }

    @Test
    public void IMenuRecursionIOTrueTest_recursionFunctionSmallValue()  {
        assertEquals("",
                IMenuRecursionIO.recursionFunction( -2147483648,3).trim().replaceAll("[\\s]{2,}"," "));
    }

    @Test
    public void IMenuRecursionIOTrueTest_recursionFunctionTwoValue()  {
        assertEquals("2",
                IMenuRecursionIO.recursionFunction( 2,3).trim().replaceAll("[\\s]{2,}"," "));
    }

    @Test
    public void IMenuRecursionIOTrueTest_recursionFunctionZeroValue()  {
        assertEquals("",
                IMenuRecursionIO.recursionFunction( 0,3).trim().replaceAll("[\\s]{2,}"," "));
    }

    @Test
    public void IMenuRecursionIOTrueTest_recursionFunctionBigValue()   {
        assertEquals("2 3 3 7 11 31 151 331",
                IMenuRecursionIO.recursionFunction(2147483646,3).trim().replaceAll("[\\s]{2,}"," "));
    }

}