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

using namespace fun;
int main()
{
//cout<<"Value of variable="<<x<<endl;
//cout<<"value="<<x[2]<<endl;
x();
}



