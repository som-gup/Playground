#include<iostream>
using namespace std;
int main()
{
  long int number, s=2;
  cin>>number;
  if(number==1||number==2)
    cout<<"0";
  else if(number==3)
    cout<<s;
  else
  {
    for(int i=1; i<number-2; i++)
      s = (s*2 + 2)%10000000007;
    cout<<s;
  }
}