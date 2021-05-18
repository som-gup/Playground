#include <iostream>
using namespace std;

int main() 
{
  string str;
  cin>>str;
  if(str == "break" || str == "case" || str == "continue" || str == "default" || str == "defer" || str == "else" || str == "for" || str == "func" || str == "goto" || str == "if" || str == "map" || str == "range" || str == "return" || str == "struct" || str == "type" || str == "var")
    cout<<str<<" is a keyword";
  else
    cout<<str<<" is not a keyword";
}