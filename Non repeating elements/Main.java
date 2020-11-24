#include <iostream>
using namespace std;

int main() 
{
  int n, m;
  cin>>n>>m;
  int arr1[n], arr2[m];
  for(int i=0; i<n; i++)
    cin>>arr1[i];
  for(int i=0; i<m; i++)
    cin>>arr2[i];
  int count = 0, innercount = 0;
  for(int i=0; i<n; i++)
  {
    innercount = 0;
    for(int j=0; j<m; j++)
    {
      if(arr1[i] == arr2[j])
        break;
      innercount++;
    }
    if(innercount == m)
    {
      cout<<arr1[i]<<" ";
      count++;
    }
  }
  for(int i=0; i<m; i++)
  {
    innercount = 0;
    for(int j=0; j<n; j++)
    {
      if(arr2[i] == arr1[j])
        break;
      innercount++;
    }
    if(innercount == n)
    {
      cout<<arr2[i]<<" ";
      count++;
    }
  }
  cout<<"\n"<<count;
}