#include<iostream>
using namespace std;

class student
{
public:
int roll;
string name;

int getstudent()
{
cout<<"Enter name=";
cin>>name;
cout<<"Enter roll no.=";
cin>>roll;
}

int putstudent()
{
cout<<""<<endl;
cout<<""<<endl;

cout<<"Name="<<name<<endl;
cout<<"Roll no.="<<roll<<endl;
}
};

class Academic:public student
{
public:
int physics,chemistry,maths;

int getAcademic()
{
cout<<"Entre physics marks=";
cin>>physics;
cout<<"Entre chemistry marks=";
cin>>chemistry;
cout<<"Entre maths marks=";
cin>>maths;
}


int putAcademic()
{
cout<<"Physics marks="<<physics<<endl;
cout<<"Chemistry marks="<<chemistry<<endl;
cout<<"Maths marks="<<maths<<endl;
}
};


int main()
{
Academic m;
m.getstudent();
m.getAcademic();
m.putstudent();
m.putAcademic();
}#include<iostream>
using namespace std;

class student
{
public:
int roll;
string name;

int getstudent()
{
cout<<"Enter name=";
cin>>name;
cout<<"Enter roll no.=";
cin>>roll;
}

int putstudent()
{
cout<<""<<endl;
cout<<""<<endl;

cout<<"Name="<<name<<endl;
cout<<"Roll no.="<<roll<<endl;
}
};

class Academic:public student
{
public:
int physics,chemistry,maths;

int getAcademic()
{
cout<<"Entre physics marks=";
cin>>physics;
cout<<"Entre chemistry marks=";
cin>>chemistry;
cout<<"Entre maths marks=";
cin>>maths;
}


int putAcademic()
{
cout<<"Physics marks="<<physics<<endl;
cout<<"Chemistry marks="<<chemistry<<endl;
cout<<"Maths marks="<<maths<<endl;
}
};


int main()
{
Academic m;
m.getstudent();
m.getAcademic();
m.putstudent();
m.putAcademic();
}