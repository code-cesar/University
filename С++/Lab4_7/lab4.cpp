
#include "stdafx.h"
#include <iostream>
using namespace std;

class mat_2x2 
{
	float elem[2][2];
public:
	void out_mat();
	void set_mat(int , int , float);
	mat_2x2 operator *(mat_2x2);
};
void mat_2x2::set_mat(int i, int j, float el)
{
	elem[i][j] = el;
}
mat_2x2 mat_2x2:: operator *(const mat_2x2 T)
{ 
	mat_2x2 R;
	R.elem[0][0] = elem[0][0] * T.elem[0][0] + elem[0][1] * T.elem[1][0];
	R.elem[0][1] = elem[0][0] * T.elem[0][1] + elem[0][1] * T.elem[1][1];

	R.elem[1][0] = elem[1][0] * T.elem[0][0] + elem[1][1] * T.elem[1][0];
	R.elem[1][1] = elem[1][0] * T.elem[0][1] + elem[1][1] * T.elem[1][1];

	return R;
}
void mat_2x2::out_mat()
{
	cout << "( " << elem[0][0] << "  " << elem[0][1] << " )" << endl;
	cout << "( " << elem[1][0] << "  " << elem[1][1] << " )" << endl;
}
int main()
{
	setlocale(LC_ALL, "Russian");
	cout << "Введите значении матрицы A(2x2):" << endl << endl;
	mat_2x2 A;
	for (int qw = 0; qw < 2; qw++)
	{
		for (int tr = 0; tr < 2; tr++)
		{

			float p = 0.0;
			cout << "Введите значения элемента  " << qw << "x" << tr << " :" << endl;
			while (!(cin >> p))
			{
				cout << "Ввёдено не вещественное число" << endl;
				cin.clear();
				cin.seekg(ios::end);
				cin.ignore(EOF);
				cout << "Введите повторно значения элемента  " << qw << "x" << tr << " :" << endl;
			}
			A.set_mat(qw,tr,p);
		}
	}
	cout << endl << "Введите значения матрицы B(2x2):" << endl << endl;
	mat_2x2 B;
	for (int qw = 0; qw < 2; qw++)
	{
		for (int tr = 0; tr < 2; tr++)
		{
			float p = 0.0;
			cout << "Введите значения элемента  " << qw << "x" << tr << " :" << endl;
			while (!(cin >> p))
			{
				cout << "Ввёдено не вещественное число" << endl;
				cin.clear();
				cin.seekg(ios::end);
				cin.ignore(EOF);
				cout << "Введите повторно значения элемента  " << qw << "x" << tr << " :" << endl;
			}
			B.set_mat(qw, tr, p);
		}
	}
	mat_2x2 T;
	T = A*B;
	cout << endl << "Матрица T: " << endl;
	T.out_mat();
	system("pause");
	return 0;
}