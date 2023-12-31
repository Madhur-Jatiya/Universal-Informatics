//program for share static int

#include<iostream>
using namespace std;

class Foo
{
static int x;
public:
void m()
{
cout<<x<<endl;
x++;
}
};

int Foo::x=100;

int main()
{
Foo f1,f2,f3;
f1.m();
f2.m();
f3.m();
}






