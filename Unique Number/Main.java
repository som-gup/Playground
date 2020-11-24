#include <iostream>
using namespace std;

bool uniquenumber(int n)
{
  bool visited[10] = {0};
  int rem;
  while(n)
  {
    rem = n%10;
    if(visited[rem] == true)
      return false;
    visited[rem] = true;
    n=n/10;
  }
  return true;
}
int main() 
{
  int lower, upper;
  cin>>lower>>upper;
  int count = 0;
  for(int i=lower; i<=upper; i++)
  {
    if(uniquenumber(i))
      count++;
  }
  if(count)
    cout<<count;
  else
    cout<<"No Unique Number";
}