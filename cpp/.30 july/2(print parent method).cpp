//use of pointer to base class

#include<iostream>
using namespace std;

class Shape
{
public:
void draw()
{
    cout<<"A"<<endl;
}
};

class Circle:public Shape
{
public:
void draw()
{
    cout<<"B"<<endl;
}
};

class Square:public Shape
{
public:

void c()
{
    cout<<"C"<<endl;
}
};

class Triangle:public Shape
{
public:
void d()
{
    cout<<"D"<<endl;
}
};


int main()
{
//pointer to base class 
Circle ci;

Square sq;

Triangle tri;


Shape *s[]={&ci,&sq,&tri};

for(int i=0;i<3;i++)
    {
        s[i]->draw();
    }

}
