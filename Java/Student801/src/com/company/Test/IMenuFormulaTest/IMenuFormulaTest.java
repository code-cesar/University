package com.company.Test.IMenuFormulaTest;

import com.company.Exception.ValidationException;
import com.company.IO.InvariableIO;
import com.company.IO.OutputIO;
import com.company.Main;
import com.company.Msetting.IMenuFormula;
import org.junit.Test;

import static org.junit.Assert.*;

public class IMenuFormulaTest {
    IMenuFormula _menuItem = new IMenuFormula();


    @Test
    public void IMenuFormulaTest_getTitle() {
        assertEquals(InvariableIO.nameIMenuFormula,_menuItem.getTitle());
    }

}