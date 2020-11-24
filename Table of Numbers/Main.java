#include <iostream>
using namespace std;

int main() 
{
  int num;
  cin>>num;
  int sum = 0;
  for(int i=1; i<=10; i++)
  {
    cout<<num * i<<" ";
    sum = sum+(num*i);
  }
  cout<<endl<<sum;
}