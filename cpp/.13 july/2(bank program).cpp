//bank program example

#include<iostream>
using namespace std;

class Bank
{
public:
int bal;

Bank()
{
bal=5000;
}

void withdraw(int x)
{
bal=bal-x;
cout<<bal<<endl;
}
void deposit(int x)
{
bal=bal+x;
cout<<bal<<endl;
}
void showbalance()
{
cout<<"Balance="<<bal<<endl;
}
};


int main()
{
Bank b1,b2,b3;
int select,con,a,b;

cout<<"Enter 1 for withdraw,2 for deposit and 3 for show balance=";
cin>>select;

if(select==1)
{
cout<<"amount of withdraw=";
cin>>a;
b1.withdraw(a);
}
else if(select==2)
{
b2.deposit(b);
cout<<"amount of deposite=";
cin>>b;
}
else if(select==3)
{
b3.showbalance();
}
else
{
cout<<"pls select between 1 2 and 3"<<endl;
}
}