package com.company.Msetting;
import com.company.Exception.ValidationException;
import com.company.IO.OutputIO;
import com.company.IO.MInputIO.GetDouble;
import com.company.IO.InvariableIO;
public class IMenuFormula implements IMenu {

    public double calculationFormula(double pointNumberOne,double pointNumberTwo,double pointNumberThree)throws ValidationException
    {
        if (pointNumberThree < InvariableIO.ZERO)throw new ValidationException("Знаменатель не может быть меньше " + InvariableIO.ZERO);
        return (pointNumberOne/pointNumberThree) + Math.pow(pointNumberTwo,2);
    }


    public void action()
    {
        double[] floatingPointNumber = new double[3];
        floatingPointNumber[0]  =  GetDouble.get("X");
        floatingPointNumber[1]  =  GetDouble.get("Y");
        floatingPointNumber[2]  =  GetDouble.get("Z");
        Double resultOfOperations = 0.0;
        while(true) {
            try {
                resultOfOperations = calculationFormula(floatingPointNumber[0], floatingPointNumber[1], floatingPointNumber[2]);
                OutputIO.printf("Результат X/Z + Y^2: %.2f \n",resultOfOperations);
                break;
            } catch (ValidationException ex) {
                floatingPointNumber[2] = GetDouble.get("Z");
            }
        }
        return;
    }

    public String getTitle()
    {
        return InvariableIO.nameIMenuFormula;
    }

}
