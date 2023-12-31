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
cout<<"Withdraw completed"<<endl;
}
void deposit(int x)
{
bal=bal+x;
cout<<"Deposit completed"<<endl;
}
void showbalance()
{
cout<<"Balance="<<bal<<endl;
}
};


int main()
{
Bank b1,b2,b3;
int select,con;

do
{
cout<<"Enter 1 for deposit,2 for withdraw and 3 for show balance=";
cin>>select;


if(select==1)
{
b1.deposit(2000);
}
else if(select==2)
{
b2.withdraw(2000);
}
else if(select==3)
{
b3.showbalance();
}
else
{
cout<<"pls select between 1 2 and 3"<<endl;
}

cout<<"Enter 1 for continue and any other key for discontinue=";
cin>>con;

}
while(con==1);
}