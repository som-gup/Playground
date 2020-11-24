#include<iostream>
using namespace std;
int main()
{
  int a;
  float t;
  std::cin>>a>>t;
  if(a<13){
    if((t>12.00)&&(t<18.00)){
      std::cout<<"$2.00";
    }
    else{
      std::cout<<"$4.00";
    }
  }
  else{
    if((t>12.00)&&(t<18.00)){
      std::cout<<"$5.00";
    }
    else{
      std::cout<<"$8.00";
    }
  }
}