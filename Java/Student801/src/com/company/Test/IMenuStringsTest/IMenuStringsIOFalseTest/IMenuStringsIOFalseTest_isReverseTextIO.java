package com.company.Test.IMenuStringsTest.IMenuStringsIOFalseTest;

import com.company.Exception.ValidationExceptionStrings;
import com.company.IO.IMenuIO.IMenuStringsIO;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IMenuStringsIOFalseTest_isReverseTextIO {

    @Test(expected = ValidationExceptionStrings.class)
    public void IMenuStringsIOFalseTest_isReverseTextIO()throws  ValidationExceptionStrings   {
        IMenuStringsIO.isReverseTextIO("Раз","зАр");

    }


}