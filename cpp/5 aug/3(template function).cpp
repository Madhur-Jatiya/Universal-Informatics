//template function

#include<iostream>
using namespace std;


template<typename T>


void m(T a,T b)
{
cout<<a<<","<<b<<endl;
}


int main()
{
m(10,20);
m(10.5,20.6);
m('a','s');
}