#include <iostream>
using namespace std;

int sumofdigits(int n)
{
  int rem, sum = 0;
  while(n)
  {
    rem = n%10;
    sum += rem;
    n=n/10;
  }
  return sum;
}
int main() 
{
  int n;
  cin>>n;
  int arr[n];
  for(int i=0; i<n; i++)
    cin>>arr[i];
  for(int i=0; i<n; i++)
  {
    cout<<sumofdigits(arr[i])<<" ";
  }
}