//static variable

#include<iostream>
using namespace std;

class Foo
{	
public:
static int x;
	
void m()
	{
		cout<<x<<endl;
	}
	
void n()
	{
		x=x+100;
		cout<<x<<endl;
	}
};


int Foo::x=100;

int main()
	{
		Foo f;
		f.m();
		f.n();
		Foo::x=Foo::x+100;
		cout<<Foo::x<<endl;
	}