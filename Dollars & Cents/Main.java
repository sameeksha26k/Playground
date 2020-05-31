#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int d1,d2,c1,c2,sd,cd;
  std::cin>>d1>>c1>>d2>>c2;
  sd =d1+d2;
  cd=c1+c2;
  while(cd>100)
  {
    cd =cd-100;
    sd =sd+1;
  } 
  std::cout<<sd<<endl<<cd;
  
  
} 