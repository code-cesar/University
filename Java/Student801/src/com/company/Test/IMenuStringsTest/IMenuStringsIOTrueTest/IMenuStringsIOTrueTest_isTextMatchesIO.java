package com.company.Test.IMenuStringsTest.IMenuStringsIOTrueTest;

import com.company.Exception.ValidationExceptionStrings;
import com.company.IO.IMenuIO.IMenuStringsIO;
import com.company.IO.InvariableIO;
import com.company.IO.RegexIO;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IMenuStringsIOTrueTest_isTextMatchesIO {

    @Test
    public void IMenuStringsIOTrueTest_isTextEmail()throws ValidationExceptionStrings {
        assertTrue(IMenuStringsIO.isTextMatchesIO("gw@mail.ru", RegexIO.G_REGEX_EMAIL, InvariableIO.nameExceptionEmail));
    }

    @Test
    public void IMenuStringsIOTrueTest_isTextSmallIP()throws ValidationExceptionStrings {
        assertTrue(IMenuStringsIO.isTextMatchesIO("8.8.8.8", RegexIO.G_REGEX_IP,InvariableIO.nameExceptionIP));
    }

    @Test
    public void IMenuStringsIOTrueTest_isTextIP()throws ValidationExceptionStrings {
        assertTrue(IMenuStringsIO.isTextMatchesIO("127.0.0.1", RegexIO.G_REGEX_IP,InvariableIO.nameExceptionIP));
    }

    @Test
    public void IMenuStringsIOTrueTest_isTextBigIP()throws ValidationExceptionStrings {
        assertTrue(IMenuStringsIO.isTextMatchesIO("255.255.255.255", RegexIO.G_REGEX_IP,InvariableIO.nameExceptionIP));
    }

    @Test
    public void IMenuStringsIOTrueTest_isTextPhone()throws ValidationExceptionStrings {
        assertTrue(IMenuStringsIO.isTextMatchesIO("89135208216", RegexIO.G_REGEX_PHONE,InvariableIO.nameExceptionPhone));
    }

    @Test
    public void IMenuStringsIOTrueTest_isTextPhonePlus()throws ValidationExceptionStrings {
        assertTrue(IMenuStringsIO.isTextMatchesIO("+79135208216", RegexIO.G_REGEX_PHONE,InvariableIO.nameExceptionPhone));
    }

    @Test
    public void IMenuStringsIOTrueTest_isTextPhoneDelimiter()throws ValidationExceptionStrings {
        assertTrue(IMenuStringsIO.isTextMatchesIO("903-123-4567", RegexIO.G_REGEX_PHONE,InvariableIO.nameExceptionPhone));
    }


}