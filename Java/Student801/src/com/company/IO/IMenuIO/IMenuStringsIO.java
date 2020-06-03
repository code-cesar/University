package com.company.IO.IMenuIO;

import com.company.Exception.ValidationExceptionStrings;
import com.company.IO.InvariableIO;
import com.company.IO.OutputIO;
import com.company.IO.RegexIO;

public class IMenuStringsIO {

    public static boolean isTextMatchesIO(String aText,String aRegEx,String aExceptionText)throws  ValidationExceptionStrings
    {
        if (!aText.matches(aRegEx))
            throw new ValidationExceptionStrings("Строка " + aText + " " + aExceptionText);
        return true;
    }

    public static boolean isReverseTextIO(String aOneText,String aTwoText)throws ValidationExceptionStrings
    {
        if (!aTwoText.equals(new StringBuffer(aOneText).reverse().toString()))
            throw new ValidationExceptionStrings("Строка " + aOneText + " Не перевёртыш строки " + aTwoText);
        return true;
    }

    public static boolean isTextEmptyIO(String aText)throws ValidationExceptionStrings
    {
        if (aText.isEmpty())
            throw new ValidationExceptionStrings("Строка пустая");
        return true;
    }

    public static boolean isTextEqualsIO(String aOneText,String aTwoText)throws ValidationExceptionStrings
    {
        isTextEmptyIO(aOneText);
        if (!aOneText.equals(aTwoText))
            throw new ValidationExceptionStrings("Строки не совпадают ");
        return true;
    }

    public static String changeTextIO(String aText)
    {
        return  aText.trim().replaceAll("[\\s]{2,}"," ").toLowerCase();
    }


    public static boolean isTextEquals(String aOneText,String aTwoText)
    {
        try {
            isTextEqualsIO(aOneText,aTwoText);
            OutputIO.printf("Строка %s совпадает со строкой %s \n",aOneText,aTwoText);
        }catch (ValidationExceptionStrings ex) {
            OutputIO.println(ex.getMessage());
            return false;
        }
        return true;
    }

    public static String changeText(String aText)
    {
        try{
            isTextEmptyIO(aText);
            OutputIO.println("Строка " + aText + " Изменена на " + (aText = changeTextIO(aText) ) );
        } catch (ValidationExceptionStrings ex){
            OutputIO.println(ex.getMessage());
        }
        return aText;
    }

    public static boolean isReverseText(String aOneText,String aTwoText)
    {
        try {
            isReverseTextIO(aOneText,aTwoText);
            OutputIO.println("Строка " + aOneText + " Перевёртыш " + aTwoText);
        } catch (ValidationExceptionStrings ex) {
            OutputIO.println(ex.getMessage());
            return false;
        }
        return true;
    }

    public static boolean isTextEmail(String aText)   {
        try {
            isTextMatchesIO(aText,RegexIO.G_REGEX_EMAIL, InvariableIO.nameExceptionEmail);
            OutputIO.println("Строка " + aText + " " + "Является Email");
        } catch (ValidationExceptionStrings ex) {
            OutputIO.println(ex.getMessage());
            return false;
        }
        return true;
    }

    public static  boolean isTextIP(String aText)  {
        try {
            isTextMatchesIO(aText,RegexIO.G_REGEX_IP,InvariableIO.nameExceptionIP);
            OutputIO.println("Строка " + aText + " " + "Является IP");
        } catch (ValidationExceptionStrings ex) {
            OutputIO.println(ex.getMessage());
            return false;
        }
        return true;
    }

    public static boolean isTextPhone(String aText) {
        try {
            isTextMatchesIO(aText,RegexIO.G_REGEX_PHONE,InvariableIO.nameExceptionPhone);
            OutputIO.println("Строка " + aText + " " + "Является Phone");
        } catch (ValidationExceptionStrings ex) {
            OutputIO.println(ex.getMessage());
            return false;
        }
        return true;
    }
}
