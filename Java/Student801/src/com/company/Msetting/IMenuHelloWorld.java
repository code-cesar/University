package com.company.Msetting;
import com.company.IO.OutputIO;
import com.company.IO.InvariableIO;
public class IMenuHelloWorld implements IMenu {


    public void action()
    {
        OutputIO.printlnSafe("Hello world");
        return;
    }

    public String getTitle()
    {
        return InvariableIO.nameIMenuHelloWorld;
    }

}
