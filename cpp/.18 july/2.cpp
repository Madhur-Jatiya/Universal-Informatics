//frnd function

#include<iostream>
using namespace std;


class Rectangle
{
private:
int l,b;
public:

Rectangle()
{
cout<<"Enter length=";
cin>>l;
cout<<"Enter breadth=";
cin>>b;
}
friend void area();
};


void area()
{
Rectangle r;
int a=r.l*r.b;
cout<<"Area="<<a<<endl;
}


int main()
{
area();
}






