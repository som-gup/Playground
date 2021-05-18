#include<bits/stdc++.h>
using namespace std;

int main()
{
  string number;
  long int divisor;
  int flag = 0;
  cin>>number>>divisor;
  number.erase(remove(number.begin(), number.end(), '0'),number.end());
  sort(number.begin(), number.end());
  do
  {
    stringstream strtoint(number);
    long int newnum = 0;
    strtoint>>newnum;
    if(newnum%divisor == 0)
    {
      flag = 1;
      break;
    }
  }while(next_permutation(number.begin(), number.end()));
  if(flag == 0)
    cout<<"-1";
  else
    cout<<number;
}