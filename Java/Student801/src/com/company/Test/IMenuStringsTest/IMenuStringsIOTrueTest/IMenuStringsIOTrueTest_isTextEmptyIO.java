package com.company.Test.IMenuStringsTest.IMenuStringsIOTrueTest;

import com.company.Exception.ValidationExceptionStrings;
import com.company.IO.IMenuIO.IMenuStringsIO;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IMenuStringsIOTrueTest_isTextEmptyIO {

    @Test
    public void IMenuStringsIOTrueTest_isTextEmptyIO()throws ValidationExceptionStrings {
        assertTrue(IMenuStringsIO.isTextEmptyIO("Раз"));

    }

}