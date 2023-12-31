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

class Doo:public Foo
{
//copy as a protected
};


class Too:public Doo
{
public:
void n()
{
m();
}
}

int main()
{
Too t;
t.n();
}



