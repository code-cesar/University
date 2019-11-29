#include "stdafx.h"

void Transport::Print(int year,ofstream& f)
{
	f << this->Firm << " " << this->Marka << " " << this->YearB << endl;
	delete[] Firm;
	delete[] Marka;
}
void Transport::ChangeF(char* name)
{
	this->Firm = name;
}
void Transport::ChangeM(char* mar)
{
	this->Marka = mar;
}
void Transport::ChangeY(int t)
{
	this->YearB = t;
}
void Train::ChangeV(int v)
{
	this->Vagon = v;
}
void Train::Print(int tr, ofstream& f)
{
	if(tr >= YearB) f << this->Firm << " " << this->Marka << " " << this->YearB << " " << this->Vagon << endl;
	else f << this->Firm << " " << this->Marka << " " << "еще не сформирован" << " " << this->Vagon << endl;
}

void AirBus::ChangeS(int v)
{
	this->seat = v;
}
void AirBus::Print(int tr,ofstream& f)
{
	if (tr >= YearB)
	{
		if ((tr-YearB) > 20)f << this->Firm << " " << this->Marka << " " << "Летать нельзя!" << " " << this->seat << endl;
		else f << this->Firm << " " << this->Marka << " " << this->YearB << " " << this->seat << endl;
	}
	else f << this->Firm << " " << this->Marka << " " << "еще не сформирован" << " " << this->seat << endl;
}