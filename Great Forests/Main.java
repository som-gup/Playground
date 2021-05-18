#include <iostream>
using namespace std;

int count = 0;
int n;
char arr[1000][1000];
void count_forest(int i, int j)
{
  if(i<0 || j<0 || i>n || j>n)
    return;
  if(arr[i][j] == 'T')
  {
    arr[i][j] = 'W';
    count++;
    count_forest(i, j-1);
    count_forest(i, j+1);
    count_forest(i-1, j);
    count_forest(i+1, j);
  }
}
int main() 
{
  int max_count = 0;
  cin>>n;
  for(int i=0; i<n; i++)
  {
    for(int j=0; j<n; j++)
      cin>>arr[i][j];
  }
  for(int i=0; i<n; i++)
  {
    for(int j=0; j<n; j++)
    {
      if(arr[i][j] == 'T')
      {
        count_forest(i,j);
        if(max_count<::count)
          max_count = ::count;
        ::count = 0;
      }
    }
  }
  cout<<max_count;
}