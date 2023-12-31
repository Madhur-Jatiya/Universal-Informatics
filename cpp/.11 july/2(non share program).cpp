//program for not share nonstatic int

#include<iostream>
using namespace std;

	class Foo
		{
			public:
			
			int x;
			
			void m()
				{
  
					cout<<x<<endl;
					x++;
				}
		};



		int main()
			{
				Foo f1,f2,f3;

				f1.m();
		f1.x=100;
				f2.m();
				f3.m();

			}






