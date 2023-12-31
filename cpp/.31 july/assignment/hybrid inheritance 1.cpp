#include<iostream>
using namespace std;

class a
{
public:

a()
{
        cout<<"hyy i am a"<<endl;}
        
};

class b:public a
{
public:
    b()
    {
        cout<<"hyy i am b"<<endl;
    }   
};


class c
{
public:

   c()
    {
        cout<<"hyy i am c"<<endl;
    }

    
};

class d:public b,public c
{
public:
  
  d()
    {
        cout<<"hyy i am d"<<endl;
    }
        
};


int main()
{
d i;
}