#include <iostream>
using namespace std;

int main() 
{
  int tests;
  cin>>tests;
  while(tests--)
  {
    int n;
    cin>>n;
    int a[n];
    for(int i=0; i<n; i++)
      cin>>a[i];
    int start = 0, end = n-1, count = 0;
    while(start<end)
    {
      if(a[start] == a[end])
      {
        start++;
        end--;
      }
      if(a[start] > a[end])
      {
        a[end-1] = a[end - 1] + a[end];
        end--;
        count++;
      }
      else if(a[start] < a[end])
      {
        a[start + 1] = a[start+1] +a[start];
        start++;
        count++;
      }
    }
    cout<<count<<endl;
  }
}