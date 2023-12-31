//binary oprator assignment 

#include<iostream>
using namespace std;

class Time
{
public:
int h,m,s;

void getTime()
{
cout<<"Enter hour=";
cin>>h;
cout<<"Enter minute=";
cin>>m;
cout<<"Enter second=";
cin>>s;
}


void putTime()
{
cout<<h<<endl;
cout<<m<<endl;
cout<<s<<endl;
}


Time operator +(Time A)
{
Time j;
j.h=h+A.h;
j.m=m+A.m;
j.s=s+A.s;
return j;
}
};

int main()
{
Time t1,t2,t3;

cout<<"Enter time for 1st day"<<endl;
t1.getTime();
cout<<endl;
cout<<"Enter time for 1st day"<<endl;
t2.getTime();

t3=t1+t2;

t3.putTime();

}
