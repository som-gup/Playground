#include<iostream>
using namespace std;
int main()
{
  int n;
  float t,p;
  std::cin>>n>>t;
  if(n==2){
      p=t+(t*0.5);
      std::cout<<p;
  }
  else if(n<=3){
      p=t+t;
      std::cout<<p;
  }
  else if(n>3)
    std::cout<<"Number of items is more";
  }