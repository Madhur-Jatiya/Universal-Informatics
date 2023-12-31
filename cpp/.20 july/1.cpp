#include<iostream>
using namespace std;

class Foo
{
public:
void m()
{
cout<<"Hello I am private function"<<endl;
}
};

void fun()
{
Foo f;
f.m();
}

int main()
{
fun();
}