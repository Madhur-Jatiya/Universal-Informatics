#include<iostream>
using namespace std;

namespace var
{
int x=12;
};

namespace arr
{
int x[]={12,11,32,24};
};

namespace fun
{
void x()
{
cout<<"Hello"<<endl;
}
};

int main()
{
cout<<"Value of variable="<<var::x<<endl;
cout<<"value="<<arr::x[2]<<endl;
fun::x();
}



