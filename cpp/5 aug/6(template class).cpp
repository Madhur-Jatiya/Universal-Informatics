//template class

#include<iostream>
using namespace std;

template<class T,class U>

class Foo
{

public:
void m(T a,U b)
{
cout<<a<<","<<b<<endl;
}
};

int main()
{
Foo<int,float> f1;
f1.m(10,20.5);
f1.m(13,34.5);

Foo<char,float> f2;
f2.m('s',12.6);


}