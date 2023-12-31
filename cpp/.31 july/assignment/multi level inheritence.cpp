// assignment multilevel inheritance

#include <iostream>
using namespace std;

class student
{
int roll;
string name;
public:

void getStudent()
{
cout<<"Enter name= ";
cin>>name;
cout<<"Enter roll no.=";
cin>>roll;
}
void putStudent()
{
cout<<endl;    
cout<<name<<endl;
cout<<roll<<endl;
}
};
  
class Academic:public student
{
    public:
int physics,chemistry,maths;


void getAcademic()
{
cout<<"Enter physics marks=";
cin>>physics;
cout<<"Enter chemistry marks=";
cin>>chemistry;
cout<<"Enter maths marks=";
cin>>maths;
}

void putAcademic()
{
cout<<physics<<endl;
cout<<chemistry<<endl;
cout<<maths<<endl;
}
};

class Result:public Academic
{
public:
void show()
{
float per=(physics+chemistry+maths)/3;
cout<<"Percetage="<<per<<endl;
}
};

int main()
{
Result r;
r.getStudent();
r.getAcademic();
r.putStudent();
r.putAcademic();
r.show();
}



