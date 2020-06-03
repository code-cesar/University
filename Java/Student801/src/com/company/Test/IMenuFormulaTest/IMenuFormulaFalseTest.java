package com.company.Test.IMenuFormulaTest;

import com.company.Exception.ValidationException;
import com.company.IO.InvariableIO;
import com.company.Msetting.IMenuFormula;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IMenuFormulaFalseTest {
    IMenuFormula _menuItem = new IMenuFormula();


    @Test(expected = ValidationException.class)
    public void IMenuFormulaTest_calculationFormula() throws ValidationException { // X/Z + Y^2
        _menuItem.calculationFormula(1000.5, 10.2, 0);
    }


}