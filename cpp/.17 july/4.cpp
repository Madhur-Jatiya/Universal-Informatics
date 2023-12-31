//use of constructor for execute nonstatic method
#include<iostream>
using namespace std;


class Student
{
public:
int roll,p,c,m;
string name;

Student();
{
cout<<"Enter roll no=";
cin>>roll;
cout<<"Enter name=";
cin>>name;
cout<<"Enter phisics marks=";
cin>>p;
cout<<"Enter chemistry marks=";
cin>>c;
cout<<"Enter maths marks=";
cin>>m;
putStudent();
}

void putStudent()
{
cout<<"Roll no="<<roll<<endl;
cout<<"Name="<<name<<endl;
cout<<"Phisics="<<p<<endl;
cout<<"Chemistry="<<c<<endl;
cout<<"Maths="<<m<<endl;
}
};

int main()
{
Student s1,s2,s3;
}