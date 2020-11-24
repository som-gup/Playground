#include <iostream>
using namespace std;

int main() 
{
  char ch;
  cin>>ch;
  int n;
  cin>>n;
  if(ch>='A' && ch<= 'Z')
  {
    char enc;
    enc = ((ch - 65) + n)%26;
    cout<<(char)(enc + 65);    
  }
  else
  {
    char enc;
    enc = ((ch - 97) + n)%26;
    cout<<(char)(enc + 97);  
  }
}