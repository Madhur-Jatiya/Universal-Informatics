//operator overloading

#include<iostream>
using namespace;

class Foo
{
public:

void oprator +()
{
cout<<"Hello"<<endl;
}
};

int main()
{
Foo f
+f;
}