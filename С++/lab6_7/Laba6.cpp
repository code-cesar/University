// Laba6.cpp: определяет точку входа для консольного приложения.
//

#include "stdafx.h"
#include "exp_tayler.h"


int main()
{
	setlocale(LC_ALL, "Russian");
	exp_tayler t;
	cout << "Программа выводит на экран n первых слагаемых формулы Тейлора" << endl;
	cout << "exp(x) = 1 + x/1! + x^2/2! + x^3/3! + x^4/4!......" << endl << endl;
	cin >> t;
	cout << t;
	system("pause");
}