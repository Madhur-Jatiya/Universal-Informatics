//method overriding but not run time polymophism.

#include<iostream>
using namespace std;

class Foo
{
public:

int m(int a,int b)
{
int c=a+b;

}
};


class Doo:public Foo
{
public:

int m(int a,int b)
{
int c=a*b;

}
};

int main()
{
    int x,y;
cout<<"Enter value of x";
cin>>x;
cout<<"Enter value of y";
cin>>y;

Doo d;
int k=d.m(x,y);
cout<<"VAlue="<<k<<endl;
}



