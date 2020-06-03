package com.company.Test.IMenuStringsTest.IMenuStringsIOFalseTest;

import com.company.Exception.ValidationExceptionStrings;
import com.company.IO.IMenuIO.IMenuStringsIO;
import com.company.IO.OutputIO;
import org.junit.Test;

import static org.junit.Assert.*;

public class IMenuStringsIOFalseTest_isTextEqualsIO {

    @Test(expected = ValidationExceptionStrings.class)
    public void IMenuStringsIOFalseTest_isTextEqualsIO()throws  ValidationExceptionStrings   {
        IMenuStringsIO.isTextEqualsIO("Раз","Два");

    }


}