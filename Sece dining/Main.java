#include<iostream>
using namespace std;
int main()
{
  std::string x;
  int y;
  std::cin>>x>>y;
  if(x=="front" || x=="FRONT"){
    if(y==1){
      std::cout<<"Left Handed";
    }
    else{
      std::cout<<"Right Handed";
    }
  }
  else if(x=="rear" || x=="REAR"){
    if(y==1){
      std::cout<<"Right Handed";
    }
    else{
      std::cout<<"Left Handed";
    }
  }
}
