#include<iostream>
using namespace std;
int main()
{
  int n,cnt = 0;
  cin>>n;
  cout<<n;
  for(int i=0;i<=100;i++)
  {
    if(n==1)
      break;
    if(n%2==0)
    {
      n=n/2;
      cnt=cnt+1;
      cout<<"\n"<<n;
     } 
     else
     {
       n=(3*n)+1;
       cnt=cnt+1;
       cout<<"\n"<<n;
      }
	}
  cout<<"\n"<<cnt;
 }