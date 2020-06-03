package com.company.Msetting;

import com.company.Exception.ValidationExceptionStrings;
import com.company.IO.IMenuIO.IMenuStringsIO;
import com.company.IO.OutputIO;
import com.company.IO.InvariableIO;
import com.company.IO.MInputIO.GetLine;

public class IMenuStrings implements IMenu {

    public void action()
    {
        String[] arrayText = new String[2];
        arrayText[0] = GetLine.get("Введите первую строку");
        arrayText[1] = GetLine.get("Введите вторую строку");
        IMenuStringsIO.isTextEquals(arrayText[0], arrayText[1]);

        for(int i = 0; i < arrayText.length; i ++) {
                arrayText[i] = IMenuStringsIO.changeText(arrayText[i]);
                IMenuStringsIO.isTextEmail(arrayText[i]);
                IMenuStringsIO.isTextIP(arrayText[i]);
                IMenuStringsIO.isTextPhone(arrayText[i]);
        }

        OutputIO.println("После изменения строк ");

        IMenuStringsIO.isTextEquals(arrayText[0], arrayText[1]);

        IMenuStringsIO.isReverseText(arrayText[0], arrayText[1]);


        return;
    }


    public String getTitle()
    {
        return InvariableIO.nameIMenuStrings;
    }

}
