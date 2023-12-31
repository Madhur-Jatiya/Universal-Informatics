//method overloading

#include<iostream>
using namespace std;

class Foo
{
public:

void m()
{
cout<<"hello"<<endl;
}

void m(int a,int b)
{
int c=a+b;
cout<<"Add="<<c<<endl;
}

void m(int p,int r,int t)
{
int si=p*r*t/100;
cout<<"Simple Interest="<<si<<endl;
}
};


int main()
{
Foo f;
f.m(10,20);
f.m();
f.m(10000,2,3);
}