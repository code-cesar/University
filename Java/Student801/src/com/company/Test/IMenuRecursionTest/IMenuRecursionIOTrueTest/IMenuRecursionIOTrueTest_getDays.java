package com.company.Test.IMenuRecursionTest.IMenuRecursionIOTrueTest;

import com.company.Exception.ValidationExceptionRecursion;
import com.company.IO.IMenuIO.IMenuRecursionIO;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;

import static org.junit.Assert.assertEquals;

public class IMenuRecursionIOTrueTest_getDays {
    private static long [] testTime;

    private static String [] getDaysTest =
            new String[]{ "15.05.2001", "18.05.2001", "16.05.2001", "02.06.2001"};

    private static String [] getDaysTestBigDate =
            new String[]{ "01.01.1000", "31.12.9999", "01.01.1000", "31.12.9999" };

    private static String [] getDaysTestSmallDate =
            new String[]{ "01.01.1000", "02.01.1000", "01.01.1000", "02.01.1000" };

    @Before
    public void setUp() {
       testTime = new long [4];
    }

    @Test
    public void IMenuRecursionIOTrueTest_getDays() throws ValidationExceptionRecursion, ParseException {

        testTime[0] = IMenuRecursionIO.DATEFORMAT.parse(getDaysTest[0]).getTime();
        testTime[1] = IMenuRecursionIO.DATEFORMAT.parse(getDaysTest[1]).getTime();
        testTime[2] = IMenuRecursionIO.DATEFORMAT.parse(getDaysTest[2]).getTime();
        testTime[3] = IMenuRecursionIO.DATEFORMAT.parse(getDaysTest[3]).getTime();
        assertEquals(3,
                IMenuRecursionIO.getDays(testTime));
    }

    @Test
    public void IMenuRecursionIOTrueTest_getDaysBigDate() throws ValidationExceptionRecursion, ParseException {
        testTime[0] = IMenuRecursionIO.DATEFORMAT.parse(getDaysTestBigDate[0]).getTime();
        testTime[1] = IMenuRecursionIO.DATEFORMAT.parse(getDaysTestBigDate[1]).getTime();
        testTime[2] = IMenuRecursionIO.DATEFORMAT.parse(getDaysTestBigDate[2]).getTime();
        testTime[3] = IMenuRecursionIO.DATEFORMAT.parse(getDaysTestBigDate[3]).getTime();
        assertEquals(3287177,
                IMenuRecursionIO.getDays(testTime));
    }

    @Test
    public void IMenuRecursionIOTrueTest_getDaysSmallDate() throws ValidationExceptionRecursion, ParseException {
        testTime[0] = IMenuRecursionIO.DATEFORMAT.parse(getDaysTestSmallDate[0]).getTime();
        testTime[1] = IMenuRecursionIO.DATEFORMAT.parse(getDaysTestSmallDate[1]).getTime();
        testTime[2] = IMenuRecursionIO.DATEFORMAT.parse(getDaysTestSmallDate[2]).getTime();
        testTime[3] = IMenuRecursionIO.DATEFORMAT.parse(getDaysTestSmallDate[3]).getTime();

        assertEquals(2,
                IMenuRecursionIO.getDays(testTime));
    }


}