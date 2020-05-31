#include<iostream>
using namespace std;
int main()
{
  int x,y,z;
  double intr,amt,disc,finl; 
  std::cin>>x;
  std::cin>>y;
  std::cin>>z;
  intr = (x*y*z)/100;
  amt = x+intr;
  disc = intr*2/100;
  finl = x+intr-disc;
  std::cout<<intr<<endl;
  std::cout<<amt<<endl;
  std::cout<<disc<<endl;
  std::cout<<finl<<endl;
  
  
  //Type your code here.
}