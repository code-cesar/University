
#include "stdafx.h"

int factorial(int f) {
	return (f <= 0) ? (f < 0) ? 0 : 1 : factorial(f - 1); // ��������� ��������
}

class exp_tayler {
	int n;
	int x;
public:
	exp_tayler()
	{
		n = x = 0;
	}
	friend ostream& operator <<(ostream& out, exp_tayler& o);
	friend istream& operator >> (istream& in, exp_tayler& i);
};

ostream& operator <<(std::ostream& out, exp_tayler& o)
{
	out << "exp(x) = 1 ";
	for (int t = 1; t < o.n; t++) {
		out << " + " << pow(o.x, t) / factorial(t) << " ";
	}
	return out;
}
istream& operator >> (istream& in, exp_tayler& tayl) 
{
	cout << "������� n ������ ���������:" << endl;
	while (!(in >> tayl.n))
	{
		cout << "������� ���������� �������� n!:" << endl;
		in.clear();
		in.seekg(ios::end);
		in.ignore(EOF);
	}
	cout << "������� �������� x:\n";
	in.seekg(ios::end);
	in.ignore(EOF);
	while (!(in >> tayl.x)) 
	{
		std::cout << "������� ���������� �������� x!:" << endl;
		in.clear();
		in.seekg(ios::end);
		in.ignore(EOF);
	}
	return in;
}