#include <iostream>
using namespace std;

int main() 
{
  int n;
  cin>>n;
  int arr[n][n];
  for(int i=0; i<n; i++)
  {
    for(int j=0; j<n; j++)
      cin>>arr[i][j];
  }
  int count = 0, max = 0, row;
  for(int i=0; i<n; i++)
  {
    count = 0;
    for(int j=0; j<n; j++)
    {
      if(arr[i][j] == 0)
        count++;
    }
    if(count > max)
    {
      max = count;
      row = i+1;
    }
  }
  cout<<"Row = "<<row<<", "<<"count = "<<max;
}