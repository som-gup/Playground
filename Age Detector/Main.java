#include<iostream>
using namespace std;
int main()
{
  int x,y,p,m,z;
  std::cin>>x>>y;
  if(x>y){
    p=x+1900;
    m=y+2000;
    z=m-p;
    std::cout<<z;
  }
  else{
    p=x+2000;
    m=y+2000;
    z=m-p;
    std::cout<<z;
  }
}