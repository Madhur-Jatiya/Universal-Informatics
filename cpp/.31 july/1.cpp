//object as an argument

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
cout<<x<<","<<y<<endl;
}

void add(Twonum A,Twonum B)
{
x=A.x+B.x;
y=A.y+B.y;
}
};

int main()
{
Twonum t1,t2,t3;

t1.getTwonum();
t2.getTwonum();

t3.add(t1,t2);


t1.putTwonum();
t2.putTwonum();
t3.putTwonum();




}

