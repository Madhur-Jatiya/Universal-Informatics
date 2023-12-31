//unary operator overloading

#include<iostream>
using namespace std;

class Number
{
int x,y,z;
public:
Number()
{
cout<<"Enter values=";
cin>>x>>y>>z;
}
void show()
{
cout<<x<<","<<y<<","<<z<<endl;
}

void operator -()
{
x=-x;
y=-y;
z=-z;
}
};

int main()
{
Number n;

n.show();


-n;

n.show();
}