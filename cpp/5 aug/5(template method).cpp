//template method

#include<iostream>
using namespace std;

class Foo
{

public:
template<class T,class U>

void m(T a,U b)
{
cout<<a<<","<<b<<endl;
}
};

int main()
{
Foo f;
f.m(10,20.5);
f.m("ram",12.3);
}