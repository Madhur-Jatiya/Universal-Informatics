//Encapsulation

#include<iostream>
using namespace std;


class Student
{
private:
int p,c,m,roll;

public:
Student()
{
roll=101;
p=23;
c=24;
m=25;
}

void show()
{
cout<<"Roll no="<<roll<<endl;
cout<<"Physics="<<p<<endl;
cout<<"Chemistry="<<c<<endl;
cout<<"Maths="<<m<<endl;
}
};




int main()
{
Student s;
s.p=89;//error
s.c=90;//error
s.m=91;//error

s.show();
}