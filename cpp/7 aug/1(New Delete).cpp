#include<iostream>
using namespace std;

int main()
{
int n,i;
cout<<"Enter size=";
cin>>n;

int *p=new int[n];

for(i=0;i<n;i++)
{
cout<<"Enter value=";
cin>>*(p+i);
}

for(i=0;i<n;i++)
{
cout<<*(p+i)<<endl;
}

delete[] p;
}
