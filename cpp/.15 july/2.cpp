//use of non-static variable
#include<iostream>
using namespace std;


class Student
{
public:
int roll,p,c,m;
string name;

void getStudent()
{
cout<<"Enter roll no=";
cin>>roll;
cout<<"Enter name=";
cin>>name;
cout<<"Enter Physics marks=";
cin>>p;
cout<<"Enter Chemistry marks=";
cin>>c;
cout<<"Enter Maths marks=";
cin>>m;
}
void putStudent()
{
cout<<"Roll no="<<roll<<endl;
cout<<"Name="<<name<<endl;
cout<<"Physics="<<p<<endl;
cout<<"Chemistry="<<c<<endl;
cout<<"MAths="<<m<<endl;
}
};


int main()
{
Student s;
s.getStudent();
s.putStudent();
}