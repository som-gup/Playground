#include <bits/stdc++.h>
using namespace std;

int main() 
{
  int arr[4];
  for(int i=0; i<4; i++)
    cin>>arr[i];
  cout<<*min_element(arr, arr+4);
}