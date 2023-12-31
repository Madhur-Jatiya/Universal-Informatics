#include<iostrream>
using namespace std;


class Foo
{
protected:
void m()
{
cout<<"hello"<<endl;
}
};

class Doo:private Foo
{
public:
void n()
{
m();
}
};


int main()
{
Doo d;
d.n();
}



