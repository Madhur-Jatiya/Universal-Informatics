//pure virtual function
#include<iostream>
using namespace std;


class Foo
{
public:

void m()
{
cout<<"Hello all"<<endl;
}

virtual void n()=0;
};


class Doo:public Foo
{
public:
void n()
{
cout<<"welcome"<<endl;
}
};


int main()
{
Doo d;
d.m();
d.n();
}