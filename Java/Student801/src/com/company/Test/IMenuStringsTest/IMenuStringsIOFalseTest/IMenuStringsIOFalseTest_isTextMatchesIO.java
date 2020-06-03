package com.company.Test.IMenuStringsTest.IMenuStringsIOFalseTest;

import com.company.Exception.ValidationExceptionStrings;
import com.company.IO.IMenuIO.IMenuStringsIO;
import com.company.IO.InvariableIO;
import com.company.IO.RegexIO;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IMenuStringsIOFalseTest_isTextMatchesIO {

    @Test(expected = ValidationExceptionStrings.class)
    public void IMenuStringsIOFalseTest_isTextEmail()throws  ValidationExceptionStrings   {
        IMenuStringsIO.isTextMatchesIO("gwmail.ru", RegexIO.G_REGEX_EMAIL, InvariableIO.nameExceptionEmail);

    }

    @Test(expected = ValidationExceptionStrings.class)
    public void IMenuStringsIOFalseTest_isTextIP()throws  ValidationExceptionStrings   {
        IMenuStringsIO.isTextMatchesIO("1.2.3", RegexIO.G_REGEX_IP,InvariableIO.nameExceptionIP);

    }

    @Test(expected = ValidationExceptionStrings.class)
    public void IMenuStringsIOFalseTest_isTextBigIP()throws  ValidationExceptionStrings   {
        IMenuStringsIO.isTextMatchesIO("256.256.256.256", RegexIO.G_REGEX_IP,InvariableIO.nameExceptionIP);

    }

    @Test(expected = ValidationExceptionStrings.class)
    public void IMenuStringsIOFalseTest_isTextPhone()throws  ValidationExceptionStrings   {
        IMenuStringsIO.isTextMatchesIO("1-1-1", RegexIO.G_REGEX_PHONE,InvariableIO.nameExceptionPhone);
    }

    @Test(expected = ValidationExceptionStrings.class)
    public void IMenuStringsIOFalseTest_isTextBigPhone()throws  ValidationExceptionStrings   {
        IMenuStringsIO.isTextMatchesIO("99999999999999999", RegexIO.G_REGEX_PHONE,InvariableIO.nameExceptionPhone);
    }

    @Test(expected = ValidationExceptionStrings.class)
    public void IMenuStringsIOFalseTest_isTextSmallPhone()throws  ValidationExceptionStrings   {
        IMenuStringsIO.isTextMatchesIO("0", RegexIO.G_REGEX_PHONE,InvariableIO.nameExceptionPhone);
    }


}