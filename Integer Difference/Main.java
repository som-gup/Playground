#include <bits/stdc++.h>
using namespace std;

int main() 
{
  int no;
  cin>>no;
  int arr[no];
  for(int i=0; i<no; i++)
    cin>>arr[i];
  int n, m;
  cin>>n>>m;
  for(int i=0; i<no; i++)
  {
    if(arr[i] - n < m)
       arr[i]++;
  }
  for(int i=0; i<no; i++)
    cout<<arr[i]<<" ";
       
       
}