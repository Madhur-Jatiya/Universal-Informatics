#include<iostream>
using namespace std;

class Student
{
int roll;
string name;
float percentage;


public:
void setRoll(int r)
{
roll=r;
}

void setName(string n)
{
name=n;
}

void setPercentage(float per)
{
percentage=per;
}

int getRoll()
{
return roll;
}


string getName()
{
return name;
}

float getPercentage()
{
return percentage;
}
};


int main()
{
Student s;

s.setRoll(101);
s.setName("ramlal");
s.setPercentage(12.3);

int roll=s.getRoll();
string name=s.getName();
float per=s.getPercentage();

cout<<roll<<":"<<name<<":"<<per<<endl;
}