#include <iostream>
using namespace std;

int digitCount(string str1)
{
  int len = str1.length();
  int count = 0;
  for(int i=0; i<len; i++)
  {
    if(str1[i] == str1[len - i -1])
      count++;
  }
  return count;
}
int main() 
{
  string str;
  cin>>str;
  cout<<digitCount(str);
}