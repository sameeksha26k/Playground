#include<iostream>
using namespace std;
int main()
{
  int n,a=0,b =1,tmp;
  cin>>n;
  for(int i =2;i<n;i++)
  {
    tmp=a+b;
    a = b;
    b = tmp;
    
     
   }
  cout<<tmp;
}