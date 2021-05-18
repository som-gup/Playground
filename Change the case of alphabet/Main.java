#include <iostream>
using namespace std;

int main() 
{
  char ch;
  cin>>ch;
  int n;
  if(ch >= 'a' && ch <= 'z')
  {
    n = ch - 97;
    cout<<(char)(65 + n);
  }
  else
  {
    n = ch - 65;
    cout<<(char)(97 + n);
  }
}