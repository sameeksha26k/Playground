#include <iostream>
int main()
{
  int x,y,op,ans;
  std::cout<<"Enter first number :";
  std::cin>>x;
  
  std::cout<<" Enter second number :";
  std::cin>>y;
  std::cin>>op;
  std::cout<<" Menu\n";
  std::cout<<"1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder";
  
  switch(op)
  {
  	case 1:
      	ans = x+y;
  		std::cout<<"\n"<<ans;
  		break;
    
  	case 2:
        ans = x-y;
  		std::cout<<"\n"<<ans;
  		break;
  	case 3:
        ans = x*y;
  		std::cout<<"\n"<<ans;
  		break;
  	case 4:
        ans = x/y;
  		std::cout<<"\n"<<ans;
  		break;
  	case 5:
        ans = x%y;
  		std::cout<<"\n"<<ans;
  		break;
  	default:
  		std::cout<<"\nInvalid operation";
  }
  return 0;
}
  
  	
  
  