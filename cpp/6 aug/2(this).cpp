#include<iostream>
using namespace std;


class Student
{
int roll,p,c,m;
public:
Student(int roll,int p,int c,int m)
{
this->roll=roll;
this->p=p;
this->c=c;
this->m=m;
show();
}

void show()
{
cout<<roll<<":"<<p<<":"<<c<<":"<<m<<endl;
}

};


int main()
{
Student s(101,12,13,14);

}