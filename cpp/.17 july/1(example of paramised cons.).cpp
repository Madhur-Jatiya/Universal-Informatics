//Parameterized constructor
#include<iostream>
using namespace std;

class Foo
{
public:
Foo(int a,int b)
{
int c=a+b;
cout<<"Addition="<<c<<endl;
}
};

int main()
{
Foo f1(10,20),f2(100,200),f3(1000,2000);
}