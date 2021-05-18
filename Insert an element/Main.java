#include <iostream>
using namespace std;

int main() 
{
  int n;
  cin>>n;
  int arr[n];
  for(int i=0; i<n; i++)
  {
    cin>>arr[i];
  }
  int pos, num;
  cin>>pos>>num;
  int red_size = n-1;
  int sparearr[red_size];
  int count = 0;
  for(int i=pos-1; i<n; i++)
  {
    sparearr[count++] = arr[i];
  }
  for(int i=0; i<n; i++)
  {
    if(i == pos-1)
    {
      cout<<num<<" ";
      break;
    }
    else
    {
      cout<<arr[i]<<" ";
    }
  }
  for(int i=0; i<count; i++)
  {
    cout<<sparearr[i]<<" ";
  }
}