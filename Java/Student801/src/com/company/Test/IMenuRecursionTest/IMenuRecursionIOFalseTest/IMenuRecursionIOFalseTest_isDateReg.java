package com.company.Test.IMenuRecursionTest.IMenuRecursionIOFalseTest;

import com.company.Exception.ValidationExceptionRecursion;
import com.company.IO.IMenuIO.IMenuRecursionIO;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IMenuRecursionIOFalseTest_isDateReg {

    @Test(expected = ValidationExceptionRecursion.class)
    public void IMenuRecursionIOFalseTest_isDateRegDelimiter() throws ValidationExceptionRecursion {

        assertTrue(IMenuRecursionIO.isDateReg("15/05/2000"));
    }

    @Test(expected = ValidationExceptionRecursion.class)
    public void IMenuRecursionIOFalseTest_isDateRegYear() throws ValidationExceptionRecursion {

        assertTrue(IMenuRecursionIO.isDateReg("01.01.999"));
    }

    @Test(expected = ValidationExceptionRecursion.class)
    public void IMenuRecursionIOFalseTest_isDateRegMonth() throws ValidationExceptionRecursion {

        assertTrue(IMenuRecursionIO.isDateReg("01.13.2000"));
    }

    @Test(expected = ValidationExceptionRecursion.class)
    public void IMenuRecursionIOFalseTest_isDateRegDay() throws ValidationExceptionRecursion {

        assertTrue(IMenuRecursionIO.isDateReg("35.01.2000"));
    }

    @Test(expected = ValidationExceptionRecursion.class)
    public void IMenuRecursionIOFalseTest_isDateRegEmpty() throws ValidationExceptionRecursion {

        assertTrue(IMenuRecursionIO.isDateReg(""));
    }

    @Test(expected = ValidationExceptionRecursion.class)
    public void IMenuRecursionIOTrueTest_isDateRegLeapYear() throws ValidationExceptionRecursion {

        assertTrue(IMenuRecursionIO.isDateReg("29.02.2011"));
    }


}