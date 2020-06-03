package com.company.Test;

import com.company.IO.InvariableIO;
import com.company.IO.OutputIO;
import com.company.Main;
import com.company.Msetting.IMenuExit;
import org.junit.Test;

import static org.junit.Assert.*;

public class IMenuExitTest {
    IMenuExit _menuItem = new IMenuExit();
    @Test
    public void IMenuExitTest_getTitle() {
        assertEquals(InvariableIO.nameIMenuExit,_menuItem.getTitle());
    }

}