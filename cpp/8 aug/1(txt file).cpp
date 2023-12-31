#include<iostream>
#include<fstream>
using namespace std;

int main()
{
ofstream fout("Hello.txt");

fout<<"Welcome"<<endl;
cout<<"File has created"<<endl;
}