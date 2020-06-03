package com.company.Msetting;
import com.company.IO.InvariableIO;
public class IMenuExit implements IMenu
{

    public String getTitle()
    {
        return InvariableIO.nameIMenuExit;
    }

    public void action()
    {
        System.exit(0);
    }
}
