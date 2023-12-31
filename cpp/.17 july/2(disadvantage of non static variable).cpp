//disadvantage of initialization non static variable in method
#include<iostream>
using namespace std;

class Square
{
public:
int side;
void area()
{
side=100;
int a=side*side;
cout<<"Area="<<a<<endl;
}
void perimeter()
{
int p=4*side;
cout<<"Perimeter="<<p<<endl;
}
};


int main()
{
int x;
Square s;

cout<<"Enter 1 for square area and 2 for square paramter=";
cin>>x;

if(x==1)
{
s.area();
}
else if(x==2)
{
s.perimeter();
}
else
{
cout<<"pls enter between 1 and 2"<<endl;
}
}