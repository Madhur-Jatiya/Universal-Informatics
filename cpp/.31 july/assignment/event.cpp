//Constructor Assignment

#include<iostream>
using namespace std;

class Event
{
    public:
string name,clgname,date;


Event()
{
cout<<"Enter name=";
cin>>name;

cout<<"Enter clgname=";
cin>>clgname;

cout<<"Enter date=";
cin>>date;
}

void m()
{
cout<<name<<endl;
cout<<clgname<<endl;
cout<<date<<endl;

}


void dance()
{
    cout<<endl;
    m();
cout<<"U have participated in dance compitition";
}

void sing()
{
    cout<<endl;
    m();
cout<<"participated in singing compitition";
}

void quiz()
{
    cout<<endl;
    m();
cout<<"participated in quiz comptition";
} 
};



int main()
{
    int x;

Event e;

cout<<"Enter 1 for dance,2 for singing and 3 for quiz compt. certificate=";
cin>>x;
    
if(x==1)
{
e.dance();
}

else if(x==2)
{
e.sing();
}

else if(x==3)
{
e.quiz();
}

}