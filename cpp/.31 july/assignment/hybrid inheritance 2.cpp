#include<iostream>
using namespace std;

class A
{
public:
A()
{
cout<<"Hello i am A"<<endl;
}
};

class B:public virtual A
{
public:
B()
{
cout<<"Hello i am B"<<endl;
}
};

class C:public virtual A
{
public:
C()
{
cout<<"Hello i am C"<<endl;
}
};

class D:public B,public C
{
public:
D()
{
cout<<"Hello i am D"<<endl;
}
};


int main()
{
D d;
}