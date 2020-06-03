package com.company.Test.IMenuStringsTest.IMenuStringsIOTrueTest;

import com.company.Exception.ValidationExceptionStrings;
import com.company.IO.IMenuIO.IMenuStringsIO;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IMenuStringsIOTrueTest_isTextEqualsIO {

    @Test
    public void IMenuStringsIOTrueTest_isTextEqualsIO()throws ValidationExceptionStrings {
        assertTrue(IMenuStringsIO.isTextEqualsIO("Раз","Раз"));

    }

}