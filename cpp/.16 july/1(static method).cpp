//static method
#include<iostream>
using namespace std;

class Foo
{
public:
static void m()
{
cout<<"Hello static method"<<endl;
}
};

int main()
{
Foo::m();
}