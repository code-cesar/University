package com.company.IO.IMenuIO;

import com.company.Exception.ValidationExceptionRecursion;
import com.company.IO.OutputIO;
import com.company.IO.RegexIO;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class IMenuRecursionIO {
    public static final DateFormat DATEFORMAT = new SimpleDateFormat("dd.MM.yyyy");
    public static final int SIZE_DATE = 4;

    public static boolean isDateReg(String lineNotSpace) throws ValidationExceptionRecursion
    {
        if(!lineNotSpace.matches(RegexIO.G_REGEX_DATE))throw new ValidationExceptionRecursion("Неправильный ввод даты (" + lineNotSpace + ") ,введите дату формата ДД.ММ.ГГГГ", lineNotSpace);
        return true;
    }

    public static int getDays(long aTimeDate[])throws ValidationExceptionRecursion
    {
        if(aTimeDate.length > 4)throw new ValidationExceptionRecursion("Передача массива размера больше 4");
        long lGetLengthDate = 0;
        if(aTimeDate[3] < aTimeDate[1])
        {
            lGetLengthDate = aTimeDate[3]-aTimeDate[2];
        }
        else lGetLengthDate = Math.abs(Math.max(aTimeDate[0],aTimeDate[1])- Math.min(aTimeDate[2],aTimeDate[3]));
        int days = (int) (lGetLengthDate / 86_400_000) + 1;
        if(days <= 1)throw new ValidationExceptionRecursion("Невозможно рассчитать, так как days( " + days +" ) <= 1");
        return days;
    }

    public static String recursionFunction(int aN,int aDelit)
    {
        if(aDelit < 3)aDelit = 3;
        String result = " ";
        if(aN <= 1)  result = result.concat( " " );
        else if(aN % 2 == 0) {
            result = result.concat( " 2");
            result = result.concat( recursionFunction(aN / 2,aDelit) );
        }
        else {
            int del = 1;
            for(int i = aDelit ; i*i <= aN; i += 2)
            {
                if(aN % i == 0)
                {
                    result = result.concat( " " + i );
                    del = i;
                    break;
                }
            }
            if(del != 1)result = result.concat( recursionFunction(aN / del,del));
            else result = result.concat(  " " + aN);
        }
        return result;
    }
}
