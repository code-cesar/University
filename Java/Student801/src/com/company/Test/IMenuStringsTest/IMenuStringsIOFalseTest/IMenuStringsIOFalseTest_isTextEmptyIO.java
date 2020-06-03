package com.company.Test.IMenuStringsTest.IMenuStringsIOFalseTest;

import com.company.Exception.ValidationExceptionStrings;
import com.company.IO.IMenuIO.IMenuStringsIO;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IMenuStringsIOFalseTest_isTextEmptyIO {

    @Test(expected = ValidationExceptionStrings.class)
    public void IMenuStringsIOFalseTest_isTextEmptyIO()throws  ValidationExceptionStrings   {
        IMenuStringsIO.isTextEmptyIO("");

    }

}