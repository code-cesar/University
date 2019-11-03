// ConsoleApplication8.cpp: ���������� ����� ����� ��� ����������� ����������.
//

#include "stdafx.h"
#include "fstream" // ���������� ����������
#include <iostream>
using namespace std;
class sort {
private:
	int size_mas;
	char *str_sort;
public:
	bool read_file(ifstream&); // ������ �����,���������� ������ �����
	void sort_bubbly();
	void sort_inserts();
	void watch_mas();
	~sort(){ // ��������������
		delete [] str_sort;
	}
};

bool sort::read_file(ifstream& f)
{
	f >> size_mas; // ������ ������� �������,�� ���� ���-�� ��������� � �������
	str_sort = new char[size_mas +1]; // ��������� ������ ��� ����� �����
	for (int tr = 0; tr < size_mas; tr++)
	{
		f >> str_sort[tr]; // ���� ������ �� ����� � ���������� � ����������,��������� ����� ������
		if (!(str_sort[tr] >= 'A' && str_sort[tr] <= 'Z' ||
			str_sort[tr] >= 'a' && str_sort[tr] <= 'z')) // �������� �� ��������� �������
		{
			cout << "������ "<< str_sort[tr] << " �� ��������� ����� " << endl;
			return 0;// ���������� ������
		}
	}
	return 1;
}
void sort::sort_bubbly()
{
	char a;
	for (int i = 1; i < size_mas; ++i)
	{
		for (int j = size_mas - 1; j >= i; --j)
		{
			if (str_sort[j - 1] < str_sort[j]) // ������� ���� > �� < ������� �������� �������
			{
				a = str_sort[j - 1];
				str_sort[j - 1] = str_sort[j];
				str_sort[j] = a;
			}
		}
	}
}
void sort::sort_inserts()
{
	char a;
	for (int i = 1; i < size_mas; ++i)
	{
		a = str_sort[i];
		for (int j = i - 1; (j >= 0) && (a > str_sort[j]); j--) // ������� < �� > ������� �������� �������
		{
			str_sort[j + 1] = str_sort[j];
			str_sort[j] = a;
		}
	}
}
void sort::watch_mas()
{
	cout << "������:";
	for (int tr = 0; tr < size_mas; tr++)cout << str_sort[tr] << " ";
	cout << endl;
}
int main()
{
	setlocale(LC_ALL, "Russian");
	ifstream fin;
	fin.open("text.txt");
	if (!fin)cout << "���� �� ������" << endl;
	else
	{
		sort ur;
		if (ur.read_file(fin))
		{
			ur.watch_mas();
			ur.sort_inserts();
			cout << "�)���������� � �������� ������������������ ������� ������� ���������:" << endl;
			ur.watch_mas();
			fin.seekg(ios::beg);
			if (ur.read_file(fin))
			{
				ur.watch_mas();
				ur.sort_bubbly();
				cout << "�)���������� � �������� ������������������ ������� ������� ������:" << endl;
				ur.watch_mas();
			}
			else cout << "��������� ���� ����������" << endl;
		}
		else cout << "��������� ���� ����������" << endl;
	}
	fin.close();
	system("pause");
    return 0;
}

