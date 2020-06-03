package com.company.Test.IMenuStringsTest;

import com.company.IO.IMenuIO.IMenuStringsIO;
import com.company.IO.InvariableIO;
import com.company.IO.OutputIO;
import com.company.Main;
import com.company.Msetting.IMenuStrings;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IMenuStringsTest {

    @Test
    public void IMenuStringsTest_getTitle() {
        assertEquals(InvariableIO.nameIMenuStrings,new IMenuStrings().getTitle());
    }

}