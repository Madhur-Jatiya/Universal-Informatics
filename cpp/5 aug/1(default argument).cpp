//default argument

#include<iostream>
using namespace std;

void add(int a,int b,int c=0,int d=0)
{
int e=a+b+c+d;
cout<<"Value="<<e<<endl;
}

int main()
{
add(10,20,30,40);
add(10,20,30);
add(10,20);
}