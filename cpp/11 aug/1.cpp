#include<iostream>
#include<fstream>
using namespace std;

int main()
{
float p,r,t,si;

cout<<"Enter principle=";
cin>>p;
cout<<"Enter rate=";
cin>>r;
cout<<"Enter time=";
cin>>t;

si=p*r*t/100;

cout<<"Simple Interest="<<si<<endl; 

ofstream fout;
fout.open("SI.txt",ios::app);

fout<<"Simple Interest="<<si<<endl;
cout<<"File has created and data has writed"<<endl;
}
