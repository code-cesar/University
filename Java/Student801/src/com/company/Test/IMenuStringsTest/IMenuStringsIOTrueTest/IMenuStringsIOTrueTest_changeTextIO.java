package com.company.Test.IMenuStringsTest.IMenuStringsIOTrueTest;


import com.company.IO.IMenuIO.IMenuStringsIO;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class IMenuStringsIOTrueTest_changeTextIO {

    @Test
    public void IMenuStringsIOTrueTest_changeTextIO() {

        assertEquals("lamp",
                IMenuStringsIO.changeTextIO("LaMp"));
    }

    @Test
    public void IMenuStringsIOTrueTest_changeTextIOSpace() {

        assertEquals("fffff h",
                IMenuStringsIO.changeTextIO("  fffff     H"));
    }

}