#include <iostream>
using namespace std;

int main() 
{
  int n;
  cin>>n;
  int arr[100];
  int i = 0;
  while(n>0)
  {
    arr[i++] = n%8;
    n = n/8;
  }
  for(int j = i; j>=0; j--)
    cout<<arr[j];
}