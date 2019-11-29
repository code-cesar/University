#pragma once
#include "stdafx.h"
class Transport
{
protected:
	char* Firm;
	char* Marka;
	int YearB;
public:
	Transport()
	{
		this->YearB = 0;
		this->Firm = "";
		this->Marka = "";
	}
	Transport(int y, char* f, char* m)
	{
		this->YearB = y;
		this->Firm = f;
		this->Marka = m;
	}
	void  Print(int,ofstream& f);
	void  ChangeF(char*);
	void  ChangeM(char*);
	void  ChangeY(int);
};

class Train : public Transport
{
	int Vagon;
public:
	Train() : Transport()
	{
		this->Vagon = 0;
	}
	Train(char*nam, char* mark, int yearb, int vag) :
		Transport(yearb, nam, mark)
	{
		 this->Vagon = vag;
	}
	void ChangeV(int);
	void Print(int, ofstream&);
};

class AirBus : public Transport
{
	int seat;
public:
	AirBus() : Transport()
	{
		this->seat = 0;
	}
	AirBus(char* nam, char* mark, int yearb, int se) :
		Transport(yearb, nam, mark)
	{
		this->seat = se;
	}
	void ChangeS(int);
	void Print(int,ofstream&);
};