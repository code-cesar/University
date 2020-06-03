package com.company.Test.IMenuRecursionTest.IMenuRecursionIOTrueTest;

import com.company.Exception.ValidationExceptionRecursion;
import com.company.IO.IMenuIO.IMenuRecursionIO;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IMenuRecursionIOTrueTest_isDateReg {

    @Test
    public void IMenuRecursionIOTrueTest_isDateReg() throws ValidationExceptionRecursion {

        assertTrue(IMenuRecursionIO.isDateReg("15.05.2000"));
    }

    @Test
    public void IMenuRecursionIOTrueTest_isDateRegSmallDate() throws ValidationExceptionRecursion {

        assertTrue(IMenuRecursionIO.isDateReg("01.01.1000"));
    }

    @Test
    public void IMenuRecursionIOTrueTest_isDateRegBigDate() throws ValidationExceptionRecursion {

        assertTrue(IMenuRecursionIO.isDateReg("01.01.9999"));
    }

    @Test
    public void IMenuRecursionIOTrueTest_isDateRegLeapYear() throws ValidationExceptionRecursion {

        assertTrue(IMenuRecursionIO.isDateReg("29.02.2012"));
    }


}