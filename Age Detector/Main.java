#include<iostream>
using namespace std;
int main()
{
  int x,y,o;
  std::cin>>x;
  std::cin>>y;
  if(y==00)
  {
    o=100-x;   
    cout<<o;
  }
  else if(y<x){
    y=100+y;
    o = y-x;
    cout<<o;
  }
  else
    cout<<y-x;
}
  