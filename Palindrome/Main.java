#include <iostream>
using namespace std;

int main() 
{
  string str;
  cin>>str;
  int flag = 1;
  int len = str.length();
  for(int i=0; i<len; i++)
  {
    if(str[i] != str[len - i -1])
    {
      flag = 0;
      break;
    }
  }
  if(flag)
    cout<<"1";
  else
    cout<<"0";
}