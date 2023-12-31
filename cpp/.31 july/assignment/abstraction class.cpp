#include<iostream>
using namespace std;

class foo
{
public:
  void m ()
  {
cout << "Hyy" << endl;
  }

  void virtual weapon () = 0;
};

class gun:public foo
{
public:
  void weapon ()
{
    cout << "You purchase gun" << endl; 
}
};

class boomb:public foo
{
public:
  void weapon ()
{
    cout << "You purchase boomb" << endl;
}
};

class machinegun:public foo
{
public:
  void weapon ()
{
    cout << "You purchase machine gun" << endl; 
}
};

int main ()
{
int x;
  cout << "Enter 1 for gun 2 for boomb 3 for mg=";  
  cin >> x;

if (x == 1)
   {
     gun gn;
     gn.weapon ();
    }

 else if (x == 2)
  
  {
   boomb bm;
   bm.weapon ();   
  }

 else if (x == 3)   
 {
    machinegun mg;
    mg.weapon ();   
 }
 
 else
 {
 	cout<<"Please enter correct no.";
 }
}

