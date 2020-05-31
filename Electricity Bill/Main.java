#include<iostream>
using namespace std;
int main()
{
  int units,c;
  std::cin>>units;
  if(units<=200)
  {
    c=0.5*units;
  	std::cout<<"Rs."<<c;
  }
  else if(units<=400)
  {
    c=0.65*units;
    std::cout<<"Rs."<<c+100;
  }
  else if(units<=600)
  {
    c=0.80*units;
  	std::cout<<"Rs."<<c+200;
  }
  else
  {
    c=1.25*units;
  	std::cout<<"Rs."<<c+425;
  }
  
}