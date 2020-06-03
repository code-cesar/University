package com.company.Test;

import com.company.IO.InvariableIO;
import com.company.IO.OutputIO;
import com.company.Main;
import com.company.Msetting.IMenuHelloWorld;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class IMenuHelloWorldTest {
    IMenuHelloWorld _menuItem = new IMenuHelloWorld();

    @Test
    public void IMenuHelloWorldTest_getTitle() {
        assertEquals(InvariableIO.nameIMenuHelloWorld,_menuItem.getTitle());
    }

    @Test
    public void IMenuHelloWorldTest_action()
    {
        _menuItem.action();
        assertEquals("Hello world", OutputIO.lastSafeMessage);
    }
}