#include<iostream>
using namespace std;
int main()
{
  int r,c,t;
  std::cin>>r;
  std::cin>>c;
  std::cin>>t;
  int t1=t%3;
  if(t1!=0)
    std::cout<<"It is a mango tree";
  else
    std::cout<<"It is not a mango tree";
  
}