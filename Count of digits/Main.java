#include<iostream>
int main()
{
  int n,cnt=0;
  std::cin>>n;
  if(n==0)
  {
    n=1;
  }
  while(n>0)
  {
    n=n/10;
    cnt++;
  }
  std::cout<<cnt;
}