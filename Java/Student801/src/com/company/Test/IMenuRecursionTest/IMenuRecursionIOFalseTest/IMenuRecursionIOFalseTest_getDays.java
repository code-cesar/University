package com.company.Test.IMenuRecursionTest.IMenuRecursionIOFalseTest;

import com.company.Exception.ValidationExceptionRecursion;
import com.company.IO.IMenuIO.IMenuRecursionIO;
import com.company.IO.OutputIO;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;

import static org.junit.Assert.*;

public class IMenuRecursionIOFalseTest_getDays {

    private static String [] getDaysTest =
            new String[]{ "01.01.1000", "01.01.1000", "01.01.1000", "01.01.1000" };

    @Test(expected =  ValidationExceptionRecursion.class)
    public void IMenuRecursionIOFalseTest_getDaysBadDay() throws ValidationExceptionRecursion, ParseException {
        long [] testTime = new long [4];
        testTime[0] = IMenuRecursionIO.DATEFORMAT.parse(getDaysTest[0]).getTime();
        testTime[1] = IMenuRecursionIO.DATEFORMAT.parse(getDaysTest[1]).getTime();
        testTime[2] = IMenuRecursionIO.DATEFORMAT.parse(getDaysTest[2]).getTime();
        testTime[3] = IMenuRecursionIO.DATEFORMAT.parse(getDaysTest[3]).getTime();

        IMenuRecursionIO.getDays(testTime);
    }

    @Test(expected =  ValidationExceptionRecursion.class)
    public void IMenuRecursionIOFalseTest_getDaysSize() throws ValidationExceptionRecursion {
        long [] testTime = new long [5];
        IMenuRecursionIO.getDays(testTime);
    }
}