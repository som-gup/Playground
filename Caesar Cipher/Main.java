#include <iostream>
using namespace std;

int main() 
{
  string str;
  string str2 = "";
  cin>>str;
  int k = 3;
  int val;
  for(int i = 0; i<str.length(); i++)
  {
    k = 3;
    val = int(str[i]);
    if(val + k > 122)
    {
      k = k - (122 - val);
      str2 = str2 + char(96 + k);
    }
    else
    {
      val = val + k;
      str2 = str2 + char(val);
    }
  }
  cout<<str2;
}