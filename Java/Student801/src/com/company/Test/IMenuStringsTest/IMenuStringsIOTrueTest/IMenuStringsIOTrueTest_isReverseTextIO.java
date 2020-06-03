package com.company.Test.IMenuStringsTest.IMenuStringsIOTrueTest;

import com.company.Exception.ValidationExceptionStrings;
import com.company.IO.IMenuIO.IMenuStringsIO;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IMenuStringsIOTrueTest_isReverseTextIO {

    @Test
    public void IMenuStringsIOTrueTest_isReverseTextIO()throws ValidationExceptionStrings {
        assertTrue(IMenuStringsIO.isReverseTextIO("Раз","заР"));

    }

}