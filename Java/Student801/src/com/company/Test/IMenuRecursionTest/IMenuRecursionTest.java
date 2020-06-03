package com.company.Test.IMenuRecursionTest;

import com.company.IO.InvariableIO;
import com.company.IO.OutputIO;
import com.company.Main;
import com.company.Msetting.IMenuRecursion;
import org.junit.Test;

import static org.junit.Assert.*;

public class IMenuRecursionTest {

    @Test
    public void IMenuRecursionTest_getTitle() {
        assertEquals(InvariableIO.nameIMenuRecursion,new IMenuRecursion().getTitle());
    }

}