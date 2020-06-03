package com.company;
import com.company.Msetting.*;

public class Main {
    public static void main(String[] args) {

        while(true)
        {
            Menu.print();
            IMenu IMenuSelected = Menu.getSelectedIMenu();
            IMenuSelected.action();
        }
    }
}