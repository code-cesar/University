
#include "stdafx.h"
#include "fstream" 
#include <iostream>
using namespace std;
class sort {
private:
	int size_mas;
	char *str_sort;
public:
	bool read_file(ifstream&); // чтения файла,передаёться объект файла
	void sort_bubbly();
	void sort_inserts();
	void watch_mas();
	~sort(){ // десконструктор
		delete [] str_sort;
	}
};

bool sort::read_file(ifstream& f)
{
	f >> size_mas; // чтение первого символа,то есть кол-во элементов в массиве
	str_sort = new char[size_mas +1]; // выделение памети для этого всего
	for (int tr = 0; tr < size_mas; tr++)
	{
		f >> str_sort[tr]; // берём символ из файла и записываем в переменную,разделяет через пробел
		if (!(str_sort[tr] >= 'A' && str_sort[tr] <= 'Z' ||
			str_sort[tr] >= 'a' && str_sort[tr] <= 'z')) // проверка на латинский алфавит
		{
			cout << "Символ "<< str_sort[tr] << "  не латинская буква " << endl;
			return 0;// возвращаем ошибку
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
			if (str_sort[j - 1] < str_sort[j]) // заменил знак > на < получил обратный порядок
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
		for (int j = i - 1; (j >= 0) && (a > str_sort[j]); j--) // заменил < на > получил обратный порядок
		{
			str_sort[j + 1] = str_sort[j];
			str_sort[j] = a;
		}
	}
}
void sort::watch_mas()
{
	cout << "Массив:";
	for (int tr = 0; tr < size_mas; tr++)cout << str_sort[tr] << " ";
	cout << endl;
}
int main()
{
	setlocale(LC_ALL, "Russian");
	ifstream fin;
	fin.open("text.txt");
	if (!fin)cout << "Файл не открыт" << endl;
	else
	{
		sort ur;
		if (ur.read_file(fin))
		{
			ur.watch_mas();
			ur.sort_inserts();
			cout << "А)Сортировка в обратном лексикографическом порядке методом вставками:" << endl;
			ur.watch_mas();
			fin.seekg(ios::beg);//Возвращаюсь на начало файла
			if (ur.read_file(fin))
			{
				ur.watch_mas();
				ur.sort_bubbly();
				cout << "Б)Сортировка в обратном лексикографическом порядке методом обмена:" << endl;
				ur.watch_mas();
			}
			else cout << "Прочитать файл невозможно" << endl;
		}
		else cout << "Прочитать файл невозможно" << endl;
	}
	fin.close();
	system("pause");
    return 0;
}

