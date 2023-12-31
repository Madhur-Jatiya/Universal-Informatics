//nonstatic variable

#include<iostream>
using namespace std;

class Foo
{

public:
int x;

void m()
{
x=100;
cout<<x<<endl;
}
void n()
{
x=x+100;
cout<<x<<endl;
}
};


int main()
{
Foo f;
f.m();
f.n();
f.x=f.x+100;
cout<<f.x<<endl;
}