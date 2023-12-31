//virtual function , run time polymosphism, pointer to base class

#include<iostream>
using namespace std;

class Foo
{
public:
virtual void m()
{
cout<<"Hello Foo"<<endl;
}
};

class Doo:public Foo
{
public:
void m()
{
cout<<"Welcome Doo"<<endl;
}
};

int main()
{

Foo *f;//pointer type object of parent class
Doo d;

//storing address of child class object into patent class object type pointer


f=&d;

f->m();

}