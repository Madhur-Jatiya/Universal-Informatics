//template function

#include<iostream>
using namespace std;


template<typename T,typename U>


void m(T a,U b)
{
cout<<a<<","<<b<<endl;
}


int main()
{
m(10,20.5);
m('a',12);
m(12.67,'k');
m("Ankit",123);
}