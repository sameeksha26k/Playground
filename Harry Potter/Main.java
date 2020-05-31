#include<iostream>
using namespace std;
int main()
{
  int n,a,b;
  std::cin>>n;
  a=n/1000;
  b= n%10;
  std::cout<<a+b;
}