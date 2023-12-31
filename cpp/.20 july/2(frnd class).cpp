//friend class

#include<iostream>
using namespace std;


class Foo
{
private:
void m()
{
cout<<"Hello I am private function of Foo class"<<endl;
}
friend class Doo;
};

class Doo
{
public:
void n()
{
Foo f;
f.m();
}
};

int main()
{
Doo d;
d.n();
}