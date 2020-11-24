#include <bits/stdc++.h>
using namespace std;

int main() 
{
  int n;
  cin>>n;
  int arr[n];
  for(int i=0; i<n; i++)
    cin>>arr[i];
  int fa = 0, hal;
  hal = n/2;
  int firarr[hal];
  for(int i=0; i<hal; i++)
    firarr[fa++] = arr[i];
  sort(firarr, firarr+hal);
  for(int i=0; i<hal; i++)
    cout<<firarr[i]<<" ";
  if(n%2 == 0)
  {
    int secarr[hal];
    int sa = 0;
    for(int i=hal; i<n; i++)
      secarr[sa++] = arr[i];
    sort(secarr, secarr+hal, greater<int>());
    for(int i=0; i<hal; i++)
      cout<<secarr[i]<<" ";
  }
  else
  {
    int newhal;
    newhal = hal + 1;
    int secarr[newhal];
    int sa = 0;
    for(int i=newhal - 1; i<n; i++)
      secarr[sa++] = arr[i];
    sort(secarr, secarr+newhal, greater<int>());
    for(int i=0; i<newhal; i++)
      cout<<secarr[i]<<" ";
  }
}