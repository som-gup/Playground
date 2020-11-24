#include <bits/stdc++.h>
using namespace std;

int main() 
{
  int n;
  cin>>n;
  int arr[100];
  int count = 0, divcount = 0, sum = 0;
  while(n)
  {
    arr[count++] = n%10;
    n=n/10;
  }
  reverse(arr, arr+count);
  for(int i=0; i<count; i++)
  {
    sum = arr[i];
    for(int j=i+1; j<count; j++)
    {
      sum = sum*10 + arr[j];
      if(sum%11 == 0)
        divcount++;
    }
    sum = 0;
  }
  cout<<divcount;
}