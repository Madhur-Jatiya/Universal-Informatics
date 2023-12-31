//constructor call its parent class constructor first then //after it will execute itself.

#include<iostream>
using namespace std;

class Raj
{
public:
Raj()
{
cout<<"Raj Kapoor"<<endl;
}
};

class Rishi:public Raj
{
public:
Rishi()
{
cout<<"Rishi Kapoor"<<endl;
}
};

class Ranbir:public Rishi
{
public:
Ranbir()
{
cout<<"Ranbir Kapoor"<<endl;
}
};

int main()
{
Ranbir r;
}