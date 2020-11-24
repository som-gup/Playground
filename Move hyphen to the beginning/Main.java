#include <iostream>
using namespace std;

int main() 
{
  string str1;
  cin>>str1;
  string str2 = "";
  string str3 = "";
  for(int i=0; i<str1.length(); i++)
  {
    if(str1[i] == '-')
      str2 = str2 + str1[i];
    else
      str3 = str3 + str1[i];
  }
  str2 = str2 + str3;
  cout<<str2;
}