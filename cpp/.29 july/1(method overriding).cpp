//method overriding but not run time polymophism.

#include<iostream>
using namespace std;

class Foo
{
public:

int m(int a,int b)
{
int c=a+b;
return c;
}
};


class Doo:public Foo
{
public:

int m(int a,int b)
{
int c=a*b;
return c;
}
};

int main()
{
Doo d;
int k=d.m(10,20);
cout<<"VAlue="<<k<<endl;
}



