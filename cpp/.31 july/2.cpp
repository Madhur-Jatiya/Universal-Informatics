//object as an return type

#include<iostream>
using namespace std;


class Twonum
{
int x,y;
public:

void getTwonum()
{
cout<<"Enter x=";
cin>>x;
cout<<"ENter Y=";
cin>>y;
}

void putTwonum()
{
cout<<x<<":"<<y<<endl;
}

Twonum add(Twonum A)
{
Twonum j;

j.x=x+A.x;
j.y=y+A.y;

return j;
}
};

int main()
{
Twonum t1,t2,t3;

t1.getTwonum();
t2.getTwonum();

t3=t1.add(t2);

t1.putTwonum();
t2.putTwonum();
t3.putTwonum();




}

