#include <iostream>
using namespace std;

int main() 
{
  int n;
  cin>>n;
  int arr[n], flag = 0;
  for(int i=0; i<n; i++)
    cin>>arr[i];
  int num;
  cin>>num;
  for(int i=0; i<n; i++)
  {
    if(arr[i] == num)
    {
      cout<<i+1;
      flag =1;
      break;
    }
  }
  if(!flag)
    cout<<num<<" isn't present in the array.";
}