#include <iostream>
using namespace std;

int main() 
{
  int n,m;
  cin>>n>>m;
  int arr[n][m];
  for(int i = 0; i<n; i++)
  {
    for(int j = 0; j<m; j++)
      cin>>arr[i][j];
  }
  int element, flag = 0;
  cin>>element;
  for(int i = 0; i<n; i++)
  {
    for(int j = 0; j<m; j++)
    {
      if(arr[i][j] == element)
      {
        cout<<"("<<i<<","<<j<<")";
        flag = 1;
        break;
      }
    }
  }
  if(!flag)
    cout<<"("<<"-1"<<","<<"-1"<<")";
}