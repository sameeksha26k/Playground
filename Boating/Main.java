#include<iostream>
using namespace std;
int main()
{
  int weight;
  int adults;
  int child;
  std::cin>>weight;
  std::cin>>adults;
  std::cin>>child;
  int adult_weight = adults*75;
  int child_weight = child*30;
  int tot = adult_weight + child_weight;
  if(tot<=weight)
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
  
}