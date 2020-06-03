package com.company.Test.IMenuFormulaTest;

import com.company.Exception.ValidationException;
import com.company.IO.InvariableIO;
import com.company.Msetting.IMenuFormula;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IMenuFormulaTrueTest {
    IMenuFormula _menuItem = new IMenuFormula();

    @Test
    public void IMenuFormulaTest_calculationFormula() throws ValidationException { // X/Z + Y^2
        assertEquals(114.035,
                _menuItem.calculationFormula(1000.5, 10.2, 100.1), 0.001);
    }

    @Test
    public void IMenuFormulaTest_calculationFormulaValueSmall() throws ValidationException { // X/Z + Y^2
        assertEquals(2.2250738585072014e-308,
                _menuItem.calculationFormula(2.2250738585072014e-308, 0.0, 1.0), 0.001);
    }

    @Test
    public void IMenuFormulaTest_calculationFormulaValueBig() throws ValidationException { // X/Z + Y^2
        assertEquals(
                1.7976931348623158e+308,
                _menuItem.calculationFormula(
                        1.7976931348623158e+308, 1.0, 1.0), 0.001);
    }

}