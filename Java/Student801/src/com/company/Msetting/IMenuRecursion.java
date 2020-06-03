package com.company.Msetting;

import com.company.Exception.ValidationExceptionRecursion;
import com.company.IO.OutputIO;
import com.company.IO.InvariableIO;
import com.company.IO.IMenuIO.IMenuRecursionIO;
import com.company.IO.MInputIO.GetLine;


import java.util.Date;
import java.text.ParseException;


public class IMenuRecursion implements IMenu {


    private Date[] _arrayOfDates = new Date[IMenuRecursionIO.SIZE_DATE];


    private Date dateConversion(String varName)
    {
        try {
            String lineNotSpace = GetLine.get(varName).trim();

            while(true) {
                try {
                    IMenuRecursionIO.isDateReg(lineNotSpace);
                    break;
                } catch (ValidationExceptionRecursion ex) {
                    OutputIO.println(ex.getMessage());
                    OutputIO.println(ex.getLineNotSpaceException());
                    lineNotSpace = GetLine.get(varName).trim();
                }
            }

            return IMenuRecursionIO.DATEFORMAT.parse(lineNotSpace);
        } catch (ParseException ex) {
            ex.printStackTrace();
            return new Date();
        }
    }

    private void setDate(int iDateOne)throws ValidationExceptionRecursion
    {
        int iDateTwo = iDateOne + 1;

        _arrayOfDates[iDateOne] = dateConversion(InvariableIO.NUMERALS_DATE[iDateOne] + " дату формата ДД.ММ.ГГГГ");
        _arrayOfDates[iDateTwo] = dateConversion(InvariableIO.NUMERALS_DATE[iDateTwo] + " дату формата ДД.ММ.ГГГГ");

        while(true) {
            try {
                if(_arrayOfDates[iDateOne].getTime() > _arrayOfDates[iDateTwo].getTime())
                    throw new ValidationExceptionRecursion("Первая дата больше второй,введите даты повторно");
                break;
            } catch (ValidationExceptionRecursion ex) {

                OutputIO.println(ex.getMessage());
                _arrayOfDates[iDateTwo] = dateConversion(InvariableIO.NUMERALS_DATE[iDateTwo] + " дату формата ДД.ММ.ГГГГ");
            }
        }
    }


    public void action()
    {
        long [] lTimeDate = new long[IMenuRecursionIO.SIZE_DATE];

        try {
            setDate(0);
            setDate(2);

            boolean isDateAfter = (_arrayOfDates[0].getTime() > _arrayOfDates[2].getTime());

            lTimeDate[0] = _arrayOfDates[isDateAfter ? 2 : 0].getTime();
            lTimeDate[1] = _arrayOfDates[isDateAfter ? 3 : 1].getTime();
            lTimeDate[2] = _arrayOfDates[isDateAfter ? 0 : 2].getTime();
            lTimeDate[3] = _arrayOfDates[isDateAfter ? 1 : 3].getTime();

        } catch (ValidationExceptionRecursion ex) {
            OutputIO.println(ex.getMessage());
            return;
        }

        try{
            if(lTimeDate[2] > lTimeDate[1])
                throw new ValidationExceptionRecursion("Даты не пересекаються");
        }catch (ValidationExceptionRecursion ex)
        {
            OutputIO.println(ex.getMessage());
            return;
        }

        try {
            int days = IMenuRecursionIO.getDays(lTimeDate);
            OutputIO.println("Разница между датами в днях: " + days);
            OutputIO.print(days + "=");
            OutputIO.println(IMenuRecursionIO.recursionFunction(days, 3));
        }catch (ValidationExceptionRecursion ex)
        {
            OutputIO.println(ex.getMessage());
            return;
        }
    }

    public String getTitle()
    {
        return InvariableIO.nameIMenuRecursion;
    }
}
