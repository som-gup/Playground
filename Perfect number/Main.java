#include <iostream>
using namespace std;

bool checkPerfect(int n)
{
  int sum = 1;
  for(int i=2; i<=n/2; i++)
  {
    if(n%i == 0)
      sum += i;
  }
  if(sum == n)
    return true;
  return false;
}
int main() 
{
  int n;
  cin>>n;
  if(checkPerfect(n))
    cout<<"Yes";
  else
    cout<<"No";
}