#include<iostream>
using namespace std;
int main()
{
  int x1,y1,x2,y2,x3,y3;  
  std::cin>>x1;
  std::cin>>y1;
  std::cin>>x2;
  std::cin>>y2;
  std::cin>>x3;    
  std::cin>>y3;
  float a = (x1+x2+x3)/3.0;
  float b = (y1+y2+y3)/3.0;
  std::cout<<a<<"\n"<<b;  
}