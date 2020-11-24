#include <bits/stdc++.h>
using namespace std;

int main() 
{
  string str;
  cin>>str;
  int len, powof10 = 0, outnum = 0, val;
  len = str.length() - 1;
  for(int i=len; i>=0; i--)
  {
    if(str[i] >= '0' && str[i] <= '9')
      val = (str[i] - 48);
    else if(str[i] >= 'a' && str[i] <= 'g')
      val = (str[i] - 97 + 10);
    else if(str[i] >= 'A' && str[i] <= 'G')
      val = (str[i] - 65 + 10);
    outnum = outnum + val*pow(17, powof10);
    powof10++;
  }
  cout<<outnum;
}