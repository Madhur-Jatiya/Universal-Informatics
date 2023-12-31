//Hierarchichal inheritance

#include<iostream>
using namespace std;

class College
{
public:
string name,email,mob;

College()
{
cout<<"Enter name=";
cin>>name;
cout<<"Enter email=";
cin>>email;
cout<<"Enter mobile no.=";
cin>>mob;
}

void putCollege()
{
cout<<name<<endl;
cout<<email<<endl;
cout<<mob<<endl;
}
};


class BTech:public College
{
public:
int physics,chemistry,maths;

BTech()
{
cout<<"Enter physics marks=";
cin>>physics;
cout<<"Enter chemistry marks=";
cin>>chemistry;
cout<<"Enter maths marks=";
cin>>maths;
}

void putBtech()
{
putCollege();
cout<<physics<<endl;
cout<<chemistry<<endl;
cout<<maths<<endl;

float per=(physics+chemistry+maths)/3;
cout<<"Percetage="<<per<<endl;


if(per>=70)
{
cout<<"addmission confirm";
}

else 
{
cout<<"addmission not confirm";
}

}
};


class Bcom:public College
{
public:
int eco,mang,acc;

Bcom()
{
cout<<"Enter eco marks=";
cin>>eco;
cout<<"Enter mang marks=";
cin>>mang;
cout<<"Enter acc marks=";
cin>>acc;
}

void putBcom()
{
putCollege();
cout<<eco<<endl;
cout<<mang<<endl;
cout<<acc<<endl;

float per=(eco+mang+acc)/3;
cout<<"Percetage="<<per<<endl;

if(per>=70)
{
cout<<"addmission confirm";
}

else 
{
cout<<"addmission not confirm";
}

}
};


class BA:public College
{
public:
int his,civ,geo;

BA()
{

cout<<"Enter his marks=";
cout<<"Enter civ marks="<<endl;
cout<<"Enter geo marks="<<endl;
}

void putBA()
{
putCollege();
cout<<his<<endl;
cout<<civ<<endl;
cout<<geo<<endl;

float per=(his+civ+geo)/3;
cout<<"Percetage="<<per<<endl;


if(per>=70)
{
cout<<"addmission confirm";
}

else 
{
cout<<"addmission not confirm";
}

}
};



int main()
   {
	int x;
	cout<<"Enter 1 for BTech ,2 for Bcom and 3 for BA addmission";
	cin>> x;


	if(x==1)
	  {
	BTech bt;
	bt.putBtech();
	  }

	else if(x==2)
	  {
	Bcom bc;
	bc.putBcom();
	  }

	else if(x==3)
	  {
	BA ba;
	ba.putBA();
           	  }

	else
  	  { 
 	cout<<"Enter 1,2 or 3 only";
	  }
   }

