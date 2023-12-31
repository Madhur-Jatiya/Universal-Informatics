#include<iostream>
using namespace std;

class Foo
{
public:
Foo()
{
cout<<"This is Constructor"<<endl;
}
void m()
{
cout<<"This is method"<<endl;
}
~Foo()
{
cout<<"This is destructor"<<endl;
}
};

int main()
{
Foo f;
f.m();

}