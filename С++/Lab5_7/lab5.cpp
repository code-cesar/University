
#include "stdafx.h"
int main()
{
	setlocale(LC_ALL, "Russian");
	ifstream f;
	f.open("input.txt",ios::in);
	if (!f)cout << "Файл не открыт" << endl;
	else
	{
		f.seekg(ios::beg);
		int years;
		f >> years;
		streamoff leng = f.tellg();
		int train_cs = 0, airbus_cs = 0;
		char c;
		cout << "Текущий год: " << years << endl;
		do {
			f >> c;
			if (c == 'П')
			{
				train_cs = train_cs + 1;
			}
			else if (c == 'С')
			{
				airbus_cs = airbus_cs + 1;
			}
			f.ignore(518, '\n');
		} 
		while (!f.eof());

		const int all_train_airbus = train_cs + airbus_cs;
		f.seekg(leng);
		Transport* _transport = new Transport[all_train_airbus];
		Train* _train = new Train[train_cs];
		AirBus* _airbus = new AirBus[airbus_cs];
		int counts_all = 0,
			counts_train = 0,
			counts_airbus = 0;
		do 
		{
			f >> c;
			char* firm = new char[64], 
				*mark = new char[64];
			int year_strt, counts;
			f >> firm >> mark >> year_strt >> counts;
			cout << c << " " << firm << " " << mark << " " << year_strt << " " << counts << endl;
			_transport[counts_all] = Transport(year_strt, firm, mark);
			if (c == 'П')
			{
				_train[counts_train] = Train(firm, mark, year_strt, counts);
				counts_train++;
			}
			else if (c == 'С')
			{
				_airbus[counts_airbus] = AirBus(firm, mark, year_strt, counts);
				counts_airbus++;
			}
			f.ignore(518, '\n');
			counts_all++;

		} 
		while (!f.eof() && 
			counts_all <= all_train_airbus
			&& counts_train <= train_cs && counts_airbus <= airbus_cs);

		ofstream train_file;
		train_file.open("Train.txt", ios::out | ios::trunc);
		for (int re = 0; re < counts_train; re++)
		{
			_train[re].Print(years, train_file);
		}
		train_file.close();

		ofstream AirBus_file;
		AirBus_file.open("AirBus.txt", ios::out | ios::trunc);
		for (int re = 0; re < counts_airbus; re++)
		{
			_airbus[re].AirBus::Print(years, AirBus_file);
		}
		AirBus_file.close();

		ofstream Transport_file;
		Transport_file.open("Transport.txt", ios::out | ios::trunc);
		for (int re = 0; re < all_train_airbus; re++)
		{
			_transport[re].Transport::Print(years, Transport_file);
		}
		Transport_file.close();
		

		delete[] _transport;
		delete[] _train;
		delete[] _airbus;
	}
	f.close();
	system("pause");
	return 0;
}