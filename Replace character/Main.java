#include <iostream>
using namespace std;

int main() 
{
  string s;
  cin>>s;
  char fir;
  cin>>fir;
  char sec;
  cin>>sec;
  for(int i=0; i<s.length(); i++)
  {
    if(s[i] == fir)
      s[i] = sec;
    else if(s[i] == sec)
      s[i] = fir;
  }
  cout<<s;
}